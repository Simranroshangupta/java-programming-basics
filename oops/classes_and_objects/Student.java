// Student.java
// Represents a student with basic details.

class Student {

    // Data Members
    int rollNumber;
    String name;
    int age;
    String course;
    double cgpa;

    // Method to display student details
    void displayDetails() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Course      : " + course);
        System.out.println("CGPA        : " + cgpa);
    }
}

/*
==========================================
Explanation

Student is a user-defined class.

It contains:
• Data Members (Variables)
• Member Function (Method)

Objects created from this class
will have their own copy of these variables.

==========================================
*/