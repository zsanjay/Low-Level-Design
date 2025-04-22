package org.sanjay.lld.design.patterns.behavioral.strategy;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle goodsVehicle = new GoodsVehicle();
        Vehicle sportsVehicle = new SportsVehicle();
        Vehicle offRoadVehicle = new OffRoadVehicle();

        goodsVehicle.drive();
        sportsVehicle.drive();
        offRoadVehicle.drive();
    }
}
