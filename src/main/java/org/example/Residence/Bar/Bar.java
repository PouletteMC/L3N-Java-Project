package org.example.Residence.Bar;

import org.example.Person.Person;
import org.example.Residence.Residence;

public class Bar extends Residence {
    private String name;
    private int capacity;
    private int minAge;

    public Bar(String name, int capacity, int minAge) {
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
    }

    public Bar() {
        this.name = "Bar";
        this.capacity = 10;
        this.minAge = 21;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public boolean isAllowed(Person person) {
        return person.getAge() >= minAge;
    }

}
