package io.github.daiviknema.concurrency.drivers;

import io.github.daiviknema.concurrency.examples.threadunsafecounter.SharedObject;
import io.github.daiviknema.concurrency.examples.threadunsafecounter.ThreadUnsafeCounter;

/**
 * Example to show that two threads incrementing the same shared counter variable without proper synchronization can lead to the counter ending up in an inconsistent state.
 *
 * @author daivik
 */
public class ThreadUnsafeCounterDriver implements IDriver {
    public void run(String[] args) throws InterruptedException {
        // Create a shared object
        SharedObject sharedObject = new SharedObject();

        // Pass the shared object to two threads. Each thread will attempt to increment the shared object counter 20,000 times
        Thread t1 = new Thread(new ThreadUnsafeCounter(sharedObject));
        Thread t2 = new Thread(new ThreadUnsafeCounter(sharedObject));

        // Start execution of both threads
        t1.start();
        t2.start();

        // Wait for execution of both threads to complete
        t1.join();
        t2.join();

        // At the end of everything, the counter value will not be 40,000
    }
}
