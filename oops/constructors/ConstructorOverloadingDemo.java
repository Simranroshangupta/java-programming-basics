// ConstructorOverloadingDemo.java
// Demonstrates constructor overloading.

public class ConstructorOverloadingDemo {

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student(
                103,
                "Aman",
                "Artificial Intelligence"
        );

        Student student3 = new Student(
                104,
                "Neha"
        );

        System.out.println("Student 1");
        student1.displayDetails();

        System.out.println();

        System.out.println("Student 2");
        student2.displayDetails();

        System.out.println();

        System.out.println("Student 3");
        student3.displayDetails();
    }
}

/*
==========================================
Explanation

Constructor Overloading

Multiple constructors
having different parameters.

The compiler decides
which constructor to call.

==========================================
*/