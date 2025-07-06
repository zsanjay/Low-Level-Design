package org.sanjay.lld.design.patternsV2.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
       Computer pc = ComputerFactory.getComputer(new PCFactory("16 GB", "1 TB", "Intel i7"));
       System.out.println("PC Config: " + pc);
       Computer server = ComputerFactory.getComputer(new ServerFactory("32 GB", "2 TB", "Intel Xeon"));
       System.out.println("Server Config: " + server);
    }
}
