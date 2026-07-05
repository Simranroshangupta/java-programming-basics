// Practical 09 (b)
// Program to create a thread by extending the Thread class.

class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread : " + i);
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        MyThread thread = new MyThread();

        thread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Main Thread : " + i);
        }
    }
}

/*
==========================================
Explanation

A new thread can be created by
extending the Thread class.

The run() method contains the
code executed by the thread.

The start() method starts the
new thread.

Time Complexity : O(n)
Space Complexity : O(1)

==========================================
*/