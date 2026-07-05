// Practical 09 (a)
// Program to create two threads and execute them concurrently.

class ThreadOne extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 1 : " + i);
        }
    }
}

class ThreadTwo extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Thread 2 : " + i);
        }
    }
}

public class TwoThreads {

    public static void main(String[] args) {

        ThreadOne threadOne = new ThreadOne();

        ThreadTwo threadTwo = new ThreadTwo();

        threadOne.start();

        threadTwo.start();
    }
}

/*
==========================================
Explanation

A thread is a separate path of
execution in a program.

This program creates two threads
that run at the same time.

The start() method is used to
start each thread.

Time Complexity : O(n)
Space Complexity : O(1)

==========================================
*/