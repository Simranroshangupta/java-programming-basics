// Practical 02
// Program to check whether a number is Prime or Not.

public class PrimeNumber {

    public static void main(String[] args) {

        int number = 17;

        boolean isPrime = true;

        if (number <= 1) {

            isPrime = false;

        } else {

            for (int i = 2; i <= number / 2; i++) {

                if (number % i == 0) {

                    isPrime = false;

                    break;
                }
            }
        }

        if (isPrime) {

            System.out.println(number + " is a Prime Number.");

        } else {

            System.out.println(number + " is Not a Prime Number.");
        }
    }
}

/*
==========================================
Explanation

A prime number has only
two factors:
1 and the number itself.

The program checks whether
the number is divisible by
any number from 2 to number/2.

If it is divisible,
it is not a prime number.

Otherwise,
it is a prime number.

Time Complexity : O(n)
Space Complexity : O(1)

Expected Output

17 is a Prime Number.

==========================================
*/