package com.township;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create Property instance
        Property property = new Property("123", "123 Main St", 1500, 2, "Sarvesh", "Moses");

        // Create User instances
        User Sarvesh = new User("Sarvesh");
        User Moses = new User("Moses");

        // Create RentReceipt instance
        RentReceipt rentReceipt = new RentReceipt("456", 1500, Moses, "Monthly rent payment", new Date(), new Date(), property, 12);

        // Establish relationship between Property and RentReceipt
        property.setRentReceipt(rentReceipt);
        rentReceipt.setProperty(property);

        // Output details
        property.printDetails();
        

        // Access RentReceipt from Property
        RentReceipt associatedRentReceipt = property.getRentReceipt();
        associatedRentReceipt.printDetails();
        
    }
}
