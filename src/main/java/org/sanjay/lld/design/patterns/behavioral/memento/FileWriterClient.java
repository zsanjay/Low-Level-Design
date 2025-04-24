package org.sanjay.lld.design.patterns.behavioral.memento;

public class FileWriterClient {

    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println(fileWriter + "\n\n");

        caretaker.save(fileWriter);

        fileWriter.write("Second Set of Data\n");

        System.out.println(fileWriter + "\n\n");

        caretaker.undo(fileWriter);

        System.out.println(fileWriter + "\n\n");
    }
}
