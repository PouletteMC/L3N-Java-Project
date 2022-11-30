package org.example.Buildings;

import org.example.GlobalMethods;
import org.example.Person.Resident;

interface Methods {
    double rateA = 5.6;
    double rateB = 1.5;
    double getTax();
}

public abstract class Buildings implements Methods, GlobalMethods {

    protected  int area; // in square meters
    protected Resident resident; // resident of the building
    protected String address; // street address

    public Buildings(int area, String address) {
        this.area = area; // Set the area
        this.address = address; // Set the address
    }

    public Buildings( int area, String address, Resident resident) {
        this.area = area; // Set the area
        this.address = address; // Set the address
        this.resident = resident; // Set the resident
    }

    public int getArea() {
        return area; // Return the area
    }

    public String getAddress() {
        return address; // Return the address
    }

    public void setArea(int area) {
        this.area = area; // Set the area
    }

    public void setAddress(String address) {
        this.address = address; // Set the address
    }

    public Resident getOwner() {
        return resident; // Return the resident
    }

    public void setOwner(Resident resident) {
        this.resident = resident; // Set the resident
    }
}