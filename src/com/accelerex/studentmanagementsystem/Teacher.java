package com.accelerex.studentmanagementsystem;

import java.util.Scanner;

class Teacher extends Person {
    private String specialization;
    private Scanner scanner; // Scanner for user input

    public Teacher(int id, String name, int age, String address, String specialization) {
        super(id, name, age, address);
        this.specialization = specialization;
        this.scanner = new Scanner(System.in); // Initialize the scanner
    }

    // Method to display teacher information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Teacher ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
        System.out.println("Specialization: " + specialization);
    }

    // Method to handle user input for teacher specialization with exception handling
    public void takeInput() {
        try {
            System.out.print("Enter teacher's specialization: ");
            specialization = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please try again.");
        }
    }
}
