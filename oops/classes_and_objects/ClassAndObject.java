// ClassAndObject.java
// Demonstrates the relationship between a class and an object.

public class ClassAndObject {

    public static void main(String[] args) {

        Student student = new Student();

        student.rollNumber = 101;
        student.name = "Simran";
        student.age = 20;
        student.course = "Computer Science";
        student.cgpa = 9.15;

        student.displayDetails();
    }
}

/*
==========================================
Explanation

Class
A blueprint used to create objects.

Object
An instance of a class.

Syntax

ClassName objectName = new ClassName();

Example

Student student = new Student();

==========================================
*/