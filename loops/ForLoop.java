// For Loop in Java
// A for loop is used when the number of iterations is known.

public class ForLoop {

    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

/*
==========================================
Explanation

Syntax

for(initialization; condition; increment/decrement)
{
    // Code
}

Initialization -> Executes once.
Condition -> Checks before every iteration.
Increment/Decrement -> Updates the loop variable.

==========================================
*/