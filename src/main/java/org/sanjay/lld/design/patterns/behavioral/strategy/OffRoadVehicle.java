package org.sanjay.lld.design.patterns.behavioral.strategy;

import org.sanjay.lld.design.patterns.behavioral.strategy.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
