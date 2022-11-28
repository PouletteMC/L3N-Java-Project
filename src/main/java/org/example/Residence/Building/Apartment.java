package org.example.Residence.Building;

import org.example.Person.Owner;
import org.example.Person.Tenant;

public class Apartment extends Floor {
    private Tenant tenant;
    private final int area;
    private final int rooms;
    private Owner owner;


    public Apartment(int floorNumber, int floors, String address, int area, int rooms) {
        super(floorNumber, floors, address);
        this.area = area;
        this.rooms = rooms;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
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

    public void addOwner( Owner owner) {
        this.owner = owner;
    }
}
