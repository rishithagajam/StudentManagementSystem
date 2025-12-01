package main.java.com.studentmanagementsystem.view;

import main.java.com.studentmanagementsystem.model.Department;

import java.util.List;
import java.util.Scanner;

public class DepartmentView {
  private final Scanner scanner;
  private int deptid;
  private String deptname;
  private String deptcode;

  public DepartmentView() {
    scanner = new Scanner(System.in);
  }

  public void showMenu() {
    System.out.println("==== Department Management System ====");
    System.out.println("1. Add Department");
    System.out.println("2. Update Department");
    System.out.println("3. Delete Department");
    System.out.println("4. Get Department by id");
    System.out.println("5. Get All Departments");
    System.out.println("0. Exit");
  }

  public int getInput(String prompt) {
    System.out.print(prompt);
    return scanner.nextInt();
  }

  public Department getInputDepartment() {
    System.out.println("Enter Department Details:");
    System.out.print("Department id: ");
    int deptid = scanner.nextInt();
    scanner.nextLine();
    System.out.print("name: ");
    String deptname = scanner.nextLine();
    System.out.print("code: ");
    String deptcode = scanner.nextLine();

    return new Department(deptid, deptname, deptcode);
  }

  public void showMessage(String message) {
    System.out.println(message);
  }

  public void showDepartmentDetails(Department department) {
    System.out.println("Department Details:");
    System.out.println("id: " + department.getDeptid());
    System.out.println("name: " + department.getDeptname());
    System.out.println("code: " + department.getDeptcode());
  }

  public void showAllDepartments(List<Department> departments) {
    if (departments.isEmpty()) {
      System.out.println("No departments found.");
    } else {
      System.out.println("All Departments:");
      for (Department department : departments) {
        System.out.println("id: " + department.getDeptid() + ", name: " + department.getDeptname());
      }
    }
  }
}
