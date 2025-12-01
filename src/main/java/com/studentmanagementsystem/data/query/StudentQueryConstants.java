package main.java.com.studentmanagementsystem.data.query;

/**
 * The `StudentQueryConstants` class provides SQL query constants for student-related operations.
 * These constants represent SQL statements for inserting, updating, deleting, and retrieving student records.
 */
public class StudentQueryConstants {

    /**
     * SQL query to insert a new student record into the 'student' table.
     * Parameters: S_ID, S_name, S_mail, S_contact, enroll_year
     */
    public static final String INSERT_STUDENT = "INSERT INTO student(student_id, name, contact, email, enroll_year) VALUES (?, ?, ?, ?, ?)";

    /**
     * SQL query to update an existing student record in the 'student' table.
     * Parameters: name, email, contact, enroll_year, student_id
     */
    public static final String UPDATE_STUDENT = "UPDATE student SET name = ?, email = ?, contact = ?, enroll_year = ? WHERE student_id = ?";

    /**
     * SQL query to delete a student record from the 'student' table by student ID.
     * Parameters: student_id
     */
    public static final String DELETE_STUDENT = "DELETE FROM student WHERE student_id = ?";

    /**
     * SQL query to retrieve specific student information from the 'student' table by student ID.
     * Parameters: student_id
     */
    public static final String GET_STUDENT_BY_ID = "SELECT * FROM student WHERE student_id = ?";

    /**
     * SQL query to retrieve all student records from the 'student' table.
     */
    public static final String GET_ALL_STUDENTS = "SELECT * FROM student";
}
