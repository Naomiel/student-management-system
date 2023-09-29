package com.accelerex.studentmanagementsystem;

public class Main {

   public static void main(String[] args) {
      // Create students
      Student student1 = new Student(1, "Alice", 20, "123 Main St");
      Student student2 = new Student(2, "Bob", 22, "456 Elm St");

      // Create courses
      Course course1 = new Course("CS101", "Intro to Programming", "Prof. Smith", "Mon/Wed 9:00 AM");
      Course course2 = new Course("MATH201", "Calculus I", "Prof. Johnson", "Tue/Thu 10:30 AM");


      // Enroll students in courses
      student1.enrollInCourse(course1);
      student2.enrollInCourse(course1);
      student2.enrollInCourse(course2);

      // Display student and course information
      student1.displayInfo();
      System.out.println();
      student2.displayInfo();
   }
}