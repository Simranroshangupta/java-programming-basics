// Assignment Operators in Java
// Assignment operators are used to assign values to variables.

public class AssignmentOperators {

    public static void main(String[] args) {

        int number = 20;

        System.out.println("Initial Value : " + number);

        number += 10;   // number = number + 10
        System.out.println("After += 10 : " + number);

        number -= 5;    // number = number - 5
        System.out.println("After -= 5 : " + number);

        number *= 2;    // number = number * 2
        System.out.println("After *= 2 : " + number);

        number /= 5;    // number = number / 5
        System.out.println("After /= 5 : " + number);

        number %= 3;    // number = number % 3
        System.out.println("After %= 3 : " + number);
    }
}

/*
==========================================
Explanation

Assignment Operators

=   Assigns a value
+=  Adds and assigns
-=  Subtracts and assigns
*=  Multiplies and assigns
/=  Divides and assigns
%=  Finds remainder and assigns

==========================================
*/