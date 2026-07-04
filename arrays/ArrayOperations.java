// Array Operations in Java
// Demonstrates basic operations on an array.

public class ArrayOperations {

    public static void main(String[] args) {

        int[] numbers = {15, 25, 35, 45, 55};

        System.out.println("First Element : " + numbers[0]);

        // Updating an element
        numbers[2] = 100;

        System.out.println("Updated Third Element : " + numbers[2]);

        System.out.println("\nAll Elements:");

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

/*
==========================================
Explanation

Basic Operations

• Access
• Update
• Traverse

==========================================
*/