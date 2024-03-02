import java.util.*;

class Property {
    protected String id;
    protected String address;
    protected double rent;
    protected int parkingspaces;
    protected String ownedBy;
    protected String leasedBy;

    public void createProperty() {
        // Implementation
    }

    public void updateProperty() {
        // Implementation
    }

    public Property getProperty(String id) {
        // Implementation
        return null;
    }

    public List<Property> getProperties() {
        // Implementation
        return null;
    }

    public void deleteProperty(String id) {
        // Implementation
    }
}

class TownHouse extends Property {
    private int bedRoomCount;
    private int bathRoomCount;
}

class Apartment extends Property {
    private int floors;
    private int units;
    private List<String> amenities;

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

class Penthouse extends Apartment {
    private String unitID;
}

class Studio extends Apartment {
    private String unitID;
}

class Condo extends Apartment {
    private String unitID;
}

class ParkingSpot {
    private String id;
    private String size;
    private int parkingNo;
    private Property property;
    private Vehicle vehicle;
    private double price;

    public void createParkingSpot() {
        // Implementation
    }

    public void updateParkingSpot() {
        // Implementation
    }

    public ParkingSpot getParkingSpot(String id) {
        // Implementation
        return null;
    }

    public boolean checkAvailability() {
        // Implementation
        return false;
    }

    public List<ParkingSpot> getAllParkingInfo() {
        // Implementation
        return null;
    }

    public void deleteParkingSpot(String id) {
        // Implementation
    }
}

class Vehicle {
    private String id;
    private String plateNo;

    public void park() {
        // Implementation
    }

    public void reserve() {
        // Implementation
    }

    public void empty() {
        // Implementation
    }
}

class Sedan extends Vehicle {
    private String size;
}

class SUV extends Vehicle {
    private String size;
}

class Hatchback extends Vehicle {
    private String size;
}

class Receipts {
    private String id;
    private double amount;
    private User user;
    private String notes;
    private Date createdOn;
    private Date updatedOn;

    public void createReceipt() {
        // Implementation
    }

    public Receipts getReceipt(String id) {
        // Implementation
        return null;
    }

    public void updateReceipt() {
        // Implementation
    }

    public void deleteReceipt(String id) {
        // Implementation
    }
}

class ParkingReceipt extends Receipts {
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private int parkingDuration;
}

class RentReceipt extends Receipts {
    private Property property;
    private int rentDuration;
}

class User {
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    public void login() {
        // Implementation
    }

    public void register() {
        // Implementation
    }

    public void getProfile() {
        // Implementation
    }

    public void updateProfile() {
        // Implementation
    }

    public void forgotPassword() {
        // Implementation
    }
}

class Admin extends User {
    public void updateUser() {
        // Implementation
    }

    public void deleteUser() {
        // Implementation
    }
}

class Tenant extends User {
    private Property property;
    private List<RentReceipt> receipts;

    public void generateReceipt() {
        // Implementation
    }

    public void payReceipt() {
        // Implementation
    }

    public RentReceipt getReceipt(String id) {
        // Implementation
        return null;
    }
}

class Guest extends User {
}
