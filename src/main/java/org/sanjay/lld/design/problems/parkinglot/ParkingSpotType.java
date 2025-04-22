package org.sanjay.lld.design.problems.parkinglot;
public enum ParkingSpotType {
    HANDICAPPED(1),
    COMPACT(2),
    LARGE(3),
    MOTORBIKE(4),
    ELECTRIC(5);

    private final int value;
    ParkingSpotType(int value) {
        this.value = value;
    }
}
