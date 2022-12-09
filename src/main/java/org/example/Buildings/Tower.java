package org.example.Buildings;

import org.example.Person.Person;
import org.example.Person.Resident;

public class Tower extends Buildings {

    private int floors;
    private int elevators;
    private int apartments;
    private int offices;
    private Resident[] residents;
    private String name;


    public Tower(String name, int apartments, int offices, String address) {
        super(apartments * 50 + offices * 200, address);
        this.name = name;
        this.floors = apartments/4 + offices;
        this.apartments = apartments;
        this.offices = offices;
        if( this.floors < 10) {
            this.elevators = 1;
        } else {
            this.elevators = this.floors/10;
        }
    }

    public Tower(String name, int apartments, int offices, String address, Resident resident) {
        super(apartments * 50 + offices * 100, address, resident);
        this.name = name;
        this.floors = apartments/4 + offices;
        this.apartments = apartments;
        this.offices = offices;
        if( this.floors < 10) {
            this.elevators = 1;
        } else {
            this.elevators = this.floors/10;
        }
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

    public void setResidents(Resident[] residents) {
        this.residents = residents;
    }

    public double getTax() {
        return rateA * area;
    }

    @Override
    public String toString() {
        if(this.residents == null) {
            return "Tower{" +
                    "name='" + name + '\'' +
                    ", floors=" + floors +
                    ", elevators=" + elevators +
                    ", apartments=" + apartments +
                    ", offices=" + offices +
                    ", area=" + area +
                    ", address='" + address + '\'' +
                    ", tax=" + getTax() +
                    '}';
        } else {
            return "Tower{" +
                    "name='" + name + '\'' +
                    ", floors=" + floors +
                    ", elevators=" + elevators +
                    ", apartments=" + apartments +
                    ", offices=" + offices +
                    ", area=" + area +
                    ", address='" + address + '\'' +
                    ", tax=" + getTax() +
                    ", residents=" + residents[0].getName() +
                    '}';
        }
    }

    public void addResident(Resident resident) {
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] == null) {
                residents[i] = resident;
                break;
            }
        }
    }

    public void removeResident(Resident resident) {
        for (int i = 0; i < residents.length; i++) {
            if (residents[i] == resident) {
                residents[i] = null;
                break;
            }
        }
    }
}
