package org.sanjay.lld.design.patterns.behavioral.memento;

public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }
    private class Memento {
        private String fileName;
        private StringBuilder content;
        public Memento(String fileName, StringBuilder content) {
            this.fileName = fileName;
            this.content = new StringBuilder(content);
        }
    }
}
