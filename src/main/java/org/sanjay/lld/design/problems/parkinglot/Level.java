package org.sanjay.lld.design.problems.parkinglot;

import org.sanjay.lld.design.problems.parkinglot.vehicletype.Vehicle;
import org.sanjay.lld.design.problems.parkinglot.vehicletype.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private final int floor;
    private final List<ParkingSpot> parkingSpots;

    public Level(int floor, int numSpots) {
        this.floor = floor;
        this.parkingSpots = new ArrayList<>(numSpots);

        // Assign spots in the ratio of 50:40:10 for bikes, cars and trucks
        double spotsForBikes = 0.50;
        double spotsForCars = 0.40;

        int numBikes = (int) (numSpots * spotsForBikes);
        int numCars = (int) (numSpots * spotsForCars);

        for(int i = 1; i <= numBikes; i++) {
            parkingSpots.add(new ParkingSpot(i, VehicleType.MOTORCYCLE));
        }

        for(int i = numBikes + 1; i <= numBikes + numCars; i++) {
            parkingSpots.add(new ParkingSpot(i, VehicleType.CAR));
        }

        for(int i = numBikes + numCars + 1; i <= numSpots; i++) {
            parkingSpots.add(new ParkingSpot(i, VehicleType.TRUCK));
        }
    }

    public synchronized boolean parkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(parkingSpot.isAvailable() && parkingSpot.getVehicleType() == vehicle.getVehicleType()) {
                parkingSpot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }

    public synchronized boolean unparkVehicle(Vehicle vehicle) {
        for(ParkingSpot parkingSpot : parkingSpots) {
            if(!parkingSpot.isAvailable() && parkingSpot.getParkedVehicle().equals(vehicle)) {
                parkingSpot.unparkVehicle();
                return true;
            }
        }
        return false;
    }

    public void displayAvailability() {
        System.out.println("Level " + floor + " Availability:");
        for(ParkingSpot spot : parkingSpots) {
            System.out.println("Spot " + spot.getSpotNumber() + ": " + (spot.isAvailable() ? "Available For" : "Occupied By ") + " " + spot.getVehicleType());
        }
    }
}
