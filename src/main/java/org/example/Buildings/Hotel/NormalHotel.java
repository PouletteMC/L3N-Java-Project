package org.example.Buildings.Hotel;

public class NormalHotel extends Hotel{

    /**
     * Constructor - Normal hotels cannot have a bar
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
    public NormalHotel(String name, int area, String address, Room[] rooms, int floors, int stars, int spas, int restaurants) {
        super(name, area, address, rooms, floors, stars, 1, spas, restaurants);
    }

    @Override
    public String toString() {
        return "Hotel" + super.getStars() + "{" + super.getData() + '}';
    }
}
