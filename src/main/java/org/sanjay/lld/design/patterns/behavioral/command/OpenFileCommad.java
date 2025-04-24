package org.sanjay.lld.design.patterns.behavioral.command;

public class OpenFileCommad implements Command {
    private FileSystemReceiver fileSystem;
    public OpenFileCommad(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }
    @Override
    public void execute() {
        this.fileSystem.openFile();
    }
}
