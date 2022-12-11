package org.example.Buildings.Hotel;

import org.example.Person.Tourist;
import java.util.ArrayList;
class Room{

    private int number;
    private ArrayList<Tourist> habitants;
    private boolean isOccupied;

    protected Room(int nb){
        this.number = nb;
        this.habitants = new ArrayList<Tourist>();
        this.isOccupied = false;
    }

    protected void addTourist(Tourist tourist){
        this.habitants.add(tourist);
        this.isOccupied = true;
    }

    protected void removeTourist(Tourist tourist){
        this.habitants.remove(tourist);
        this.isOccupied = false;
    }
}
