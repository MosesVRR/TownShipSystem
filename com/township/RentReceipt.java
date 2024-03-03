package com.township;

import java.util.Date;

class RentReceipt extends Receipts {
    private Property property;
    private int rentDuration;

    public RentReceipt(String id, double amount, User user, String notes, Date createdOn, Date updatedOn, Property property, int rentDuration) {
        super(id, amount, user, notes, createdOn, updatedOn);
        this.property = property;
        this.rentDuration = rentDuration;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }
    public int getRentDuration() {
        return rentDuration;
    }
    public void setRentDuration(int rentDuration) {
        this.rentDuration = rentDuration;
    }
    public String getId() {
        return super.getId();
    }

    public double getAmount() {
        return super.getAmount();
    }

    public User getUser() {
        return super.getUser();
    }

    public String getNotes() {
        return super.getNotes();
    }

    public Date getCreatedOn() {
        return super.getCreatedOn();
    }

    public Date getUpdatedOn() {
        return super.getUpdatedOn();
    }

    public void printDetails(){
        System.out.println("\nRent Receipt Details:");
        System.out.println("ID: " + this.getId());
        System.out.println("Amount: $" + this.getAmount());
        System.out.println("User: " + this.getUser());
        System.out.println("Notes: " + this.getNotes());
        System.out.println("Created On: " + this.getCreatedOn());
        System.out.println("Updated On: " + this.getUpdatedOn());
    }

}
