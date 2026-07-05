// ThrowThrows.java
// Demonstrates throw and throws keywords.

class AgeValidator {

    void checkAge(int age) throws Exception {

        if (age < 18) {

            throw new Exception("Age must be at least 18.");

        } else {

            System.out.println("Eligible to vote.");
        }
    }
}

public class ThrowThrows {

    public static void main(String[] args) {

        AgeValidator validator = new AgeValidator();

        try {

            validator.checkAge(16);

        } catch (Exception exception) {

            System.out.println(exception.getMessage());
        }
    }
}

/*
==========================================
Explanation

throw

Used to manually create an exception.

throws

Declares that a method
may throw an exception.

==========================================
*/