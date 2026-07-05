// MethodOverridingDemo.java
// Demonstrates runtime polymorphism.

public class MethodOverridingDemo {

    public static void main(String[] args) {

        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Rectangle();
        shape.draw();
    }
}

/*
==========================================
Explanation

Method Overriding

A child class provides its own
implementation of a parent class method.

Also called Runtime Polymorphism.

==========================================
*/