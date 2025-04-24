package org.sanjay.lld.design.patterns.behavioral.command;

public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;
    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystemReceiver = fs;
    }
    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
