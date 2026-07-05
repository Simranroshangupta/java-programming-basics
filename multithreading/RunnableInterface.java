// RunnableInterface.java
// Demonstrates creating a thread using the Runnable interface.

class MyRunnable implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Runnable Thread : " + i);
        }
    }
}

public class RunnableInterface {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());

        thread.start();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Main Thread : " + i);
        }
    }
}

/*
==========================================
Explanation

Runnable Interface

Preferred over extending Thread.

Why?

Java supports single inheritance.

Implementing Runnable allows
your class to extend another class.

==========================================
*/