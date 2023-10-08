package com.accelerex.studentmanagementsystem;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // Create a teacher
      System.out.println("Enter teacher's information:");
      Teacher teacher = createTeacher(scanner);

      // Create a student
      System.out.println("\nEnter student's information:");
      Student student = createStudent(scanner);

      // Create a course
      System.out.println("\nEnter course information:");
      Course course = createCourse(scanner);

      // Enroll the student in the course
      student.enrollInCourse(course);

      // Display teacher, student, and course information
      System.out.println("\nTeacher Information:");
      teacher.displayInfo();

      System.out.println("\nStudent Information:");
      student.displayInfo();

      System.out.println("\nCourse Information:");
      course.displayInfo();

      // Record grades for the student
      Grade grade = createGrade(student, course, scanner);

      // Display the recorded grade
      System.out.println("\nGrade Information:");
      System.out.println("Student: " + grade.getStudent().getName());
      System.out.println("Course: " + grade.getCourse().getTitle());
      System.out.println("Score: " + grade.getScore());

      scanner.close();
   }

   private static Teacher createTeacher(Scanner scanner) {
      System.out.print("Enter teacher's ID: ");
      int id = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character
      System.out.print("Enter teacher's name: ");
      String name = scanner.nextLine();
      System.out.print("Enter teacher's age: ");
      int age = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character
      System.out.print("Enter teacher's address: ");
      String address = scanner.nextLine();
      System.out.print("Enter teacher's specialization: ");
      String specialization = scanner.nextLine();
      return new Teacher(id, name, age, address, specialization);
   }

   private static Student createStudent(Scanner scanner) {
      System.out.print("Enter student's ID: ");
      int id = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character
      System.out.print("Enter student's name: ");
      String name = scanner.nextLine();
      System.out.print("Enter student's age: ");
      int age = scanner.nextInt();
      scanner.nextLine(); // Consume the newline character
      System.out.print("Enter student's address: ");
      String address = scanner.nextLine();
      return new Student(id, name, age, address);
   }

   private static Course createCourse(Scanner scanner) {
      System.out.print("Enter course code: ");
      String courseCode = scanner.nextLine();
      System.out.print("Enter course title: ");
      String title = scanner.nextLine();
      System.out.print("Enter instructor: ");
      String instructor = scanner.nextLine();
      System.out.print("Enter schedule: ");
      String schedule = scanner.nextLine();
      return new Course(courseCode, title, instructor, schedule);
   }

   private static Grade createGrade(Student student, Course course, Scanner scanner) {
      Grade grade = new Grade(student, course);
      grade.setScore();
      return grade;
   }
}