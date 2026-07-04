// Break Statement in Java
// The break statement immediately terminates the loop.

public class BreakStatement {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }
    }
}

/*
==========================================
Explanation

break

Stops the loop immediately when executed.

==========================================
*/