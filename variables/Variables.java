// Variables in Java
// Variables are used to store data that can be used throughout the program.

public class Variables {

    public static void main(String[] args) {

        // String variable stores text
        String name = "Simran";

        // int stores whole numbers
        int age = 20;

        // double stores decimal numbers
        double cgpa = 9.15;

        // char stores a single character
        char grade = 'A';

        // boolean stores true or false
        boolean isStudent = true;

        System.out.println("Student Name : " + name);
        System.out.println("Age          : " + age);
        System.out.println("CGPA         : " + cgpa);
        System.out.println("Grade        : " + grade);
        System.out.println("Student      : " + isStudent);
    }
}

/*
==========================================
Explanation

Variable
- A variable is a named memory location used to store data.

Syntax
dataType variableName = value;

Example
int age = 20;

Rules for Naming Variables
- Variable names can contain letters, digits, _ and $.
- Variable names cannot start with a number.
- Variable names are case-sensitive.
- Avoid using Java keywords as variable names.

==========================================
*/