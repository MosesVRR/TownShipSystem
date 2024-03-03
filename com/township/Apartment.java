package com.township;

import java.util.List;

class Apartment extends Property {
    private int floors;
    private int units;
    private List<String> amenities;

    public Apartment(String id, String address, double rent, int parkingspaces, String ownedBy, String leasedBy, int floors, int units, List<String> amenities) {
        super(id, address, rent, parkingspaces, ownedBy, leasedBy);
        this.floors = floors;
        this.units = units;
        this.amenities = amenities;
    }

    public void getUnitsInfo() {
        // Implementation
    }

    public void createUnit() {
        // Implementation
    }

    public void updateUnit() {
        // Implementation
    }

    public void deleteUnit() {
        // Implementation
    }
}
