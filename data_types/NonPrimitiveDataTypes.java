// Non-Primitive Data Types in Java
// Non-primitive data types are created by the programmer or provided by Java libraries.

public class NonPrimitiveDataTypes {

    public static void main(String[] args) {

        // String stores a sequence of characters
        String name = "Simran";

        // Array stores multiple values of the same data type
        int[] marks = {85, 90, 88, 92, 95};

        // Creating an object of the Student class
        Student student = new Student();

        System.out.println("Name : " + name);

        System.out.println("\nStudent Marks");

        for (int mark : marks) {
            System.out.println(mark);
        }

        student.display();
    }
}

// Simple class to demonstrate object creation
class Student {

    void display() {
        System.out.println("\nStudent object created successfully.");
    }
}

/*
==========================================
Explanation

Non-Primitive Data Types are also called
Reference Data Types.

Unlike primitive data types, they do not
store the actual value directly.
Instead, they store the reference (address)
of the object.

Examples

• String
• Arrays
• Classes
• Interfaces

Key Points

• Can store multiple values or complex data.
• Can have methods and properties.
• Size is not fixed.
• Created using classes.

==========================================
*/