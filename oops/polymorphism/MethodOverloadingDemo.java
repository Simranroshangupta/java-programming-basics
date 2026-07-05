// MethodOverloadingDemo.java
// Demonstrates compile-time polymorphism.

class Calculator {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Two Integers   : " + calculator.add(10, 20));

        System.out.println("Three Integers : " + calculator.add(10, 20, 30));

        System.out.println("Two Doubles    : " + calculator.add(10.5, 20.5));
    }
}

/*
==========================================
Explanation

Method Overloading

• Same method name
• Different parameter list

Compiler decides which method
to execute.

Also called Compile-Time Polymorphism.

==========================================
*/