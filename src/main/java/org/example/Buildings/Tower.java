package org.example.Buildings;

import org.example.Person.Person;
import org.example.Person.Resident;

public class Tower extends Buildings {

    private int floors;
    private int elevators;
    private int apartments;
    private int offices;
    private Person[] residents;


    public Tower(int floors, int elevators, int apartments, int offices, int area, String address) {
        super(area, address);
        this.floors = floors;
        this.elevators = elevators;
        this.apartments = apartments;
        this.offices = offices;
    }

    public Tower(int floors, int elevators, int apartments, int offices, int area, String address, Resident resident) {
        super(area, address, resident);
        this.floors = floors;
        this.elevators = elevators;
        this.apartments = apartments;
        this.offices = offices;
    }

    public int getFloors() {
        return floors;
    }

    public int getElevators() {
        return elevators;
    }

    public int getApartments() {
        return apartments;
    }

    public int getOffices() {
        return offices;
    }

    public Person[] getResidents() {
        return residents;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setElevators(int elevators) {
        this.elevators = elevators;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    public void setOffices(int offices) {
        this.offices = offices;
    }

    public void setResidents(Person[] residents) {
        this.residents = residents;
    }

    public double getTax() {
        return rateA * area;
    }

    @Override
    public String toString() {
        return "This tower has: " + floors + " floors, " + elevators + " elevators, " + apartments + " apartments, " + offices + " offices, with a total area of " + area + " square meters, " + address + ".\n It is owned by " + super.getOwner() + ".\n" + " It has " + residents.length + " residents.";
    }

    public void addResident(Person resident) {
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] == null) {
                residents[i] = resident;
                break;
            }
        }
    }

    public void removeResident(Person resident) {
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] == resident) {
                residents[i] = null;
                break;
            }
        }
    }
}
