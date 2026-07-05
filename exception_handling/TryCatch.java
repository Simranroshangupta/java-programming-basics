// TryCatch.java
// Demonstrates exception handling using try-catch.

public class TryCatch {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int number = 10;
            int result = number / 0;

            System.out.println(result);

        } catch (ArithmeticException exception) {

            System.out.println("Exception Caught : " + exception.getMessage());
        }

        System.out.println("Program Ended");
    }
}

/*
==========================================
Explanation

try

Contains code that may generate
an exception.

catch

Handles the exception.

If an exception occurs,
the program does not terminate.

==========================================
*/