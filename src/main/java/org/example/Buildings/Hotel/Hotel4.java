package org.example.Buildings.Hotel;

import org.example.Buildings.Bar;


/**
 *
 * @author Eliot
 * @version 1.0
 */

public class Hotel4 extends Hotel{

    /**
     * Constructor with a bar
     * @param name
     * @param area
     * @param address
     * @param rooms
     * @param floors
     * @param stars
     * @param spas
     * @param restaurants
     * @param bar
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int, Bar)
     */
    public Hotel4(String name, int area, String address, Room[] rooms, int floors, int stars, int spas, int restaurants, Bar bar) {
        super(name, area, address, rooms, floors, stars, 1, spas, restaurants, bar);
    }

    /**
     * Constructor without a bar
     * @param name
     * @param area
     * @param address
     * @param rooms
     * @param floors
     * @param stars
     * @param spas
     * @param restaurants
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int)
     */
    public Hotel4(String name, int area, String address, Room[] rooms, int floors, int stars, int spas, int restaurants) {
        super(name, area, address, rooms, floors, stars, 1, spas, restaurants);
    }

    /**
     * Constructor without a bar or rooms
     * @param name
     * @param area
     * @param address
     * @param floors
     * @param stars
     * @param spas
     * @param restaurants
     * @see Hotel#Hotel(String, int, String, int, int, int, int, int)
     */
    public Hotel4(String name, int area, String address, int floors, int stars, int spas, int restaurants) {
        super(name, area, address, floors, stars, 1, spas, restaurants);
    }

    @Override
    public String toString() {
        return "Hotel4{" + super.getData() + '}';
    }
}
