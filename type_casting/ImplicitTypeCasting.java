// Implicit Type Casting
// Implicit type casting is performed automatically by Java when converting
// a smaller data type into a larger data type.

public class ImplicitTypeCasting {

    public static void main(String[] args) {

        int number = 100;

        // int is automatically converted to double
        double convertedNumber = number;

        System.out.println("Integer Value : " + number);
        System.out.println("Converted to Double : " + convertedNumber);
    }
}

/*
==========================================
Explanation

Implicit Type Casting is also called
Widening Casting.

Conversion takes place automatically.

Conversion Order

byte
  ↓
short
  ↓
int
  ↓
long
  ↓
float
  ↓
double

Example

int → double
char → int

==========================================
*/