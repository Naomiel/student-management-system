package com.accelerex.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private List<Course> enrolledCourses;
    private List<Grade> grades;

    public Student(int id, String name, int age, String address) {
        super(id, name, age, address);
        enrolledCourses = new ArrayList<>();
        this.grades = new ArrayList<>();
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
}
