// FinalKeywordDemo.java
// Demonstrates the use of the final keyword in Java.

class Vehicle {

    // Final method cannot be overridden
    final void displayCompany() {
        System.out.println("Company : Tesla");
    }
}

// Uncommenting the below method will cause a compilation error
/*
class Car extends Vehicle {

    @Override
    void displayCompany() {
        System.out.println("Company : BMW");
    }
}
*/

public class FinalKeywordDemo {

    public static void main(String[] args) {

        // Final variable
        final double PI = 3.14159;

        System.out.println("Value of PI : " + PI);

        // PI = 3.14;
        // Error: Cannot assign a value to a final variable

        Vehicle vehicle = new Vehicle();

        vehicle.displayCompany();
    }
}

/*
==========================================
Explanation

final Keyword

The final keyword is used to restrict
modification.

Uses of final

1. Final Variable
   • Value cannot be changed after initialization.

2. Final Method
   • Cannot be overridden by a child class.

3. Final Class
   • Cannot be inherited.

Example

final int number = 10;

final void display() { }

final class Student { }

==========================================

Expected Output

Value of PI : 3.14159
Company : Tesla

==========================================
*/