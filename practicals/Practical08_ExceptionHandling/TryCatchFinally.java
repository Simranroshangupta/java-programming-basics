// Practical 08 (b)
// Program to demonstrate try, catch and finally.

import java.util.Scanner;

public class TryCatchFinally {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter First Number : ");
            int number1 = scanner.nextInt();

            System.out.print("Enter Second Number : ");
            int number2 = scanner.nextInt();

            int result = number1 / number2;

            System.out.println("Result : " + result);

        } catch (ArithmeticException exception) {

            System.out.println("Error : Division by zero is not allowed.");

        } catch (Exception exception) {

            System.out.println("Invalid Input.");

        } finally {

            System.out.println("Finally Block Executed.");

            scanner.close();
        }

        System.out.println("Program Finished.");
    }
}

/*
==========================================
Explanation

The finally block always executes,
whether an exception occurs or not.

It is mainly used to close files,
database connections or Scanner
objects after use.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/