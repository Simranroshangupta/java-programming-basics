// Bitwise Operators in Java
// Bitwise operators perform operations on binary values.

public class BitwiseOperators {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 3;

        System.out.println("num1 & num2 = " + (num1 & num2));
        System.out.println("num1 | num2 = " + (num1 | num2));
        System.out.println("num1 ^ num2 = " + (num1 ^ num2));
        System.out.println("~num1 = " + (~num1));
    }
}

/*
==========================================
Explanation

&  Bitwise AND
|  Bitwise OR
^  Bitwise XOR
~  Bitwise Complement

These operators work on binary values.

==========================================
*/