package com.accelerex.studentmanagementsystem;

import java.util.Scanner;

public class Grade {
    private Student student;
    private Course course;
    private double score;
    private Scanner scanner; // Scanner for user input

    public Grade(Student student, Course course) {
        this.student = student;
        this.course = course;
        this.scanner = new Scanner(System.in); // Initialize the scanner
    }

    // Method to get the student
    public Student getStudent() {
        return student;
    }

    // Method to get the course
    public Course getCourse() {
        return course;
    }

    // Method to get the score
    public double getScore() {
        return score;
    }

    // Method to set the score with exception handling
    public void setScore() {
        try {
            System.out.print("Enter the score for " + student.getName() + " in course " + course.getTitle() + ": ");
            score = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid score.");
            scanner.nextLine(); // Consume the invalid input
            setScore(); // Retry setting the score
        }
    }
}