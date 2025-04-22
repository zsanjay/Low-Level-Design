package org.sanjay.lld.design.patterns.behavioral.strategy.strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
