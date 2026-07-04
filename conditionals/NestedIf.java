// Nested If Statement in Java
// A nested if is an if statement inside another if statement.

public class NestedIf {

    public static void main(String[] args) {

        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Eligible to drive.");
            } else {
                System.out.println("License required.");
            }

        } else {
            System.out.println("Not eligible to drive.");
        }
    }
}

/*
==========================================
Explanation

Nested If

- One if statement is placed inside another if statement.
- Used when multiple conditions depend on each other.

==========================================
*/