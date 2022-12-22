package org.example.Buildings.Hotel;

import org.example.Buildings.Bar;

/**
 * Creates a 5-star Hotel object
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 */
public class Hotel5 extends Hotel {
    private final int suites;

    /**
     * Constructor with a bar
     * @param name Name of the hotel
     * @param area Area of the hotel
     * @param address Address of the hotel
     * @param rooms Number of rooms in the hotel
     * @param floors Number of floors in the hotel
     * @param pools Number of pools in the hotel
     * @param spas Number of spas in the hotel
     * @param restaurants Number of restaurants in the hotel
     * @param bar Bar in the hotel
     * @param suites Number of suites in the hotel
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int, Bar)
     */
    public Hotel5(String name, int area, String address, Room[] rooms, int floors, int pools, int spas, int restaurants, Bar bar, int suites) {
        super(name, area, address, rooms, floors, 5, pools, spas, restaurants, bar);
        this.suites = suites;
    }

    /**
     * Constructor without a bar
     * @param name name of the hotel
     * @param area area of the hotel
     * @param address address of the hotel
     * @param rooms rooms of the hotel
     * @param floors floors of the hotel
     * @param pools Number of pools in the hotel
     * @param spas spas of the hotel
     * @param restaurants restaurants of the hotel
     * @param suites Number of suites in the hotel
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int)
     */
    public Hotel5(String name, int area, String address, Room[] rooms, int floors, int pools, int spas, int restaurants, int suites) {
        super(name, area, address, rooms, floors, 5, pools, spas, restaurants);
        this.suites = suites;
    }

    /**
     * @return the number of suites
     * @see Hotel5#suites
     * @since 1.0
     */
    public int getSuites() {
        return suites;
    }

    @Override
    public String toString() {
        return "Hotel5{" + super.getData() + ", suites=" + suites + '}';
    }
}
