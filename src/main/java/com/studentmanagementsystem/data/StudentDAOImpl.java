package main.java.com.studentmanagementsystem.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.com.studentmanagementsystem.data.query.StudentQueryConstants;
import main.java.com.studentmanagementsystem.model.Student;
import main.java.com.studentmanagementsystem.util.DatabaseManager;

public class StudentDAOImpl implements StudentDAO {

    private final DatabaseManager databaseManager;

    public StudentDAOImpl() {
        databaseManager = DatabaseManager.getInstance();
    }

    @Override
    public void addStudent(Student student) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = databaseManager.getConnection();
            ps = connection.prepareStatement(StudentQueryConstants.INSERT_STUDENT);

            ps.setInt(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getContact());
            ps.setString(4, student.getEmail());
            ps.setInt(5, student.getEnroll_year()); // FIX: correct getter

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            databaseManager.closeResources(null, ps);
            databaseManager.releaseConnection(connection);
        }
    }

    @Override
    public void updateStudent(Student student) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = databaseManager.getConnection();
            ps = connection.prepareStatement(StudentQueryConstants.UPDATE_STUDENT);

            ps.setString(1, student.getName());
            ps.setString(2, student.getContact());
            ps.setString(3, student.getEmail());
            ps.setInt(4, student.getEnroll_year()); // FIX

            ps.setInt(5, student.getStudentId());
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            databaseManager.closeResources(null, ps);
            databaseManager.releaseConnection(connection);
        }
    }

    @Override
    public void deleteStudent(int id) {
        Connection connection = null;
        PreparedStatement ps = null;

        try {
            connection = databaseManager.getConnection();
            ps = connection.prepareStatement(StudentQueryConstants.DELETE_STUDENT);

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            databaseManager.closeResources(null, ps);
            databaseManager.releaseConnection(connection);
        }
    }

    @Override
    public Student getStudentById(int id) {
        Student student = null;
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = databaseManager.getConnection();
            ps = connection.prepareStatement(StudentQueryConstants.GET_STUDENT_BY_ID);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            if (rs.next()) {
                student = extractStudentFromResultSet(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            databaseManager.closeResources(rs, ps);
            databaseManager.releaseConnection(connection);
        }

        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            connection = databaseManager.getConnection();
            ps = connection.prepareStatement(StudentQueryConstants.GET_ALL_STUDENTS);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student student = extractStudentFromResultSet(rs);
                students.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            databaseManager.closeResources(rs, ps);
            databaseManager.releaseConnection(connection);
        }

        return students;
    }

    private Student extractStudentFromResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("student_id");
        String name = rs.getString("name");
        String contact = rs.getString("contact");
        String email = rs.getString("email");
        int enrollYear = rs.getInt("enroll_year"); // INT

        Student student = new Student();
        student.setStudentId(id);
        student.setName(name);
        student.setContact(contact);
        student.setEmail(email);
        student.setEnroll_year(enrollYear); // FIXED correct setter

        return student;
    }
}
