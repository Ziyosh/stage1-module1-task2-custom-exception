package com.epam.mjc;

public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentNotFoundException {
    for (long student : IDs) {
      if (student == studentID) {
        return Student.getValueOf(studentID);
      }
    }
    throw new StudentNotFoundException("Could not find student with ID " + studentID);
  }

  public static void main(String[] args) {

    StudentManager manager = new StudentManager();
    try {
      for (long studentID: IDs) {
        Student student = manager.find(studentID);
        if(student != null) {
          System.out.println("Student name " + student.getName());
        }else {
          System.out.println("Could not find student with ID " + studentID);
        }
      }
    }catch (StudentNotFoundException e){
      System.out.println(e.getMessage());
    }
  }
}