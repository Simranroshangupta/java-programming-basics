// Star Pattern in Java
// Prints a square star pattern using nested loops.

public class StarPattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

/*
==========================================
Explanation

Output

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

==========================================
*/