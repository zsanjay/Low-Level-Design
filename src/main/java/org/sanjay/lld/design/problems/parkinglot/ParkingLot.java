package org.sanjay.lld.design.problems.parkinglot;

import org.sanjay.lld.design.problems.parkinglot.vehicletype.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot parkingLot;
    private final List<Level> levels;

    private ParkingLot() {
        levels = new ArrayList<>();
    }

    private static class ParkingLotInstance {
        private static final ParkingLot parkingLot = new ParkingLot();
    }

    public static ParkingLot getInstance() {
        return ParkingLotInstance.parkingLot;
    }
    public void addLevel(Level level) {
        levels.add(level);
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            if(level.parkVehicle(vehicle)) {
                System.out.println("Vehicle parked successfully");
                return true;
            }
        }
        System.out.println("Could not park vehicle.");
        return false;
    }

    public boolean unparkVehicle(Vehicle vehicle) {
        for(Level level : levels) {
            if(level.unparkVehicle(vehicle)) {
                System.out.println("Vehicle unparked successfully");
                return true;
            }
        }
        System.out.println("Could not unpark vehicle");
        return false;
    }

    public void displayAvailability() {
        for(Level level : levels) {
            level.displayAvailability();
        }
    }

}
