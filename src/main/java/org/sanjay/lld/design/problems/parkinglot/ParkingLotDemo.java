package org.sanjay.lld.design.problems.parkinglot;

import org.sanjay.lld.design.problems.parkinglot.vehicletype.Car;
import org.sanjay.lld.design.problems.parkinglot.vehicletype.Motorcycle;
import org.sanjay.lld.design.problems.parkinglot.vehicletype.Truck;
import org.sanjay.lld.design.problems.parkinglot.vehicletype.Vehicle;

public class ParkingLotDemo {

    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.addLevel(new Level(1, 100));
        parkingLot.addLevel(new Level(2, 80));

        Vehicle car = new Car("ABC123");
        Vehicle truck = new Truck("XYZ123");
        Vehicle motorcycle = new Motorcycle("M1234");

        // Park Vehicles
        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(truck);
        parkingLot.parkVehicle(motorcycle);

        // Display Availability
        parkingLot.displayAvailability();

        // Unpark vehicle
        parkingLot.unparkVehicle(motorcycle);

        // Display updated availability
        parkingLot.displayAvailability();
    }
}
