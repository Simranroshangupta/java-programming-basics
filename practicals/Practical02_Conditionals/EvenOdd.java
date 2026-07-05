// Practical 01
// Program to check whether a number is Even or Odd.

public class EvenOdd {

    public static void main(String[] args) {

        int number = 18;

        if (number % 2 == 0) {

            System.out.println(number + " is Even.");

        } else {

            System.out.println(number + " is Odd.");
        }
    }
}

/*
==========================================
Explanation

An even number is completely
divisible by 2.

An odd number leaves a remainder
when divided by 2.

The modulus (%) operator is used
to find the remainder.

If the remainder is 0,
the number is Even.

Otherwise,
the number is Odd.

Time Complexity : O(1)
Space Complexity : O(1)

Expected Output

18 is Even.

==========================================
*/