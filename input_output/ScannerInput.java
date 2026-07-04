// Taking User Input using Scanner
// Scanner is used to read input from the keyboard.

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {

        // Creates a Scanner object to take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\nStudent Details");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);

        // Closes the Scanner to free system resources
        sc.close();
    }
}

/*
==========================================
Explanation

Scanner
- Scanner is a predefined class used to take input from the user.

Methods Used

nextLine()   -> Reads a complete line of text.
nextInt()    -> Reads an integer.
nextDouble() -> Reads a decimal number.

==========================================
*/