package main.java.com.studentmanagementsystem.model;

/**
 * The `Student` class represents a student in the student management system.
 */
public class Student {

    private int studentId;
    private String name;
    private String contact;
    private String email;
    private int enroll_year; // store only year as INT

    // Parameterized Constructor
    public Student(int studentId, String name, String contact, String email, int enroll_year) {
        this.studentId = studentId;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.enroll_year = enroll_year;
    }

    // Default Constructor
    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public int getEnroll_year() {
        return enroll_year;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // FIXED: Correct setter for INT year
    public void setEnroll_year(int enroll_year) {
        this.enroll_year = enroll_year;
    }

    @Override
    public String toString() {
        return "Student(studentId=" + studentId +
                ", name=" + name +
                ", contact=" + contact +
                ", email=" + email +
                ", enroll_year=" + enroll_year + ")";
    }
}
