package com.township;

class Property {
    private String id;
    private String address;
    private double rent;
    private int parkingSpaces;
    private String ownedBy;
    private String leasedBy;

    private RentReceipt rentReceipt; // Association with RentReceipt


    // Constructor, getters, setters, and other methods

    public Property(String id, String address, double rent, int parkingSpaces, String ownedBy, String leasedBy) {
        this.id = id;
        this.address = address;
        this.rent = rent;
        this.parkingSpaces = parkingSpaces;
        this.ownedBy = ownedBy;
        this.leasedBy = leasedBy;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public String getLeasedBy() {
        return leasedBy;
    }

    public void setLeasedBy(String leasedBy) {
        this.leasedBy = leasedBy;
    }

    public void setRentReceipt(RentReceipt rentReceipt) {
        this.rentReceipt = rentReceipt;
    }

    public RentReceipt getRentReceipt() {
        return rentReceipt;
    }
}
