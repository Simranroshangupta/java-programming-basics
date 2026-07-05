// WrapperClassExample.java
// Demonstrates wrapper classes.

public class WrapperClassExample {

    public static void main(String[] args) {

        Integer number = Integer.valueOf(100);

        Double marks = Double.valueOf(95.75);

        Character grade = Character.valueOf('A');

        System.out.println(number);

        System.out.println(marks);

        System.out.println(grade);
    }
}

/*
==========================================
Explanation

Wrapper Classes

Primitive → Wrapper

int → Integer

double → Double

char → Character

boolean → Boolean

Useful because collections
can store objects only.

==========================================
*/