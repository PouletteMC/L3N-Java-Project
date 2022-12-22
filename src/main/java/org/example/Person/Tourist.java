package org.example.Person;

import org.example.Buildings.Hotel.Hotel;

/**
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.0
 * Creates a tourist. They can rent a hotel room.
 * @see Hotel
 */
public class Tourist extends Person {
    private final String nationality;
    // TODO: Add a hotel and room number

    /**
     * Constructor of the Tourist class
     * @param name the name of the tourist
     * @param surname the surname of the tourist
     * @param age the age of the tourist
     * @param nationality the nationality of the tourist
     */
    public Tourist( String name, String surname, int age, String nationality ) {
        super( name, surname, age );
        this.nationality = nationality;
    }
    public String getNationality() {
        return nationality;
    }
    @Override
    public String toString() {
        return "Tourist: " + getName() + " " + getSurname() + ", " + getAge() + ", " + getNationality();
    }
}
