package org.sanjay.lld.design.patterns.behavioral.command;

public class CloseFileCommand implements Command {
    private FileSystemReceiver fileSystem;
    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }
}
