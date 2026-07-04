// Method Overloading in Java
// Method overloading means creating multiple methods with the same name
// but different parameters.

public class MethodOverloading {

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static double add(double num1, double num2) {
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {

        System.out.println("Addition of Integers : " + add(10, 20));

        System.out.println("Addition of Doubles  : " + add(12.5, 7.5));

        System.out.println("Addition of 3 Numbers: " + add(5, 10, 15));
    }
}

/*
==========================================
Explanation

Method Overloading

• Same method name
• Different parameters
• Improves code reusability

==========================================
*/