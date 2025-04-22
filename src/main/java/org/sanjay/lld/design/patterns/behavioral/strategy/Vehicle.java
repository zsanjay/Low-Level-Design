package org.sanjay.lld.design.patterns.behavioral.strategy;

import org.sanjay.lld.design.patterns.behavioral.strategy.strategy.DriveStrategy;

public abstract class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
