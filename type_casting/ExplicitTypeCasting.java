// Explicit Type Casting
// Explicit type casting is done manually by the programmer
// when converting a larger data type into a smaller data type.

public class ExplicitTypeCasting {

    public static void main(String[] args) {

        double percentage = 89.75;

        // Manually converting double into int
        int marks = (int) percentage;

        System.out.println("Double Value : " + percentage);
        System.out.println("Converted Integer : " + marks);
    }
}

/*
==========================================
Explanation

Explicit Type Casting is also called
Narrowing Casting.

The programmer performs the conversion manually.

Syntax

(dataType) variable

Example

double → int
long → int
int → byte

Note

The decimal part is removed during conversion.

89.75 → 89

==========================================
*/