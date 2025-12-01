package main.java.com.studentmanagementsystem.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ConfigLoader loads configuration from resources using ClassLoader,
 * which works correctly inside IDEs, JAR files, and deployment servers.
 */
public class ConfigLoader {

    private static volatile ConfigLoader instance;
    private final Properties properties;

    private ConfigLoader(String resourceName) {
        properties = new Properties();

        try (InputStream input = getClass().getClassLoader().getResourceAsStream(resourceName)) {

            if (input == null) {
                throw new RuntimeException("config.properties not found in resources folder: " + resourceName);
            }

            properties.load(input);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config.properties: " + e.getMessage(), e);
        }
    }

    public static ConfigLoader getInstance(String resourceName) {
        if (instance == null) {
            synchronized (ConfigLoader.class) {
                if (instance == null) {
                    instance = new ConfigLoader(resourceName);
                }
            }
        }
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
