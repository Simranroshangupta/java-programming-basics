// Pyramid Pattern in Java
// Prints a pyramid using stars.

public class PyramidPattern {

    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {

            // Prints spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Prints stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

/*
==========================================
Explanation

Output

    *
   ***
  *****
 *******
*********

==========================================
*/