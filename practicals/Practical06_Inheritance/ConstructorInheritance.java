// Practical 06 (d)
// Program to demonstrate Constructor Inheritance.

class Person {

    Person() {

        System.out.println("Person Constructor Called");
    }
}

class Student extends Person {

    Student() {

        System.out.println("Student Constructor Called");
    }
}

public class ConstructorInheritance {

    public static void main(String[] args) {

        new Student();
    }
}

/*
==========================================
Explanation

When a child object is created,
the parent class constructor
is called first.

After that, the child class
constructor is executed.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/