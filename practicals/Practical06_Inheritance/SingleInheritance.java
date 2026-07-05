// Practical 06 (a)
// Program to demonstrate Single Inheritance.

class Person {

    String name;

    void getName() {

        name = "Simran";

        System.out.println("Name (Base Class) : " + name);
    }
}

class Student extends Person {

    int rollNumber;

    void getRollNumber() {

        rollNumber = 14;

        System.out.println("Roll Number (Derived Class) : " + rollNumber);
    }
}

public class SingleInheritance {

    public static void main(String[] args) {

        Student student = new Student();

        student.getName();

        student.getRollNumber();
    }
}

/*
==========================================
Explanation

Single Inheritance means one
child class inherits from one
parent class.

Here, Student inherits the
properties and methods of Person.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/