// ParameterizedConstructorDemo.java
// Demonstrates a parameterized constructor.

public class ParameterizedConstructorDemo {

    public static void main(String[] args) {

        Student student = new Student(
                102,
                "Rahul",
                "Information Technology"
        );

        student.displayDetails();
    }
}

/*
==========================================
Explanation

Parameterized Constructor

Accepts values while creating
an object.

==========================================
*/