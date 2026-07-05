// SuperKeywordDemo.java
// Demonstrates the use of the super keyword in Java.

class Person {

    String name = "Simran";

    // Parent class constructor
    Person() {
        System.out.println("Person Constructor Called");
    }

    // Parent class method
    void display() {
        System.out.println("Person Name : " + name);
    }
}

class Student extends Person {

    String name = "Rahul";

    // Child class constructor
    Student() {

        // Calls the parent class constructor
        super();

        System.out.println("Student Constructor Called");
    }

    void showDetails() {

        System.out.println("Student Name : " + name);

        // Accessing parent class variable
        System.out.println("Parent Name  : " + super.name);

        System.out.println();

        // Calling parent class method
        super.display();
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println();

        student.showDetails();
    }
}

/*
==========================================
Explanation

super Keyword

The super keyword refers to the
immediate parent class.

Uses of super

1. super()
   • Calls the parent class constructor.

2. super.variableName
   • Accesses the parent class variable.

3. super.methodName()
   • Calls the parent class method.

Example

super();

super.name;

super.display();

==========================================

Expected Output

Person Constructor Called
Student Constructor Called

Student Name : Rahul
Parent Name  : Simran

Person Name : Simran

==========================================
*/