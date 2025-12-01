package main.java.com.studentmanagementsystem.model;

import java.util.Date;

/**
 * The `Exam` class represents an exam in the student management system.
 * Each exam has an exam date, a total mark, an exam type, and an exam location.
 *
 * <p>This class serves as a data structure to hold information about exams within
 * the student management system. It encapsulates the essential attributes of an exam
 * and provides methods to access and modify these attributes.
 */
public class Exam {

  private int examID;
  private Date examDate;
  private int totalMark;
  private String examType;
  private int examRoomNo;

  /**
   * Parameterized constructor for the `Exam` class.
   *
   * @param examID     The unique identifier of the exam.
   * @param examDate   The date of the exam.
   * @param totalMark  The total mark of the exam.
   * @param examType   The type of the exam.
   * @param string The room number where the exam is conducted.
   *
   * <p>This constructor creates an instance of the `Exam` class with provided attribute values.
   * It allows for the convenient creation of exam objects with specific details.
   */
  public Exam(int examID, Date examDate, int totalMark, String examType, int string) {
    this.examID = examID;
    this.examDate = examDate;
    this.totalMark = totalMark;
    this.examType = examType;
    this.examRoomNo = string;
  }

  /**
   * Default constructor for the `Exam` class.
   *
   * <p>This constructor initializes an empty instance of the `Exam` class.
   * The attributes are set to default values or remain uninitialized.
   */
  public Exam() {
  }

  public Exam(int examID2, Date examDate2, int totalMark2, String examType2, String string) {
	// TODO Auto-generated constructor stub
}

  /**
   * Gets the unique identifier of the exam.
   *
   * @return The exam identifier.
   */
  public int getExamID() {
    return this.examID;
  }

  /**
   * Gets the date of the exam.
   *
   * @return The exam date.
   */
  public Date getExamDate() {
    return this.examDate;
  }

  /**
   * Gets the total mark of the exam.
   *
   * @return The total mark of the exam.
   */
  public int getTotalMark() {
    return this.totalMark;
  }

  /**
   * Gets the type of the exam.
   *
   * @return The exam type.
   */
  public String getExamType() {
    return this.examType;
  }

  /**
   * Gets the room number where the exam is conducted.
   *
   * @return The exam room number.
   */
  public int getExamRoomNo() {
    return this.examRoomNo;
  }

  /**
   * Sets the unique identifier of the exam.
   *
   * @param examID The exam identifier.
   */
  public void setExamID(int examID) {
    this.examID = examID;
  }

  /**
   * Sets the date of the exam.
   *
   * @param examDate The exam date.
   */
  public void setExamDate(Date examDate) {
    this.examDate = examDate;
  }

  /**
   * Sets the total mark of the exam.
   *
   * @param totalMark The total mark of the exam.
   */
  public void setTotalMark(int totalMark) {
    this.totalMark = totalMark;
  }

  /**
   * Sets the type of the exam.
   *
   * @param examType The exam type.
   */
  public void setExamType(String examType) {
    this.examType = examType;
  }

  /**
   * Sets the room number where the exam is conducted.
   *
   * @param string The exam room number.
   */
  public void setExamRoomNo(int string) {
    this.examRoomNo = string;
  }

  /**
   * Generates a string representation of the `Exam` object.
   *
   * @return A string representation of the `Exam` object.
   */
  public String toString() {
    return "Exam(examID=" + this.getExamID() + ", examDate=" + this.getExamDate() + ", totalMark="
        + this.getTotalMark() + ", examType=" + this.getExamType() + ", examRoomNo="
        + this.getExamRoomNo() + ")";
  }

  public void setExamRoomNo(String string) {
	// TODO Auto-generated method stub
	
  }
}
