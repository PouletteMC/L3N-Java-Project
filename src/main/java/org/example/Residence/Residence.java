package org.example.Residence;

import java.util.Arrays;

public class Residence {
    private Residence[] buildings; // An array of buildings within the residence ( house, store, etc. )
    private final String name; // The name of the residence

    public Residence(String name) {
        this.name = name; // Set the name of the residence
    }
    public Residence() {
        this.name = "Mele-Mele"; // If no name is given, set the name to Mele-Mele
    }

    public void addBuilding(Residence building) {
        if (buildings == null) { // If the array is empty
            buildings = new Residence[1]; // Create a new array with a size of 1
            buildings[0] = building; // Set the first element to the building
        } else {
            Residence[] newBuildings = new Residence[buildings.length + 1]; // Create a new array with a size of the old array + 1
            System.arraycopy(buildings, 0, newBuildings, 0, buildings.length); // Copy the old array into the new array
            newBuildings[buildings.length] = building; // Set the last element to the building
            buildings = newBuildings; // Set the old array to the new array
        }
    }

    public void removeBuilding(Residence building) {
        if (buildings == null) { // If the array is empty
            return; // Do nothing
        } else {
            Residence[] newBuildings = new Residence[buildings.length - 1]; // Create a new array with a size of the old array - 1
            int index = 0; // Initiate the index
            for (Residence value : buildings) { // For each element in the old array
                if (value != building) { // If the element is not the building
                    newBuildings[index] = value; // Set the element in the new array to the element in the old array
                    index++; // Increment the index
                }
            }
            buildings = newBuildings; // Set the old array to the new array
        }
    }

    public Residence[] getBuildings() {
        return buildings; // Get the buildings array
    }

    public String getName() {
        return name; // Get the name of the residence
    }

    public void setBuildings(Residence[] buildings) {
        this.buildings = buildings; // Set the buildings array
    }

    public int getBuildingCount(){
        return buildings.length; // Get the number of buildings in the residence as the length of the buildings array
    }

    @Override
    public String toString() {
        return "La résidence " + this.name + " à en son sein les batiments " + this.buildings;
    }
}
