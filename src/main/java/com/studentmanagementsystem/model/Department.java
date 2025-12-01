package main.java.com.studentmanagementsystem.model;

/**
 * The `Department` class represents a department in the student management system.
 * Each department has a department identifier, a department name, and a department head.
 *
 * <p>This class serves as a data structure to hold information about departments within
 * the student management system. It encapsulates the essential attributes of a department
 * and provides methods to access and modify these attributes.
 */
public class Department {

  private int deptid;
  private String deptname;
  private String deptcode;

  /**
   * Parameterized constructor for the `Department` class.
   *
   * @param deptid   The unique identifier of the department.
   * @param deptName The name of the department.
   * @param deptcode The code of the department.
   *
   * <p>This constructor creates an instance of the `Department` class with provided
   * attribute values. It allows for the convenient creation of department objects with
   * specific details.
   */
  public Department(int deptid, String deptname, String deptcode) {
    this.deptid = deptid;
    this.deptname = deptname;
    this.deptcode = deptcode;
  }

  /**
   * Default constructor for the `Department` class.
   *
   * <p>This constructor initializes an empty instance of the `Department` class.
   * The attributes are set to default values or remain uninitialized.
   */
  public Department() {
  }

  /**
   * Gets the unique identifier of the department.
   *
   * @return The department identifier.
   */
  public int getDeptid() {
    return this.deptid;
  }

  /**
   * Gets the name of the department.
   *
   * @return The name of the department.
   */
  public String getDeptname() {
    return this.deptname;
  }

  /**
   * Gets the code of the department.
   *
   * @return The department code.
   */
  public String getDeptcode() {
    return this.deptcode;
  }

  /**
   * Sets the unique identifier of the department.
   *
   * @param deptid The department identifier.
   */
  public void setDeptid(int deptid) {
    this.deptid = deptid;
  }

  /**
   * Sets the name of the department.
   *
   * @param deptname The name of the department.
   */
  public void setDeptname(String deptname) {
    this.deptname = deptname;
  }

  /**
   * Sets the code of the department.
   *
   * @param deptcode The department code.
   */
  public void setDeptcode(String deptcode) {
    this.deptcode = deptcode;
  }

  /**
   * Generates a string representation of the `Department` object.
   *
   * @return A string representation of the `Department` object.
   */
  public String toString() {
    return "Department(deptid=" + this.getDeptid() + ", deptname=" + this.getDeptname()
        + ", deptcode=" + this.getDeptcode() + ")";
  }

  
  }
