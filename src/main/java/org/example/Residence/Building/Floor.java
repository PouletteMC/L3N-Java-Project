package org.example.Residence.Building;

public class Floor extends Building {
    private int floorNumber;
    private Apartment[] apartments;

    public Floor(int floorNumber, int floors, String address) {
        super(floors, address);
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void removeApartment( Apartment apartment) {
        if(apartments == null) { // If the array is empty
            return; // Do nothing
        } else { // If the array is not empty
            Apartment[] newApartments = new Apartment[apartments.length - 1]; // Create a new array with a size of the old array - 1
            int index = 0; // Initiate the index
            for (Apartment value : apartments) { // For each element in the old array
                if (value != apartment) { // If the element is not the apartment
                    newApartments[index] = value; // Set the element in the new array to the element in the old array
                    index++; // Increment the index
                }
            }
            apartments = newApartments; // Set the old array to the new array
        }
    }

    public boolean addApartment( Apartment apartment) {
        // If there are 4 apartments on the floor, do not add another apartment and return false
        if(apartments == null) { // If the array is empty
            apartments = new Apartment[1]; // Create a new array with a size of 1
            apartments[0] = apartment; // Set the first element to the apartment
            return true;
        }

        if( apartments.length >= 4) {
            return false;
        } else { // If the array is not empty
            Apartment[] newApartments = new Apartment[apartments.length + 1]; // Create a new array with a size of the old array + 1
            System.arraycopy(apartments, 0, newApartments, 0, apartments.length); // Copy the old array into the new array
            newApartments[apartments.length] = apartment; // Set the last element to the apartment
            apartments = newApartments; // Set the old array to the new array
        }
        return true;
    }

    public Apartment[] getApartments() {
        return apartments; // Get the apartments array
    }

    public void setApartments(Apartment[] apartments) {
        this.apartments = apartments; // Set the apartments array
    }

}
