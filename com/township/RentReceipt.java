package com.township;

import java.util.Date;

class RentReceipt extends Receipts {
    private Property property;
    private int rentDuration;

    public RentReceipt(Property property){
        super();
        this.property=property;
    }

    public RentReceipt(String id, double amount, User user, String notes, Date createdOn, Date updatedOn, Property property, int rentDuration) {
        super(id, amount, user, notes, createdOn, updatedOn);
        this.property = property;
        this.rentDuration = rentDuration;
    }

    public RentReceipt(String number, int i, User Moses, String monthlyRentPayment, Date date, Date date1) {
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

}
