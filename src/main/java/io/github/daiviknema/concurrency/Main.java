package io.github.daiviknema.concurrency;

import io.github.daiviknema.concurrency.driverfactory.DriverFactory;
import io.github.daiviknema.concurrency.driverfactory.DriverType;
import io.github.daiviknema.concurrency.drivers.IDriver;

/**
 * Entrypoint of the application
 *
 * @author daivik
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        // TODO: Add logic for parsing command line arguments and selecting appropriate driver
        IDriver threadUnsafeCounterDriver = DriverFactory.createDriver(DriverType.THREAD_UNSAFE_COUNTER_DRIVER);
        threadUnsafeCounterDriver.run(args);
    }
}
