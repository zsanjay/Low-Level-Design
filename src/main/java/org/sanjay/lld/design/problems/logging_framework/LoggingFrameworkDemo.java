package org.sanjay.lld.design.problems.logging_framework;

import org.sanjay.lld.design.problems.logging_framework.logappender.FileAppender;

public class LoggingFrameworkDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Logging with default configuration
        logger.info("This is an information message");
        logger.error("This is an error message");
        logger.warning("This is a warning message");

        // Changing log level and appender
        LoggerConfig config = new LoggerConfig(LogLevel.DEBUG, new FileAppender("app.log"));
        logger.setConfig(config);

        logger.debug("This is a debug Message");
        logger.info("This is an information message");
    }
}
