package io.github.daiviknema.concurrency.examples.threadunsafecounter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SharedObject {
    private static final Logger logger = LoggerFactory.getLogger(SharedObject.class);
    private Integer counter = 0;

    public void incrementCounter() {
        this.counter++;
    }

    public void printCounterValue() {
        logger.info("Counter value is: {}", this.counter);
    }
}
