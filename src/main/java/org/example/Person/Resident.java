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
        this.buildings = new Buildings[0];
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Buildings getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(Buildings workPlace) {
        this.workPlace = workPlace;
    }

    public House getResidence() {
        return residence;
    }

    public void setResidence(House residence) {
        this.residence = residence;
    }

    public Buildings[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Buildings[] buildings) {
        this.buildings = buildings;
    }

    public void addBuilding(Buildings building) {
        Buildings[] newBuildings = new Buildings[buildings.length + 1];
        for (int i = 0; i < buildings.length; i++) {
            newBuildings[i] = buildings[i];
        }
        newBuildings[buildings.length] = building;
        buildings = newBuildings;
    }

    public void removeBuilding(Buildings building) {
        Buildings[] newBuildings = new Buildings[buildings.length - 1];
        int j = 0;
        for (int i = 0; i < buildings.length; i++) {
            if (buildings[i] != building) {
                newBuildings[j] = buildings[i];
                j++;
            }
        }
        buildings = newBuildings;
    }

    @Override
    public String toString() {
        return "Resident: " + getName() + " " + getSurname() + ", " + getAge();
    }
}
