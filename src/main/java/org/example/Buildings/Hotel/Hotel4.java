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
     * @param name Name of the hotel
     * @param area Area of the hotel
     * @param address Address of the hotel
     * @param rooms Number of rooms in the hotel
     * @param floors Number of floors in the hotel
     * @param spas Number of spas in the hotel
     * @param restaurants Number of restaurants in the hotel
     * @param bar Bar in the hotel
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int, Bar)
     */
    public Hotel4(String name, int area, String address, Room[] rooms, int floors, int spas, int restaurants, Bar bar) {
        super(name, area, address, rooms, floors, 4, 1, spas, restaurants, bar);
    }

    /**
     * Constructor without a bar
     * @param name name of the hotel
     * @param area area of the hotel
     * @param address address of the hotel
     * @param rooms rooms of the hotel
     * @param floors floors of the hotel
     * @param spas spas of the hotel
     * @param restaurants restaurants of the hotel
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int)
     */
    public Hotel4(String name, int area, String address, Room[] rooms, int floors, int spas, int restaurants) {
        super(name, area, address, rooms, floors, 4, 1, spas, restaurants);
    }

    /**
     * Constructor without a bar or rooms
     * @param name name of the hotel
     * @param area area of the hotel
     * @param address address of the hotel
     * @param floors floors of the hotel
     * @param spas spas of the hotel
     * @param restaurants restaurants of the hotel
     * @see Hotel#Hotel(String, int, String, int, int, int, int, int)
     */
    public Hotel4(String name, int area, String address, int floors, int spas, int restaurants) {
        super(name, area, address, floors, 4, 1, spas, restaurants);
    }

    @Override
    public String toString() {
        return "Hotel4{" + super.getData() + '}';
    }
}
