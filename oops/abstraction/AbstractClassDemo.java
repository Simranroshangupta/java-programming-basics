// AbstractClassDemo.java
// Demonstrates abstraction.

public class AbstractClassDemo {

    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Vehicle vehicle = new Vehicle();

        Car car = new Car();

        car.start();
        car.stop();
    }
}

/*
==========================================
Explanation

Abstraction

Abstraction hides implementation
details and shows only the essential
features.

Why use abstraction?

• Security
• Code reusability
• Better design

==========================================
*/