package org.example.Residence;

import org.example.Person.Owner;

import java.util.Arrays;

public abstract class Residence {
    private String name; // The name of the residence
    private Owner owner; // The owner of the residence
    private String address; // The address of the residence

    public Residence(String name) {
        this.name = name; // Set the name of the residence
    }
    public Residence() {
        this.name = "Mele-Mele"; // If no name is given, set the name to Mele-Mele
    }
    public void addOwner(Owner owner) {
        this.owner = owner; // Add an owner to the residence
    }
}
