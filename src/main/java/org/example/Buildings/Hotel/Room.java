package org.example.Buildings.Hotel;

import org.example.Person.Tourist;
import java.util.ArrayList;

/**
 * Creates a room object
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 */
public class Room{

    private final int number;
    private final ArrayList<Tourist> guests;
    private boolean isOccupied;

    /**
     *
     * @param number the number of the room
     */
    protected Room(int number){
        this.number = number;
        this.guests = new ArrayList<Tourist>();
        this.isOccupied = false;
    }

    /**
     *
     * @param tourist adds a tourist to the room
     */
    protected void addTourist(Tourist tourist){
        this.guests.add(tourist);
        this.isOccupied = true;
    }

    /**
     *
     * @param tourist removes the tourist from the room
     */
    protected void removeTourist(Tourist tourist){
        this.guests.remove(tourist);
        this.isOccupied = false;
    }

    protected boolean isOccupied(){
        return this.isOccupied;
    }

    protected int getNumber(){
        return this.number;
    }

    protected ArrayList<Tourist> getGuests(){
        return this.guests;
    }

    @Override
    public String toString(){
        return "Room " + this.number + " is occupied by " + this.guests.size() + " tourists.";
    }
}
