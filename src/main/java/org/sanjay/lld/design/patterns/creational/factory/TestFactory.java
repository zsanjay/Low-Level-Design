package org.sanjay.lld.design.patterns.creational.factory;

public class TestFactory {

    public static void main(String[] args) {
       Computer pc =  ComputerFactory.getComputer("PC" , "8GB" , "500GB", "2.4 GHz");
       System.out.println("Factory PC Config = "+ pc);
        Computer server =  ComputerFactory.getComputer("Server" , "8GB" , "500GB", "2.4 GHz");
        System.out.println("Factory Server Config = "+ server);
    }
}
