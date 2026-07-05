// CardPayment.java
// Implements the Payment interface.

class CardPayment implements Payment {

    @Override
    public void pay(double amount) {

        System.out.println("Paid ₹" + amount + " using Debit/Credit Card.");
    }
}