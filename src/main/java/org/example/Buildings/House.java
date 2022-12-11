package org.example.Buildings;

import org.example.Person.Resident;

public class House extends Buildings {
    /* Parameters */
    private int gardenArea; // in square meters
    private int rooms; // number of rooms
    private int floors; // number of floors
    private boolean garage; // has a garage or not

    /* Constructors */
    public House(int area, String address, int gardenArea, int rooms, int floors, boolean garage) {
        super(area, address); // call the constructor of the superclass
        this.gardenArea = gardenArea; // set the value of the instance variable
        this.rooms = rooms; // set the value of the instance variable
        this.floors = floors; // set the value of the instance variable
        this.garage = garage; // set the value of the instance variable
    }

    public House(int area, String address, Resident resident, int gardenArea, int rooms, int floors, boolean garage) {
        super(area, address, resident); // call the constructor of the superclass
        this.gardenArea = gardenArea; // set the value of the gardenArea field
        this.rooms = rooms; // set the value of the rooms field
        this.floors = floors; // set the value of the floors field
        this.garage = garage; // set the value of the garage field
    }

    /* getters */
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

    /* setters */
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

    /* Methods required by the superclass */
    @Override
    public double getTax() {
        return rateA * area + rateB * gardenArea;
    }
    @Override
    public String toString() {
        return "The house at " + address + " has " + rooms + " rooms, " + floors + " floors, " + gardenArea + " square meters of garden and " + (garage ? "a garage." : "no garage."); // Ternary operator just to flex it
    }
}
