// Practical 06 (e)
// Program to demonstrate the super keyword.

class Person {

    String name;

    Person(String name) {

        this.name = name;
    }
}

class Student extends Person {

    int rollNumber;

    Student(String name, int rollNumber) {

        super(name);

        this.rollNumber = rollNumber;
    }

    void display() {

        System.out.println("Name        : " + name);

        System.out.println("Roll Number : " + rollNumber);
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        Student student = new Student("Simran", 14);

        student.display();
    }
}

/*
==========================================
Explanation

The super keyword refers to
the parent class.

It is mainly used to call the
parent class constructor,
method or variable.

Here, super(name) calls the
Person class constructor.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/