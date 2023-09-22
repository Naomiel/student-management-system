package com.accelerex.studentmanagementsystem;

public class Course {
    private String title;
    private String courseCode;
    private String instructor;
    private String schedule;

    public Course(String title, String courseCode, String instructor, String schedule) {
        this.title = title;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.schedule = schedule;
    }
    //Getters
    public String getTitle() {
        return title;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getInstructor() {
        return instructor;
    }
    public String getSchedule() {
        return schedule;
    }

}
