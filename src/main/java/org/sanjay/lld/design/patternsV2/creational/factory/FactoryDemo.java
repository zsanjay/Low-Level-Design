package org.sanjay.lld.design.patternsV2.creational.factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Computer computer = ComputerFactory.getComputer("Server", "16GB", "1TB", "2.5GHz");
        System.out.println(computer);
        computer = ComputerFactory.getComputer("PC", "8GB", "500GB", "3.0GHz");
        System.out.println(computer);
    }
}
