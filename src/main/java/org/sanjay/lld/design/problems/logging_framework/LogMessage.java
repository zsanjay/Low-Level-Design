package org.sanjay.lld.design.problems.logging_framework;
public class LogMessage {
    private String message;
    private long timestamp;
    private LogLevel level;
    public LogMessage(String message, LogLevel logLevel) {
        this.level = logLevel;
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }
    public LogLevel getLevel() {
        return level;
    }
    public String getMessage() {
        return message;
    }
    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "[" + level + "] " + timestamp + " - " + message;
    }
}
