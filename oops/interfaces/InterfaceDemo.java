// InterfaceDemo.java
// Demonstrates interface implementation.

public class InterfaceDemo {

    public static void main(String[] args) {

        Payment payment;

        payment = new UPIPayment();
        payment.pay(2500);

        payment = new CardPayment();
        payment.pay(4500);
    }
}

/*
==========================================
Explanation

Interface

An interface cannot be instantiated.

Example

Payment payment;

payment = new UPIPayment();

payment = new CardPayment();

Different classes provide their own
implementation of the same method.

==========================================
*/