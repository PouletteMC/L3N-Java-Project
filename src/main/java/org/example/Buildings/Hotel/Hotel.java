package org.example.Buildings.Hotel;

import org.example.Buildings.Bar;
import org.example.Buildings.Buildings;

abstract class Hotel extends Buildings {

    private int roomCount;
    private int occupiedRooms;
    private int unoccupiedRooms = roomCount - occupiedRooms;
    private Room[] rooms;

    private int floors;
    private int stars;
    private int pools;
    private int spas;


    private Bar bar;
    private String name;

    public Hotel(String name, int area, String address, Room[] rooms, int floors, int stars, int pools, int spas, int restaurants, Bar bar) {
        super(area, address);
        this.rooms = rooms;
        this.floors = floors;
        this.stars = stars;
        this.pools = pools;
        this.spas = spas;
        this.bar = bar;
        this.name = name;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public int getFloors() {
        return floors;
    }

    public int getStars() {
        return stars;
    }

    public int getPools() {
        return pools;
    }

    public int getSpas() {
        return spas;
    }


    public Bar getBars() {
        return bar;
    }

    public String getName() {
        return name;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setPools(int pools) {
        this.pools = pools;
    }

    public void setSpas(int spas) {
        this.spas = spas;
    }


    public void setBars(Bar bar) {
        this.bar = bar;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getTax() {
        return rateA * area;
    }
    @Override
    public String toString() {
        return name + " has " + rooms + " rooms, " + floors + " floors, " + stars + " stars, " + pools + " pools, " + spas + " spas, " + bar + " bar, " + " and is located at " + getAddress() + "." + " The tax is " + getTax() + ".";
    }

}


