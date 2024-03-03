package com.township;

import java.util.Date;

class ParkingReceipt extends Receipts {
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private int parkingDuration;

    public ParkingReceipt(String id, double amount, User user, String notes, Date createdOn, Date updatedOn, ParkingSpot parkingSpot, Vehicle vehicle, int parkingDuration) {
        super(id, amount, user, notes, createdOn, updatedOn); // Call superclass constructor
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.parkingDuration = parkingDuration;
    }

}
