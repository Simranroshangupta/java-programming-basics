// Practical 06 (b)
// Program to demonstrate Multilevel Inheritance.

class Person {

    void showName() {

        System.out.println("Name : Simran");
    }
}

class Student extends Person {

    void showRollNumber() {

        System.out.println("Roll Number : 14");
    }
}

class Result extends Student {

    void showMarks() {

        System.out.println("Marks : 90");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        Result result = new Result();

        result.showName();

        result.showRollNumber();

        result.showMarks();
    }
}

/*
==========================================
Explanation

Multilevel Inheritance means
one class inherits another,
which is again inherited by
another class.

Person → Student → Result

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/