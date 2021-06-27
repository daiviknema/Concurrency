package io.github.daiviknema.concurrency.examples.threadunsafecounter;

/**
 * Example to illustrate that two threads incrementing the same shared counter variable without proper synchronization leads to inconsistent state. Also soo {@link io.github.daiviknema.concurrency.drivers.ThreadUnsafeCounterDriver}
 *
 * @author daivik
 */
public class ThreadUnsafeCounter implements Runnable {
    // The object that needs to be incremented
    private SharedObject sharedObject;

    public ThreadUnsafeCounter(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    // Thread logic. Increments the sharedObject 20,000 times
    @Override
    public void run() {
        for (int i = 0; i < 20000; i++) {
            // Following section of code should only be executed by one thread at a time
            // Ie. this is a critical section
            sharedObject.incrementCounter();
            sharedObject.printCounterValue();
        }
    }
}
