// Recursion in Java
// Recursion is a process in which a method calls itself.

public class Recursion {

    static int factorial(int number) {

        // Base condition
        if (number == 0 || number == 1) {
            return 1;
        }

        // Recursive call
        return number * factorial(number - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        System.out.println("Factorial of " + number + " = " + factorial(number));
    }
}

/*
==========================================
Explanation

Recursion

A method repeatedly calls itself
until the base condition is reached.

Without a base condition,
the program will run indefinitely
and cause a StackOverflowError.

==========================================
*/