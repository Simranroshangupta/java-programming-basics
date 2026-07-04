// Method Parameters in Java
// Parameters allow values to be passed into a method.

public class MethodParameters {

    static void displayStudent(String name, int age) {

        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    public static void main(String[] args) {

        displayStudent("Simran", 20);
    }
}

/*
==========================================
Explanation

Parameters

Values received by a method are called parameters.

Arguments

Values passed while calling a method are called arguments.

==========================================
*/