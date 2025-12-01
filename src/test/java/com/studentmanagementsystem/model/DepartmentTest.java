package test.java.com.studentmanagementsystem.model;

import main.java.com.studentmanagementsystem.model.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartmentTest {

  private Department department;

  @BeforeEach
  public void setUp() {
    department = new Department(1, "Computer Science", "CSE");
  }

  @Test
  public void testGetDeptid() {
    assertEquals(1, department.getDeptid());
  }

  @Test
  public void testGetDeptname() {
    assertEquals("Computer Science", department.getDeptname());
  }

  @Test
  public void testGetDeptcode() {
    assertEquals("CSE", department.getDeptcode());
  }

  @Test
  public void testSetDeptid() {
    department.setDeptid(2);
    assertEquals(2, department.getDeptid());
  }

  @Test
  public void testSetDeptname() {
    department.setDeptname("Physics");
    assertEquals("Physics", department.getDeptname());
  }

  @Test
  public void testSetDeptcode() {
    department.setDeptcode("Science");
    assertEquals("Prof. Johnson", department.getDeptcode());
  }

  @Test
  public void testToString() {
    String expected = "Department(deptid=1, deptname=Computer Science, deptcode=CSE)";
    assertEquals(expected, department.toString());
  }
}
