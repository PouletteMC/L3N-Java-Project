package org.example.Person;

public class Tourist extends Person {
    private final String nationality;
    // TODO: Add a hotel and room number

    public Tourist( String name, String surname, int age, String nationality ) {
        super( name, surname, age );
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public String toString() {
        return "Tourist: " + getName() + " " + getSurname() + ", " + getAge() + ", " + getNationality();
    }
}
