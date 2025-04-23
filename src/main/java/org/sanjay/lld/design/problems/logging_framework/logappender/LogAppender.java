package org.sanjay.lld.design.problems.logging_framework.logappender;

import org.sanjay.lld.design.problems.logging_framework.LogMessage;
public interface LogAppender {
    void append(LogMessage logMessage);
}
