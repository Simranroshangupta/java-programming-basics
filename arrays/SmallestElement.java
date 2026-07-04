// Smallest Element in an Array
// Finds the smallest element in an array.

public class SmallestElement {

    public static void main(String[] args) {

        int[] numbers = {45, 12, 89, 34, 67};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest Element : " + smallest);
    }
}

/*
==========================================
Explanation

The program compares every element
with the current smallest value.

==========================================
*/