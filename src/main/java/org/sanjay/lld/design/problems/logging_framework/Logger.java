package org.sanjay.lld.design.problems.logging_framework;

import org.sanjay.lld.design.problems.logging_framework.logappender.ConsoleAppender;

public class Logger {
    private static volatile Logger logger = null;
    private LoggerConfig config;

    private Logger() {
        config = new LoggerConfig(LogLevel.INFO , new ConsoleAppender());
    }

    public static Logger getInstance() {
        if(logger == null) {
            synchronized (Logger.class) {
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }

    public void setConfig(LoggerConfig config) {
        this.config = config;
    }
    public void log(LogLevel logLevel, String message) {
        if(logLevel.ordinal() >= config.getLogLevel().ordinal()) {
            LogMessage logMessage = new LogMessage(message, logLevel);
            config.getLogAppender().append(logMessage);
        }
    }

    public void debug(String message) {
        log(LogLevel.DEBUG, message);
    }
    public void info(String message) {
        log(LogLevel.INFO, message);
    }
    public void warning(String message) {
        log(LogLevel.WARNING, message);
    }
    public void error(String message) {
        log(LogLevel.ERROR, message);
    }
    public void fatal(String message) {
        log(LogLevel.FATAL, message);
    }
 }
