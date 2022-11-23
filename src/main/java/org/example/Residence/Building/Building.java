package org.example.Residence.Building;

import org.example.Residence.Residence;

public class Building extends Residence {
    private int floors; // number of floors
    private static int buildingCount;
    private String address;

    public Building(int floors, String address) {
        this.floors = floors;
        this.address = address;
        buildingCount++;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
