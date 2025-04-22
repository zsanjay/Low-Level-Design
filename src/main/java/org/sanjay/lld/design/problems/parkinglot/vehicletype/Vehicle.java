package org.sanjay.lld.design.problems.parkinglot.vehicletype;

public abstract class Vehicle {
    protected String licensePlate;
    protected VehicleType vehicleType;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
