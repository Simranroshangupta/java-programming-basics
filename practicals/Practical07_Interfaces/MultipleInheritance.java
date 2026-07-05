// Practical 07 (b)
// Program to demonstrate Multiple Inheritance using Interfaces.

interface Vehicle {

    void start();
}

interface Bike {

    void stop();
}

class Demo implements Vehicle, Bike {

    @Override
    public void start() {

        System.out.println("Vehicle Started.");
    }

    @Override
    public void stop() {

        System.out.println("Bike Stopped.");
    }
}

public class MultipleInheritance {

    public static void main(String[] args) {

        Demo object = new Demo();

        object.start();

        object.stop();
    }
}

/*
==========================================
Explanation

Java does not support multiple
inheritance using classes.

However, a class can implement
multiple interfaces.

Here, Demo implements both
Vehicle and Bike interfaces.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/