// Unary Operators in Java
// Unary operators work with only one operand.

public class UnaryOperators {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("Original Value : " + number);

        System.out.println("Post Increment : " + (number++));
        System.out.println("Current Value  : " + number);

        System.out.println("Pre Increment  : " + (++number));

        System.out.println("Post Decrement : " + (number--));
        System.out.println("Current Value  : " + number);

        System.out.println("Pre Decrement  : " + (--number));
    }
}

/*
==========================================
Explanation

++  Increment Operator
--  Decrement Operator

Pre Increment   (++x)
Value increases first.

Post Increment  (x++)
Value is used first, then increased.

==========================================
*/