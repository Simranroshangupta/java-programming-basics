// Continue Statement in Java
// The continue statement skips the current iteration.

public class ContinueStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }
    }
}

/*
==========================================
Explanation

continue

Skips the current iteration and
moves to the next iteration.

==========================================
*/