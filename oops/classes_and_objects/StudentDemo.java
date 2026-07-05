// StudentDemo.java
// Demonstrates creating Student objects.

public class StudentDemo {

    public static void main(String[] args) {

        Student student1 = new Student();

        student1.rollNumber = 101;
        student1.name = "Simran";
        student1.age = 20;
        student1.course = "Computer Science";
        student1.cgpa = 9.15;

        Student student2 = new Student();

        student2.rollNumber = 102;
        student2.name = "Rahul";
        student2.age = 21;
        student2.course = "Information Technology";
        student2.cgpa = 8.74;

        System.out.println("Student 1");
        student1.displayDetails();

        System.out.println();

        System.out.println("Student 2");
        student2.displayDetails();
    }
}

/*
==========================================
Explanation

Student student1 = new Student();

Student → Class

student1 → Object

new → Creates an object and allocates memory.

==========================================
*/