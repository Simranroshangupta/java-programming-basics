// PackageDemo.java
// Demonstrates using another class from the same package.

public class PackageDemo {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Addition       : " + calculator.add(10, 20));

        System.out.println("Subtraction    : " + calculator.subtract(20, 10));

        System.out.println("Multiplication : " + calculator.multiply(10, 5));

        System.out.println("Division       : " + calculator.divide(20, 5));
    }
}

/*
==========================================
Explanation

Package

A package is used to organize
related classes together.

Benefits

• Better organization
• Avoids naming conflicts
• Easy maintenance

==========================================
*/