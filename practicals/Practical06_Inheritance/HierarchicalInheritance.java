// Practical 06 (c)
// Program to demonstrate Hierarchical Inheritance.

class Person {

    void showName() {

        System.out.println("Name : Simran");
    }
}

class Student extends Person {

    void showStudent() {

        System.out.println("Roll Number : 14");
    }
}

class Employee extends Person {

    void showEmployee() {

        System.out.println("Department : AIML");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Student student = new Student();

        Employee employee = new Employee();

        student.showName();
        student.showStudent();

        System.out.println();

        employee.showName();
        employee.showEmployee();
    }
}

/*
==========================================
Explanation

Hierarchical Inheritance means
multiple child classes inherit
from the same parent class.

Here, Student and Employee
both inherit Person.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/