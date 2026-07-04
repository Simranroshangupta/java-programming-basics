// Factorial Program in Java
// Calculates the factorial of a number using a for loop.

public class Factorial {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
    }
}

/*
==========================================
Explanation

Factorial

5! = 5 × 4 × 3 × 2 × 1

Result = 120

==========================================
*/