// Fibonacci Series in Java
// Prints the Fibonacci series.

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= 10; i++) {

            int next = first + second;

            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}

/*
==========================================
Explanation

Fibonacci Series

Each number is the sum of
the previous two numbers.

Example

0 1 1 2 3 5 8 13 ...

==========================================
*/