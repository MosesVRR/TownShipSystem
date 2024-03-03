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
        System.out.println("Property Details:");
        System.out.println("ID: " + property.getId());
        System.out.println("Address: " + property.getAddress());
        System.out.println("Rent: $" + property.getRent());
        System.out.println("Parking Spaces: " + property.getParkingSpaces());
        System.out.println("Owned By: " + property.getOwnedBy());
        System.out.println("Leased By: " + property.getLeasedBy());

        // Access RentReceipt from Property
        RentReceipt associatedRentReceipt = property.getRentReceipt();
        System.out.println("\nRent Receipt Details:");
        System.out.println("ID: " + associatedRentReceipt.getId());
        System.out.println("Amount: $" + associatedRentReceipt.getAmount());
        System.out.println("User: " + associatedRentReceipt.getUser());
        System.out.println("Notes: " + associatedRentReceipt.getNotes());
        System.out.println("Created On: " + associatedRentReceipt.getCreatedOn());
        System.out.println("Updated On: " + associatedRentReceipt.getUpdatedOn());
    }
}
