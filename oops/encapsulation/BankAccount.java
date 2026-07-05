// BankAccount.java
// Demonstrates encapsulation using private data members.

class BankAccount {

    // Private data members
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Setter Methods
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter Methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
}

/*
==========================================
Explanation

private

Private variables cannot be accessed
directly outside the class.

Getter Methods

Used to read private variables.

Setter Methods

Used to modify private variables.

==========================================
*/