package org.example.Residence;

public class House extends Residence {
    private int area; // in square meters
    private int gardenArea; // in square meters
    private int rooms; // number of rooms
    private String address; // street address

    public House(int area, int gardenArea, int rooms, String address) {
        this.area = area; // Set the area
        this.gardenArea = gardenArea; // Set the garden area
        this.rooms = rooms; // Set the number of rooms
        this.address = address; // Set the address
    }

    public int getArea() {
        return area; // Return the area
    }

    public int getGardenArea() {
        return gardenArea; // Return the garden area
    }

    public int getRooms() {
        return rooms; // Return the number of rooms
    }

    public String getAddress() {
        return address; // Return the address
    }

    public void setArea(int area) {
        this.area = area; // Set the area
    }

    public void setGardenArea(int gardenArea) {
        this.gardenArea = gardenArea; // Set the garden area
    }

    public void setRooms(int rooms) {
        this.rooms = rooms; // Set the number of rooms
    }

    public void setAddress(String address) {
        this.address = address; // Set the address
    }
}
