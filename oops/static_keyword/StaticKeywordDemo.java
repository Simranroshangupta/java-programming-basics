// StaticKeywordDemo.java
// Demonstrates the use of the static keyword in Java.

class Student {

    int rollNumber;
    String name;

    // Static variable (shared by all objects)
    static String collegeName = "ABC Engineering College";

    Student(int rollNumber, String name) {

        this.rollNumber = rollNumber;
        this.name = name;
    }

    // Static method
    static void displayCollege() {

        System.out.println("College : " + collegeName);
    }

    // Instance method
    void displayDetails() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("College     : " + collegeName);

        System.out.println();
    }
}

public class StaticKeywordDemo {

    public static void main(String[] args) {

        Student student1 = new Student(101, "Simran");

        Student student2 = new Student(102, "Rahul");

        student1.displayDetails();

        student2.displayDetails();

        // Calling static method using class name
        Student.displayCollege();
    }
}

/*
==========================================
Explanation

static Keyword

The static keyword makes a member
belong to the class instead of objects.

Uses of static

1. Static Variable
   • One copy is shared by all objects.

2. Static Method
   • Can be called using the class name.
   • Can access only static members directly.

3. Static Block
   • Executes once when the class is loaded.
   • (Not demonstrated here)

Example

Student.collegeName;

Student.displayCollege();

==========================================

Expected Output

Roll Number : 101
Name        : Simran
College     : ABC Engineering College

Roll Number : 102
Name        : Rahul
College     : ABC Engineering College

College : ABC Engineering College

==========================================
*/