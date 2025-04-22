package org.sanjay.lld.design.patterns.behavioral.strategy.strategy;

public class SportsDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
