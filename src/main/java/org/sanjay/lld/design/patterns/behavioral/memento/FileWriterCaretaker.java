package org.sanjay.lld.design.patterns.behavioral.memento;

public class FileWriterCaretaker {
    private Object object;
    public void save(FileWriterUtil fileWriter) {
        this.object = fileWriter.save();
    }

    public void undo(FileWriterUtil fileWriter) {
        fileWriter.undoToLastSave(object);
    }
}
