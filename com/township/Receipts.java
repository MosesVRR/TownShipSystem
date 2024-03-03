package com.township;

import java.util.Date;

class Receipts {
    protected String id;
    protected double amount;
    protected User user;
    protected String notes;
    protected Date createdOn;
    protected Date updatedOn;

    public Receipts(String id, double amount, User user, String notes, Date createdOn, Date updatedOn) {
        this.id = id;
        this.amount = amount;
        this.user = user;
        this.notes = notes;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public Receipts() {

    }

    public void createReceipt() {
        // Implementation
    }

    public Receipts getReceipt(int id) {
        // Implementation
        return null;
    }

    public void updateReceipt(int id) {
        // Implementation
    }

    public void deleteReceipt(int id) {
        // Implementation
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }
}
