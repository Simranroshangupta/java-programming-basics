// Vehicle.java
// Abstract class example.

abstract class Vehicle {

    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

/*
==========================================
Explanation

Abstract Class

• Cannot be instantiated.
• Can contain both abstract
  and concrete methods.

Abstract Method

A method without a body.

==========================================
*/