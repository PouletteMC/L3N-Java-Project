package org.example.Buildings.Hotel;

import org.example.Buildings.Bar;

/**
 *
 * @author Eliot
 * @version 1.0
 */
public class Hotel5 extends Hotel {
    private final int suites;

    /**
     * Constructor with a bar
     * @param name
     * @param area
     * @param address
     * @param rooms
     * @param floors
     * @param stars
     * @param pools
     * @param spas
     * @param restaurants
     * @param bar
     * @param suites
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int, Bar)
     */
    public Hotel5(String name, int area, String address, Room[] rooms, int floors, int stars, int pools, int spas, int restaurants, Bar bar, int suites) {
        super(name, area, address, rooms, floors, stars, pools, spas, restaurants, bar);
        this.suites = suites;
    }

    /**
     * Constructor without a bar
     * @param name
     * @param area
     * @param address
     * @param rooms
     * @param floors
     * @param stars
     * @param pools
     * @param spas
     * @param restaurants
     * @param suites
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int)
     */
    public Hotel5(String name, int area, String address, Room[] rooms, int floors, int stars, int pools, int spas, int restaurants, int suites) {
        super(name, area, address, rooms, floors, stars, pools, spas, restaurants);
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
