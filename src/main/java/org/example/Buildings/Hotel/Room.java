package org.example.Buildings.Hotel;

import org.example.Person.Tourist;

import java.util.ArrayList;
import java.util.Scanner;

public class Room{

    private int number;
    private ArrayList<Tourist> habitants;
    private boolean isOccupied;

    public Room(int nb){
        this.number = nb;
        this.habitants = new ArrayList<Tourist>();
        this.isOccupied = false;
    }

    public void addTourist(Tourist tourist){
        this.habitants.add(tourist);
        this.isOccupied = true;
    }

    public void removeTourist(Tourist tourist){
        this.habitants.remove(tourist);
        this.isOccupied = false;
    }



}
