// Primitive Data Types in Java
// Primitive data types are the basic built-in data types provided by Java.

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        // byte stores very small whole numbers
        byte age = 20;

        // short stores small whole numbers
        short year = 2026;

        // int stores whole numbers
        int population = 150000;

        // long stores very large whole numbers
        long mobileNumber = 9876543210L;
        // 'L' tells Java that the number is of type long.

        // float stores decimal numbers (less precision)
        float percentage = 89.5f;
        // 'f' tells Java that the value is a float.

        // double stores decimal numbers (more precision)
        double cgpa = 9.15;

        // char stores a single character
        char grade = 'A';

        // boolean stores only true or false
        boolean passed = true;

        System.out.println("Byte Value      : " + age);
        System.out.println("Short Value     : " + year);
        System.out.println("Int Value       : " + population);
        System.out.println("Long Value      : " + mobileNumber);
        System.out.println("Float Value     : " + percentage);
        System.out.println("Double Value    : " + cgpa);
        System.out.println("Character Value : " + grade);
        System.out.println("Boolean Value   : " + passed);
    }
}

/*
==========================================
Explanation

Primitive Data Types are predefined data types
used to store simple values.

There are 8 primitive data types in Java:

1. byte    -> Small integer
2. short   -> Small whole number
3. int     -> Whole number
4. long    -> Large whole number
5. float   -> Decimal number
6. double  -> Decimal number (higher precision)
7. char    -> Single character
8. boolean -> true or false

Key Points

• byte, short, int and long store integer values.
• float and double store decimal values.
• char stores only one character.
• boolean stores either true or false.

==========================================
*/