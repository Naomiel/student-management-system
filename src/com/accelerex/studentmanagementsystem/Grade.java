package com.accelerex.studentmanagementsystem;

// Grade class to represent student grades
public class Grade {
    private Student student;
    private Course course;
    private double score;

    public Grade(Student student, Course course, double score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }
}
