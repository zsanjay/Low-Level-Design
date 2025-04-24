package org.sanjay.lld.design.patterns.behavioral.command;

/**
 * Command Pattern is one of the Behavioral Design Pattern and it’s used
 * to implement lose coupling in a request-response model. In command
 * pattern, the request is send to the invoker and invoker pass it to the
 * encapsulated command object. Command object passes the request to the
 * appropriate method of Receiver to perform the specific action. The client
 * program create the receiver object and then attach it to the Command. Then
 * it creates the invoker object and attach the command object to perform an
 * action. Now when client program executes the action, it’s processed based
 * on the command and receiver object.
 * We will look at a real life scenario where we can implement Command
 * pattern. Let’s say we want to provide a File System utility with methods to
 * open, write and close file and it should support multiple operating systems
 * such as Windows and Unix.
 * To implement our File System utility, first of all we need to create the
 * receiver classes that will actually do all the work. Since we code in terms of
 * java interfaces, we can have FileSystemReceiver interface and it’s
 * implementation classes for different operating system flavors such as
 * Windows, Unix, Solaris etc.
 */
public class FileSystemClient {

    public static void main(String[] args) {

        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        OpenFileCommad openFileCommad = new OpenFileCommad(fs);
        FileInvoker file = new FileInvoker(openFileCommad);
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
