package org.example.Person;

import org.example.Buildings.Buildings;
import org.example.Buildings.House;

public class Resident extends Person {

    private Buildings[] buildings;
    private House residence;
    private  Buildings workPlace;
    private String job;

    public Resident(String name, String surname, int age) {
        super(name, surname, age);
    }
}
