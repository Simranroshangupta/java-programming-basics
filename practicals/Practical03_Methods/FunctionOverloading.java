// Practical 03 (b)
// Program to demonstrate Function Overloading.

public class FunctionOverloading {

    void display(int number) {

        System.out.println("Value of Number : " + number);
    }

    void display(int number1, int number2) {

        System.out.println("Values : " + number1 + " , " + number2);
    }

    void display(double number) {

        System.out.println("Double Value : " + number);
    }

    public static void main(String[] args) {

        FunctionOverloading object = new FunctionOverloading();

        object.display(10);

        object.display(10, 20);

        object.display(5.5);
    }
}

/*
==========================================
Explanation

Function Overloading means using
the same function name with
different parameter lists.

Each function performs a different
task based on the arguments passed.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/