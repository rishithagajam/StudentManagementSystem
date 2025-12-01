package main.java.com.studentmanagementsystem.view;

import java.util.List;
import java.util.Scanner;
import main.java.com.studentmanagementsystem.model.Student;

public class StudentView {
    private final Scanner scanner;

    public StudentView() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("==== Student Management System ====");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Get Student by ID");
        System.out.println("5. Get All Students");
        System.out.println("0. Exit");
    }

    public int getInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public Student getInputStudent() {
        System.out.println("Enter Student Details:");

        System.out.print("Student ID: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid ID. Enter a number.");
            scanner.next();
        }
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Contact: ");
        String contact = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Enroll Year (yyyy): ");
        int enrollYear = 0;
        while (true) {
            String yearStr = scanner.nextLine().trim();
            try {
                enrollYear = Integer.parseInt(yearStr);
                if (enrollYear < 1900 || enrollYear > 3000) {
                    System.out.print("Invalid year. Enter a valid year (e.g., 2023): ");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Enter year like 2023: ");
            }
        }

        Student student = new Student();
        student.setStudentId(studentId);
        student.setName(name);
        student.setContact(contact);
        student.setEmail(email);

        // FIXED: Correct setter method
        student.setEnroll_year(enrollYear);

        return student;
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showStudentDetails(Student student) {
        System.out.println("Student Details:");
        System.out.println("ID: " + student.getStudentId());
        System.out.println("Name: " + student.getName());
        System.out.println("Contact: " + student.getContact());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Enroll Year: " + student.getEnroll_year());
    }

    public void showAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("All Students:");
            for (Student student : students) {
                System.out.println("ID: " + student.getStudentId() +
                                   ", Name: " + student.getName());
            }
        }
    }
}
