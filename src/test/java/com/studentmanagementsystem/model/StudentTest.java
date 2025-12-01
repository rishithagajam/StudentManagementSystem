package test.java.com.studentmanagementsystem.model;

import main.java.com.studentmanagementsystem.model.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student();
    }

    @Test
    public void testGetAndSetStudentId() {
        student.setStudentId(12345);
        assertEquals(12345, student.getStudentId());
    }

    @Test
    public void testGetAndSetName() {
        student.setName("John Doe");
        assertEquals("John Doe", student.getName());
    }

    @Test
    public void testGetAndSetContact() {
        student.setContact("123-456-7890");
        assertEquals("123-456-7890", student.getContact());
    }

    @Test
    public void testGetAndSetEmail() {
        student.setEmail("john@example.com");
        assertEquals("john@example.com", student.getEmail());
    }

    @Test
    public void testGetAndSetEnrollYear() {
        student.setEnroll_year(2023);
        assertEquals(2023, student.getEnroll_year());
    }

    @Test
    public void testToString() {
        student.setStudentId(12345);
        student.setName("John Doe");
        student.setContact("123-456-7890");
        student.setEmail("john@example.com");
        student.setEnroll_year(2023);

        String expected = "Student(studentId=12345, name=John Doe, contact=123-456-7890, email=john@example.com, enroll_year=2023)";
        assertEquals(expected, student.toString());
    }
}
