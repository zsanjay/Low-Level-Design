package org.sanjay.lld.design.patterns.behavioral.strategy;

import org.sanjay.lld.design.patterns.behavioral.strategy.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
