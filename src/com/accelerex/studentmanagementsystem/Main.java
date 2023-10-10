package com.accelerex.studentmanagementsystem;

import java.util.InputMismatchException;
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

      boolean continueRecording = true;

      Grade grade;
      while (continueRecording)

      // Record grades for the student
      {
      }
      grade = createGrade(student, course, scanner);

      // Display the recorded grade
      System.out.println("\nGrade Information:");
      System.out.println("Student: " + grade.getStudent().getName());
      System.out.println("Course: " + grade.getCourse().getTitle());
      System.out.println("Score: " + grade.getScore());

      System.out.println("\nDo you want to record grades for another student in this course? (yes/no): ");
      String response = scanner.nextLine();
      if (!response.equalsIgnoreCase("yes")) {
         continueRecording = false;
      }

      scanner.close();
   }

   private static Teacher createTeacher(Scanner scanner) {
      int teacherId = 0; // Reuse the 'id' variable
      String teacherName = "";
      int teacherAge = 0;
      String teacherAddress = "";
      String specialization = "";

      while (true) {
         try {
            System.out.print("Enter teacher's ID: ");
            teacherId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            break; // Exit the loop if ID input is valid
         } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input for teacher's ID. Please enter a valid integer.");
            scanner.nextLine(); // Consume the invalid input
         }
      }


      while (true) {
         try {
            System.out.print("Enter teacher's name: ");
            teacherName = scanner.nextLine();

            // Check if the name contains only alphabetic characters
            if (!teacherName.matches("[a-zA-Z]+")) {
               throw new Exception("Invalid input. Name must contain only alphabetic characters.");
            }
            break; // Exit the loop if name input is valid
         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }

      while (true) {
         try {
            System.out.print("Enter teacher's age: ");
            teacherAge = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            break; // Exit the loop if age input is valid
         } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input for teacher's age. Please enter a valid integer.");
            scanner.nextLine(); // Consume the invalid input
         }
      }
      while (true) {
         try {
            System.out.print("Enter teacher's address: ");
            teacherAddress = scanner.nextLine();
            break; // Exit the loop if address input is valid
         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }
      while (true) {
         try {
            System.out.print("Enter teacher's specialization: ");
            specialization = scanner.nextLine();
            break; // Exit the loop if specialization input is valid
         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }

      return new Teacher(teacherId, teacherName, teacherAge, teacherAddress, specialization);
   }


   private static Student createStudent(Scanner scanner) {
         int studentId = 0;
         String studentName = "";
         int studentAge = 0;
         String studentAddress = "";

// Input for student's ID
         while (true) {
            try {
               System.out.print("Enter student's ID: ");
               studentId = scanner.nextInt();
               scanner.nextLine(); // Consume the newline character
               break; // Exit the loop if ID input is valid
            } catch (InputMismatchException e) {
               System.out.println("Error: Invalid input for student's ID. Please enter a valid integer.");
               scanner.nextLine(); // Consume the invalid input
            }
         }

// Input for student's name
      while (true) {
         try {
            System.out.print("Enter student's name: ");
            studentName = scanner.nextLine();

            // Check if the name contains only alphabetic characters
            if (!studentName.matches("[a-zA-Z]+")) {
               throw new Exception("Invalid input. Name must contain only alphabetic characters.");
            }
            break; // Exit the loop if name input is valid
         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }
// Input for student's age
         while (true) {
            try {
               System.out.print("Enter student's age: ");
               studentAge = scanner.nextInt();
               scanner.nextLine(); // Consume the newline character
               break; // Exit the loop if age input is valid
            } catch (InputMismatchException e) {
               System.out.println("Error: Invalid input for student's age. Please enter a valid integer.");
               scanner.nextLine(); // Consume the invalid input
            }
         }

// Input for student's address
      while (true) {
         try {
            System.out.print("Enter student's address: ");
            studentAddress = scanner.nextLine();
            break; // Exit the loop if address input is valid
         } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
         }
      }
         return new Student(studentId, studentName, studentAge, studentAddress);

      }
         private static Course createCourse(Scanner scanner) {
      String courseCode = "";
      String title = "";
      String instructor = "";
      String schedule = "";

      while (true) {
         try {
            System.out.print("Enter course code: ");
            courseCode = scanner.nextLine();
            System.out.print("Enter course title: ");
            title = scanner.nextLine();
            System.out.print("Enter instructor: ");
            instructor = scanner.nextLine();
            System.out.print("Enter schedule: ");
            schedule = scanner.nextLine();

            // If we reach this point, input is valid, break out of the loop
            break;
         } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
         }
      }

      return new Course(courseCode, title, instructor, schedule);
   }

   private static Grade createGrade(Student student, Course course, Scanner scanner) {
      Grade grade = new Grade(student, course);

      while (true) {
         try {
            grade.setScore();
            // If we reach this point, input is valid, break out of the loop
            break;
         } catch (Exception e) {
            System.out.println("Error: Invalid input for score. Please try again.");
         }
      }

      return grade;
   }
}