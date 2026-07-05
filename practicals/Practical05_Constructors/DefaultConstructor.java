// Practical 05 (a)
// Program to demonstrate the Default Constructor.

public class DefaultConstructor {

    int rollNumber;
    String name;

    // Default Constructor
    DefaultConstructor() {

        rollNumber = 14;
        name = "Simran";
    }

    void display() {

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
    }

    public static void main(String[] args) {

        DefaultConstructor student = new DefaultConstructor();

        student.display();
    }
}

/*
==========================================
Explanation

A constructor is a special method
that is called automatically when
an object is created.

A default constructor does not
take any parameters.

It is mainly used to initialize
object data.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/