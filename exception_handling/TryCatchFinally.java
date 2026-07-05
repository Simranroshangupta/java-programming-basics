// TryCatchFinally.java
// Demonstrates try-catch-finally.

public class TryCatchFinally {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            String text = null;

            System.out.println(text.length());

        } catch (NullPointerException exception) {

            System.out.println("Exception : " + exception);

        } finally {

            System.out.println("Finally block executed.");
        }

        System.out.println("Program Ended");
    }
}

/*
==========================================
Explanation

finally

The finally block always executes

• Exception occurs
• Exception does not occur

Used for cleanup operations.

==========================================
*/