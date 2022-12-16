package org.example.Buildings;

import org.example.Person.Resident;

/**
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.0
 */
public class House extends Buildings {
    /* Parameters */
    private int gardenArea; // in square meters
    private int rooms; // number of rooms
    private int floors; // number of floors
    private boolean garage; // has a garage or not

    /**
     * Constructor for a house with no resident
     * @param area in square meters
     * @param address street address
     * @param gardenArea in square meters
     * @param rooms number of rooms
     * @param floors number of floors
     * @param garage has a garage or not
     */
    public House(int area, String address, int gardenArea, int rooms, int floors, boolean garage) {
        super(area, address); // call the constructor of the superclass
        this.gardenArea = gardenArea; // set the value of the instance variable
        this.rooms = rooms; // set the value of the instance variable
        this.floors = floors; // set the value of the instance variable
        this.garage = garage; // set the value of the instance variable
    }

    /**
     * Constructor for a house with a resident
     * @param area in square meters
     * @param address street address
     * @param resident resident of the house
     * @param gardenArea in square meters
     * @param rooms number of rooms
     * @param floors number of floors
     * @param garage has a garage or not
     */
    public House(int area, String address, Resident resident, int gardenArea, int rooms, int floors, boolean garage) {
        super(area, address, resident); // call the constructor of the superclass
        this.gardenArea = gardenArea; // set the value of the gardenArea field
        this.rooms = rooms; // set the value of the rooms field
        this.floors = floors; // set the value of the floors field
        this.garage = garage; // set the value of the garage field
    }

    /**
     * @return The area of the garden
     */
    public int getGardenArea() {
        return gardenArea;
    }
    /**
     * @return The number of rooms
     */
    public int getRooms() {
        return rooms;
    }
    /**
     * @return The number of floors
     */
    public int getFloors() {
        return floors;
    }
    /**
     * @return Whether the house has a garage or not
     */
    public boolean getGarage() {
        return garage;
    }

    /**
     * @param gardenArea The new area of the garden
     */
    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea;
    }
    /**
     * @param rooms The new number of rooms
     */
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    /**
     * @param floors The new number of floors
     */
    public void setFloors(int floors) {
        this.floors = floors;
    }
    /**
     * @param garage The new garage status
     */
    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    /**
     * @return The tax on the house
     * @see Buildings#getTax()
     */
    @Override
    public double getTax() {
        return rateA * area + rateB * gardenArea;
    }
    /**
     * @return The string representation of the house
     * @see Buildings#toString()
     */
    @Override
    public String toString() {
        return "The house at " + address + " has " + rooms + " rooms, " + floors + " floors, " + gardenArea + " square meters of garden and " + (garage ? "a garage." : "no garage."); // Ternary operator just to flex it
    }
}
