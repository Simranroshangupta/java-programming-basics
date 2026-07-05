// Car.java
// Car inherits Vehicle and implements its abstract method.

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car started using Push Button.");
    }
}