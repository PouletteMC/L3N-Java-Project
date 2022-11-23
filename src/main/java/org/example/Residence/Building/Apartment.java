package org.example.Residence.Building;

import org.example.Person.Person;

public class Apartment extends BuildingFloor {
    private Person tenant;
    private final int area;
    private final int rooms;


    public Apartment(int floorNumber, int floors, String address, int area, int rooms) {
        super(floorNumber, floors, address);
        this.area = area;
        this.rooms = rooms;
    }

    public Person getTenant() {
        return tenant;
    }

    public void setTenant(Person tenant) {
        this.tenant = tenant;
        // TODO: Add the apartment to the tenant's list of apartments
    }

    public int getArea() {
        return area;
    }

    public int getRooms() {
        return rooms;
    }

    public void removeTenant() {
        tenant = null;
    }
}
