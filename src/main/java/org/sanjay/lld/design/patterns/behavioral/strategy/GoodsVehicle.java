package org.sanjay.lld.design.patterns.behavioral.strategy;

import org.sanjay.lld.design.patterns.behavioral.strategy.strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
