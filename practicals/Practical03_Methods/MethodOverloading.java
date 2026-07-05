// Practical 03 (a)
// Program to demonstrate Method Overloading.

public class MethodOverloading {

    void add(int num1, int num2) {

        System.out.println("Sum of Two Integers : " + (num1 + num2));
    }

    void add(int num1, int num2, int num3) {

        System.out.println("Sum of Three Integers : " + (num1 + num2 + num3));
    }

    void add(double num1, double num2) {

        System.out.println("Sum of Two Doubles : " + (num1 + num2));
    }

    public static void main(String[] args) {

        MethodOverloading object = new MethodOverloading();

        object.add(10, 20);

        object.add(5, 10, 15);

        object.add(2.5, 3.5);
    }
}

/*
==========================================
Explanation

Method Overloading means creating
multiple methods with the same name
but different parameters.

The compiler decides which method
to call based on the arguments passed.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/