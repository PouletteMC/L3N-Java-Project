package org.example.Buildings;
import org.example.Person.Resident;
/**
 * @author Eliot, Adam, Laura, Sebastian
 */
public abstract class Buildings {

    protected  int area; // in square meters
    protected Resident owner; // owner of the building
    protected String address; // street address
    protected double rateA = 5.6;
    protected double rateB = 1.5;

    public Buildings(int area, String address) {
        this.area = area; // Set the area
        this.address = address; // Set the address
    }

    public Buildings( int area, String address, Resident owner) {
        this.area = area; // Set the area
        this.address = address; // Set the address
        this.owner = owner; // Set the resident
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
        return owner; // Return the resident
    }

    public void setOwner(Resident resident) {
        this.owner = resident; // Set the resident
    }

    /**
     * @return the tax on the building
     */
    public abstract double getTax();

    /**
     * @return The string representation of the building
     */
    public abstract String toString();
}
