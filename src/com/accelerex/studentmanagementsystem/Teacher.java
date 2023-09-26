package com.accelerex.studentmanagementsystem;

class Teacher extends Person{
    private String specialization;
    public Teacher(int id, String name, int age, String address, String specialization) {
        super(id, name, age, address);
        this.specialization = specialization;
    }
    public void displayInfo() {
        System.out.println("Teacher ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Specialization: " + specialization);
    }
}
