package com.accelerex.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student extends Person {
    private List<Course> enrolledCourses;
    private List<Grade> grades;
    private Scanner scanner; // Scanner for user input

    public Student(int id, String name, int age, String address) {
        super(id, name, age, address);
        enrolledCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
        this.scanner = new Scanner(System.in); // Initialize the scanner
    }

    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }

    // Method to display student information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("Course Code: " + course.getCourseCode());
            System.out.println("Title: " + course.getTitle());
            System.out.println("Instructor: " + course.getInstructor());
            System.out.println("Schedule: " + course.getSchedule());
            System.out.println();
        }
    }

    // Method to handle user input with exception handling
    public void takeInput() {
        try {
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

            // Update student information
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }
}