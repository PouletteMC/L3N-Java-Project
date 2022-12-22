package org.example.Person;

import org.example.Buildings.House;
import org.example.Buildings.Tower;

/**
 * @author Eliot, Sebastian, Adam, Laura
 * @version 1.0
 * Creates a tenant who can rent a house or apartment in a tower.
 * @see House
 * @see Tower
 */

public class Tenant extends Person {

    private House house;

    /**
     * Constructor of the Tenant class without a house
     * @param name Name of the tenant
     * @param surname Surname of the tenant
     * @param age Age of the tenant
     * @see Person#Person(String, String, int)  Person
     */
    public Tenant(String name, String surname, int age) {
        super(name, surname, age);
    }

    /**
     * Constructor with a house
     * @param name Name of the tenant
     * @param surname Surname of the tenant
     * @param age Age of the tenant
     * @param house House the tenant lives in
     * @see Person#Person(String, String, int)  Person
     */
    public Tenant(String name, String surname, int age, House house) {
        super(name, surname, age);
        this.house = house;
    }
    /**
     * @return the house
     * @see House
     * @since 1.0
     */
    public House getHouse() {
        return house;
    }

    /**
     * @param house the new house
     * @see House
     * @since 1.0
     */
    public void setHouse(House house) {
        this.house = house;
    }

    /**
     * @return the name of the tenant
     * @see Person#getName()
     * @see Person#getSurname()
     * @see Person#getAge()
     */
    public String toString() {
        return "Tenant: " + getName() + " " + getSurname() + ", " + getAge();
    }
}
