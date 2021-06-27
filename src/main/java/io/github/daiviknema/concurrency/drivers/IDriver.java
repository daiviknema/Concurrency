package io.github.daiviknema.concurrency.drivers;

/**
 * Driver interface. Implemented by various Driver classes such as {@link ThreadUnsafeCounterDriver}
 *
 * @author daivik
 */
public interface IDriver {
    void run(String[] args) throws InterruptedException;
}
