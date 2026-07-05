// EncapsulationDemo.java
// Demonstrates encapsulation.

public class EncapsulationDemo {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.setAccountNumber(123456789);

        account.setAccountHolder("Simran");

        account.setBalance(50000);

        System.out.println("Account Number : " + account.getAccountNumber());

        System.out.println("Account Holder : " + account.getAccountHolder());

        System.out.println("Balance        : ₹" + account.getBalance());
    }
}

/*
==========================================
Explanation

Encapsulation

Wrapping data and methods
into a single class.

Advantages

• Data Security
• Data Hiding
• Controlled Access

Access private variables
using Getter and Setter methods.

==========================================
*/