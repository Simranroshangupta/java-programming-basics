// Logical Operators in Java
// Logical operators combine multiple conditions.

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 20;
        double cgpa = 9.2;

        System.out.println("AND (&&)");
        System.out.println(age >= 18 && cgpa >= 8.0);

        System.out.println("\nOR (||)");
        System.out.println(age < 18 || cgpa >= 8.0);

        System.out.println("\nNOT (!)");
        System.out.println(!(age < 18));
    }
}

/*
==========================================
Explanation

&&  Logical AND
Returns true if both conditions are true.

||  Logical OR
Returns true if at least one condition is true.

!   Logical NOT
Reverses the result.

==========================================
*/