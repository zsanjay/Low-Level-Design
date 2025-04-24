package org.sanjay.lld.design.patterns.behavioral.command;

public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
