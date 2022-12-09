package org.example.Buildings;

import org.example.Person.Tourist;

import java.util.ArrayList;
import java.util.Scanner;

public class Room{

    private int number;
    private ArrayList<Tourist> habitatnts;
    private boolean isOccupied;
    private static int roomCount = 0;
    private static int occupied = 0;
    private static int unoccupied = 0;


    public Room(int nb){
        this.number = nb;
        this.habitatnts = new ArrayList<Tourist>();
        this.isOccupied = false;
        this.roomCount++;
        this.unoccupied++;
    }

    public void addTourist(Tourist t){
        this.habitatnts.add(t);
        this.isOccupied = true;
        this.occupied++;
    }

   public void delTourist(){
        String name = null;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" Quel est le nom de la personne qui s'en va ? ( Ne rien mettre si plus personne s'en va ) ");
            name = sc.nextLine();

            for (Tourist tourist : this.habitatnts) {
                if (tourist.getName().equals(name)) {
                    this.habitatnts.remove(tourist);
                }
            }
        }
        while (name != null);

        if (this.habitatnts.equals(null)){
            this.isOccupied = false;
            this.occupied--;
        }
    }



}
