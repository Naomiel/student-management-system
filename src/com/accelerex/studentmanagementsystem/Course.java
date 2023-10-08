package com.accelerex.studentmanagementsystem;

import java.util.Scanner;

public class Course {
    private String courseCode;
    private String title;
    private String instructor;
    private String schedule;
    private Scanner scanner; // Scanner for user input

    public Course(String courseCode, String title, String instructor, String schedule) {
        this.courseCode = courseCode;
        this.schedule = schedule;
        this.scanner = new Scanner(System.in); // Initialize the scanner
    }

    // Method to get the course code
    public String getCourseCode() {
        return courseCode;
    }

    // Method to get the title
    public String getTitle() {
        return title;
    }

    // Method to get the instructor
    public String getInstructor() {
        return instructor;
    }

    // Method to get the schedule
    public String getSchedule() {
        return schedule;
    }

    // Method to set the course title with exception handling
    public void setTitle() {
        try {
            System.out.print("Enter course title: ");
            title = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }

    // Method to set the instructor with exception handling
    public void setInstructor() {
        try {
            System.out.print("Enter instructor: ");
            instructor = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }

    // Method to display course information
    public void displayInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Schedule: " + schedule);
    }
}