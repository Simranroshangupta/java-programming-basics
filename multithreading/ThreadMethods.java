// ThreadMethods.java
// Demonstrates common thread methods.

class WorkerThread extends Thread {

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                System.out.println(getName() + " : " + i);

                Thread.sleep(1000);
            }

        } catch (InterruptedException exception) {

            System.out.println(exception.getMessage());
        }
    }
}

public class ThreadMethods {

    public static void main(String[] args) {

        WorkerThread thread = new WorkerThread();

        thread.setName("Worker Thread");

        thread.start();

        System.out.println("Thread State : " + thread.getState());
    }
}

/*
==========================================
Explanation

Important Thread Methods

start()

Starts a thread.

sleep()

Pauses execution.

getName()

Returns thread name.

setName()

Changes thread name.

getState()

Returns current thread state.

==========================================
*/