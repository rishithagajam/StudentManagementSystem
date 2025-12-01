package main.java.com.studentmanagementsystem.data.query;

/**
 * The `CourseQueryConstants` class provides SQL query constants for course-related operations.
 * These constants represent SQL statements for inserting, updating, deleting, and retrieving course records.
 */
public class CourseQueryConstants {

  /**
   * SQL query to insert a new course record into the 'course' table.
   * Parameters: C_id, C_name, C_duration, C_credit.
   */
	public static final String INSERT_COURSE =
	        "INSERT INTO courses (C_id, C_name,  C_duration , C_credit) VALUES (?, ?, ?, ?)";

	public static final String UPDATE_COURSE =
	        "UPDATE courses SET C_name = ?, C_duration=?,  C_credit = ? WHERE C_id = ?";

	public static final String DELETE_COURSE =
	        "DELETE FROM courses WHERE C_id = ?";

	public static final String GET_COURSE_BY_ID =
	        "SELECT C_id, C_name,  C_duration, C_credit FROM courses WHERE C_id = ?";

	public static final String GET_ALL_COURSES =
	        "SELECT C_id, C_name, C_duration,  C_credit FROM courses";

}
