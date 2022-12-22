package org.example.Buildings.Hotel;

import org.example.Buildings.Bar;
import org.example.Buildings.Buildings;

import java.util.Arrays;

/**
 * Abstract class for a Hotel
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 */
public abstract class Hotel extends Buildings {
    private Room[] rooms;
//    private int roomCount = rooms.length;
    private int occupiedRooms;
//    private int unoccupiedRooms = roomCount - occupiedRooms;
    private int floors;
    private int stars;
    private int pools;
    private int spas;
    private Bar bar;
    private String name;

    /**
     * Constructor for a hotel with a bar
     * @param name name of the hotel
     * @param area in square meters
     * @param address street address
     * @param rooms array of rooms
     * @param floors number of floors
     * @param stars number of stars
     * @param pools number of pools
     * @param spas number of spas
     * @param restaurants number of restaurants
     * @param bar bar of the hotel
     */
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

    /**
     * Constructor for a hotel without a bar
     * @param name name of the hotel
     * @param area in square meters
     * @param address street address
     * @param rooms array of rooms
     * @param floors number of floors
     * @param stars number of stars
     * @param pools number of pools
     * @param spas number of spas
     * @param restaurants number of restaurants
     */
    public Hotel(String name, int area, String address, Room[] rooms, int floors, int stars, int pools, int spas, int restaurants) {
        super(area, address);
        this.rooms = rooms;
        this.floors = floors;
        this.stars = stars;
        this.pools = pools;
        this.spas = spas;
        this.name = name;
    }

    /**
     * Constructor for a hotel with a bar and no defined rooms
     * @param name name of the hotel
     * @param area in square meters
     * @param address street address
     * @param floors number of floors
     * @param stars number of stars
     * @param pools number of pools
     * @param spas number of spas
     * @param restaurants number of restaurants
     */
    public Hotel(String name, int area, String address, int floors, int stars, int pools, int spas, int restaurants) {
        super(area, address);
        this.floors = floors;
        this.stars = stars;
        this.pools = pools;
        this.spas = spas;
        this.name = name;
        this.rooms = new Room[0];
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

    public String getData() {
        return "rooms=" + Arrays.toString(rooms) + ", floors=" + floors + ", stars=" + stars + ", pools=" + pools + ", spas=" + spas + ", bar=" + bar + ", name=" + name;
    }
}


