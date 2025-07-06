package org.sanjay.lld.design.patternsV2.creational.abstractfactory;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
