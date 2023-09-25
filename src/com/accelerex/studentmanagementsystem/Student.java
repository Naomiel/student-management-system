package com.accelerex.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private List<Course> enrolledCourses;

    public Student(int id, String name, int age, String address) {
        super(id, name, age, address);
        enrolledCourses = new ArrayList<>();
    }
    // Method to enroll in a course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }
    // Method to display student information
    public void displayInfo() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println("  Course Code: " + course.getCourseCode());
            System.out.println("  Title: " + course.getTitle());
            System.out.println("  Instructor: " + course.getInstructor());
            System.out.println("  Schedule: " + course.getSchedule());
        }
    }
}
