package org.sanjay.lld.design.patterns.structural.proxy;

import java.io.IOException;

public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
