// Practical 09 (c)
// Program to create a thread using the Runnable interface.

class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread : " + i);
        }
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        MyRunnable runnable = new MyRunnable();

        Thread thread = new Thread(runnable);

        thread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Main Thread : " + i);
        }
    }
}

/*
==========================================
Explanation

Instead of extending Thread,
a class can implement the
Runnable interface.

This approach is preferred because
Java supports single inheritance.

The Runnable object is passed to
the Thread class to create a thread.

Time Complexity : O(n)
Space Complexity : O(1)

==========================================
*/