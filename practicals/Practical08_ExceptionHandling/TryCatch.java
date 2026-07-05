// Practical 08 (a)
// Program to demonstrate Exception Handling using try and catch.

public class TryCatch {

    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 0;

        try {

            int result = number1 / number2;

            System.out.println("Result : " + result);

        } catch (ArithmeticException exception) {

            System.out.println("Error : Division by zero is not allowed.");
        }

        System.out.println("Program Executed Successfully.");
    }
}

/*
==========================================
Explanation

An exception is an error that
occurs while the program is running.

The try block contains code that
may cause an exception.

If an exception occurs,
the catch block handles it
without stopping the program.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/