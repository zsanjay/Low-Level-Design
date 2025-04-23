package org.sanjay.lld.design.problems.logging_framework.logappender;

import org.sanjay.lld.design.problems.logging_framework.LogMessage;

public class ConsoleAppender implements LogAppender{
    @Override
    public void append(LogMessage logMessage) {
        System.out.println(logMessage);
    }
}
