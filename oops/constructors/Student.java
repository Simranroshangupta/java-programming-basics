// Student.java
// Demonstrates constructors in Java.

class Student {

    int rollNumber;
    String name;
    String course;

    // Default Constructor
    Student() {

        rollNumber = 101;
        name = "Simran";
        course = "Computer Science";
    }

    // Parameterized Constructor
    Student(int rollNumber, String name, String course) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }

    // Constructor Overloading
    Student(int rollNumber, String name) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.course = "Not Assigned";
    }

    void displayDetails() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
    }
}

/*
==========================================
Explanation

This class contains

• Default Constructor
• Parameterized Constructor
• Constructor Overloading

==========================================
*/