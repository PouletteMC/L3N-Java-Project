package org.example.Buildings;

import org.example.Person.Resident;

public class House extends Buildings {
    private int gardenArea; // in square meters
    private int rooms; // number of rooms
    private int floors; // number of floors
    private boolean garage; // has a garage or not

    public House(int area, String address, int gardenArea, int rooms, int floors, boolean garage) {
        super(area, address);
        this.gardenArea = gardenArea;
        this.rooms = rooms;
        this.floors = floors;
        this.garage = garage;
    }

    public House(int area, String address, Resident resident, int gardenArea, int rooms, int floors, boolean garage) {
        super(area, address, resident);
        this.gardenArea = gardenArea;
        this.rooms = rooms;
        this.floors = floors;
        this.garage = garage;
    }

    public int getGardenArea() {
        return gardenArea;
    }

    public int getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    public boolean getGarage() {
        return garage;
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public double getTax() {
        return rateA * area + rateB * gardenArea;
    }

    @Override
    public String toString() {
        return "The house at " + address + " has " + rooms + " rooms, " + floors + " floors, " + gardenArea + " square meters of garden and " + (garage ? "a garage." : "no garage."); // Ternary operator just to flex it
    }
}
