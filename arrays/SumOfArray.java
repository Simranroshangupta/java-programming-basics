// Sum of Array Elements in Java
// Calculates the sum of all elements in an array.

public class SumOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of Array Elements : " + sum);
    }
}

/*
==========================================
Explanation

The program adds all elements
present in the array.

==========================================
*/