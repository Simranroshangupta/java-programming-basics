// Practical 04 (a)
// Create a Student class with data members and display them using objects.

public class Student {

    int rollNumber;
    String name;
    int marks;

    void display() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Marks       : " + marks);
    }

    public static void main(String[] args) {

        Student student = new Student();

        student.rollNumber = 14;
        student.name = "Simran";
        student.marks = 85;

        student.display();
    }
}

/*
==========================================
Explanation

A class is a blueprint used to
create objects.

An object is an instance of a class.

Here, a Student object is created,
values are assigned to its variables,
and then displayed using a method.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/