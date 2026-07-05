// ThisKeywordDemo.java
// Demonstrates the use of the 'this' keyword in Java.

class Student {

    int rollNumber;
    String name;
    String course;

    Student(int rollNumber, String name, String course) {

        // 'this' refers to the current object's variables
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }

    void displayDetails() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("Course      : " + course);
    }
}

public class ThisKeywordDemo {

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Simran",
                "Computer Science"
        );

        student.displayDetails();
    }
}

/*
==========================================
Explanation

this Keyword

• Refers to the current object.

It is mainly used to distinguish
instance variables from local variables.

Example

this.name = name;

Left Side  -> Instance Variable
Right Side -> Local Variable

==========================================
*/