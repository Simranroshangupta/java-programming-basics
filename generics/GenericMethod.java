// GenericMethod.java
// Demonstrates a generic method.

public class GenericMethod {

    static <T> void print(T value) {

        System.out.println(value);
    }

    public static void main(String[] args) {

        print(100);

        print("Java");

        print(95.5);
    }
}

/*
==========================================
Explanation

Generic Method

Can accept different data types
without creating multiple methods.

==========================================
*/