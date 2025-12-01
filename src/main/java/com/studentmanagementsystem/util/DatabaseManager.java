package main.java.com.studentmanagementsystem.util;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DatabaseManager {

    private static final DatabaseManager instance = new DatabaseManager();

    private final String url;
    private final String user;
    private final String password;

    private final BlockingQueue<Connection> connectionPool = new LinkedBlockingQueue<>();
    private final int maxPoolSize = 10;

    private DatabaseManager() {
        String loadedUrl;
        String loadedUser;
        String loadedPassword;

        try {
            // Load config.properties from classpath
            ConfigLoader configLoader = ConfigLoader.getInstance("config.properties");

            loadedUrl = configLoader.getProperty("db.url");
            loadedUser = configLoader.getProperty("db.username");
            loadedPassword = configLoader.getProperty("db.password");

            if (loadedUrl == null || loadedUser == null || loadedPassword == null) {
                throw new RuntimeException("Database configuration missing in config.properties");
            }

            url = loadedUrl;
            user = loadedUser;
            password = loadedPassword;

            // Initialize pool
            initializeConnectionPool();

        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize DatabaseManager: " + e.getMessage(), e);
        }
    }

    public static DatabaseManager getInstance() {
        return instance;
    }

    public static void resetInstance() {
        try {
            Field inst = DatabaseManager.class.getDeclaredField("instance");
            inst.setAccessible(true);
            inst.set(null, null);
        } catch (Exception ignored) {}
    }

    private void initializeConnectionPool() throws SQLException {
        for (int i = 0; i < maxPoolSize; i++) {
            connectionPool.add(createNewConnection());
        }
    }

    private Connection createNewConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public synchronized Connection getConnection() throws SQLException {
        if (connectionPool.isEmpty()) {
            return createNewConnection();
        }
        return connectionPool.poll();
    }

    public void releaseConnection(Connection connection) {
        if (connection != null) {
            connectionPool.offer(connection);
        }
    }

    public void closeResources(ResultSet resultSet, PreparedStatement preparedStatement) {
        close(resultSet);
        close(preparedStatement);
    }

    public void closeConnection(Connection connection) {
        close(connection);
    }

    public void close() {
        List<Connection> connectionsToRelease = new ArrayList<>(connectionPool);
        for (Connection connection : connectionsToRelease) {
            closeConnection(connection);
        }
        connectionPool.clear();
    }

    private void close(AutoCloseable res) {
        try {
            if (res != null) res.close();
        } catch (Exception ignored) {}
    }

    public boolean isConnectionClosed(Connection connection) {
        return !connectionPool.contains(connection);
    }

    private boolean validateConnection(Connection connection) {
        try {
            return connection != null && !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    private void adjustPoolSize() throws SQLException {
        if (connectionPool.size() < maxPoolSize) {
            int toAdd = maxPoolSize - connectionPool.size();
            for (int i = 0; i < toAdd; i++) {
                connectionPool.offer(createNewConnection());
            }
        }
    }

    public void shutdown() {
        for (Connection connection : connectionPool) {
            closeConnection(connection);
        }
        connectionPool.clear();
    }
}
