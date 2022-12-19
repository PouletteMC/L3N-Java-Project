package org.example.Buildings.Hotel;

import org.example.Person.Tourist;
import java.util.ArrayList;
public class Room{

    private final int number;
    private final ArrayList<Tourist> guests;
    private boolean isOccupied;

    protected Room(int nb){
        this.number = nb;
        this.guests = new ArrayList<Tourist>();
        this.isOccupied = false;
    }

    protected void addTourist(Tourist tourist){
        this.guests.add(tourist);
        this.isOccupied = true;
    }

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
