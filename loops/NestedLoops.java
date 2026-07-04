// Nested Loops in Java
// A loop inside another loop is called a nested loop.

public class NestedLoops {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
==========================================
Explanation

Nested Loop

One loop is placed inside another loop.

Outer Loop -> Controls rows.
Inner Loop -> Controls columns.

==========================================
*/