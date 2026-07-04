// Array Traversal in Java
// Traversal means visiting each element of an array.

public class ArrayTraversal {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Using For Loop:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("\nUsing Enhanced For Loop:");

        // Reads each element one by one from the array
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

/*
==========================================
Explanation

Traversal

Traversal means accessing every element
present in an array.

==========================================
*/