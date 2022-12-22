package org.example.Buildings.Hotel;
/**
 * Creates a 1/2/3 star Hotel object
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 */
public class NormalHotel extends Hotel{
    /**
     * Constructor - Normal hotels cannot have a bar
     * @param name name of the hotel
     * @param area area of the hotel
     * @param address address of the hotel
     * @param rooms rooms of the hotel
     * @param floors floors of the hotel
     * @param stars stars of the hotel
     * @param restaurants restaurants of the hotel
     * @see Hotel#Hotel(String, int, String, Room[], int, int, int, int, int)
     */
    public NormalHotel(String name, int area, String address, Room[] rooms, int floors, int stars, int restaurants) {
        super(name, area, address, rooms, floors, stars, 1, 0, restaurants);
    }
    @Override
    public String toString() {
        return "Hotel" + super.getStars() + "{" + super.getData() + '}';
    }
}
