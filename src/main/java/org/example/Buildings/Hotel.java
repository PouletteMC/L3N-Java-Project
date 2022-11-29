package org.example.Buildings;

import org.example.Person.Tourist;

public class Hotel extends Buildings {

    //    Required fields
    private int rooms;
    private int floors;
    private int stars;
    private int pools;
    private int spas;
    //    Additional fields
    private int restaurants;
    private Bar bar;
    private String name;

    public Hotel(String name, int area, String address, int rooms, int floors, int stars, int pools, int spas) {
        super(area, address);
        this.rooms = rooms;
        this.floors = floors;
        this.stars = stars;
        this.pools = pools;
        this.spas = spas;
        this.restaurants = 0;
        this.bar = null;
        this.name = name;
    }

    public Hotel(String name, int area, String address, int rooms, int floors, int stars, int pools, int spas, int restaurants, Bar bar) {
        super(area, address);
        this.rooms = rooms;
        this.floors = floors;
        this.stars = stars;
        this.pools = pools;
        this.spas = spas;
        this.restaurants = restaurants;
        this.bar = bar;
        this.name = name;
    }

    public int getRooms() {
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

    public int getRestaurants() {
        return restaurants;
    }

    public Bar getBars() {
        return bar;
    }

    public String getName() {
        return name;
    }

    public void setRooms(int rooms) {
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

    public void setRestaurants(int restaurants) {
        this.restaurants = restaurants;
    }

    public void setBars(Bar bar) {
        this.bar = bar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTax() {
        return rateA * area;
    }

    @Override
    public String toString() {
        return name + " has " + rooms + " rooms, " + floors + " floors, " + stars + " stars, " + pools + " pools, " + spas + " spas, " + restaurants + " restaurants, " + bar + " bar, " + " and is located at " + getAddress() + ".";
    }

}

class Room {

    private int number;
    private Tourist occupant;
    private boolean isOccupied;
    private static int roomCount = 0;
    private static int occupied = 0;
    private static int unoccupied = 0;



}
