// ThreadClass.java
// Demonstrates creating a thread by extending the Thread class.

class MyThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Child Thread : " + i);
        }
    }
}

public class ThreadClass {

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

Thread

A thread is the smallest unit
of execution.

start()

Starts a new thread.

run()

Contains the code executed
by the thread.

Never call run() directly.

==========================================
*/