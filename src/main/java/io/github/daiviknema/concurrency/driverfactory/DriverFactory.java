package io.github.daiviknema.concurrency.driverfactory;

import io.github.daiviknema.concurrency.drivers.IDriver;
import io.github.daiviknema.concurrency.drivers.ThreadUnsafeCounterDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factory class for generating different Drivers
 *
 * @author daivik
 */
public abstract class DriverFactory {
    private static final Logger logger = LoggerFactory.getLogger(DriverFactory.class);

    public static IDriver createDriver(DriverType driverType) {
        if (driverType == null) {
            logger.error("Driver Type passed as null to Driver Factory. Unable to instantiate Driver.");
            return null;
        }
        switch (driverType) {
            case THREAD_UNSAFE_COUNTER_DRIVER -> {
                return new ThreadUnsafeCounterDriver();
            }
            default -> {
                logger.error("Unable to find suitable Driver for specified Driver Type!");
                return null;
            }
        }
    }
}
