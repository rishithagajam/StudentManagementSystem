package main.java.com.studentmanagementsystem.data.query;

/**
 * The `DepartmentQueryConstants` class provides SQL query constants for department-related operations.
 * These constants represent SQL statements for inserting, updating, deleting, and retrieving department records.
 */
public class DepartmentQueryConstants {

  /**
   * SQL query to insert a new department record into the 'department' table.
   * Parameters: dept_id, name, code
   */
  public static final String INSERT_DEPARTMENT = "INSERT INTO departments (dept_id, name, code) VALUES (?, ?, ?)";

  /**
   * SQL query to update an existing department record in the 'department' table.
   * Parameters: name, code, dept_id
   */
  public static final String UPDATE_DEPARTMENT = "UPDATE department SET name = ?, code = ? WHERE dept_id = ?";

  /**
   * SQL query to delete a department record from the 'department' table by department dept_id.
   * Parameters: dept_id
   */
  public static final String DELETE_DEPARTMENT = "DELETE FROM department WHERE dept_id = ?";

  /**
   * SQL query to retrieve specific department information from the 'department' table by department id.
   * Parameters: dept_id
   */
  public static final String GET_DEPARTMENT_BY_dept_id1 = "SELECT * FROM departments WHERE dept_id = ?";

  /**
   * SQL query to retrieve all department records from the 'department' table.
   */
  public static final String GET_ALL_DEPARTMENTS = "SELECT * FROM departments";

  public static String GET_DEPARTMENT_BY_dept_id;
}
