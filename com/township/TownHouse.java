package com.township;

class TownHouse extends Property {

    public TownHouse(String id, String address, double rent, int parkingspaces, String ownedBy, String leasedBy, int bedRoomCount, int bathRoomCount) {
        super(id, address, rent, parkingspaces, ownedBy, leasedBy);
        this.bedRoomCount = bedRoomCount;
        this.bathRoomCount = bathRoomCount;
    }

    private int bedRoomCount;
    private int bathRoomCount;
}
