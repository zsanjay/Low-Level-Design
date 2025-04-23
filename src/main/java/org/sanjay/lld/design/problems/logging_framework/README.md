# Designing a Logging Framework

## Requirements
The logging framework should support different log levels, such as DEBUG, INFO, WARNING, ERROR, and FATAL.
It should allow logging messages with a timestamp, log level, and message content.
The framework should support multiple output destinations, such as console, file, and database.
It should provide a configuration mechanism to set the log level and output destination.
The logging framework should be thread-safe to handle concurrent logging from multiple threads.
It should be extensible to accommodate new log levels and output destinations in the future.

## Classes, Interfaces and Enumerations
The LogLevel enum defines the different log levels supported by the logging framework.
The LogMessage class represents a log message with a timestamp, log level, and message content.
The LogAppender interface defines the contract for appending log messages to different output destinations.
The ConsoleAppender, FileAppender, and DatabaseAppender classes are concrete implementations of the LogAppender interface, supporting logging to the console, file, and database, respectively.
The LoggerConfig class holds the configuration settings for the logger, including the log level and the selected log appender.
The Logger class is a singleton that provides the main logging functionality. It allows setting the configuration, logging messages at different levels, and provides convenience methods for each log level.
The LoggingExample class demonstrates the usage of the logging framework, showcasing different log levels, changing the configuration, and logging from multiple threads.