// Largest Element in an Array
// Finds the largest element in an array.

public class LargestElement {

    public static void main(String[] args) {

        int[] numbers = {45, 12, 89, 34, 67};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest Element : " + largest);
    }
}

/*
==========================================
Explanation

The program compares every element
with the current largest value.

==========================================
*/