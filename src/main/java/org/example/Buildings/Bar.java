package org.example.Buildings;

import org.example.Person.Resident;

import java.util.Arrays;

/**
 * Creates a Bar object
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 */
public class Bar extends Buildings {
    private String name;
    private int capacity;
    private int minAge;
    private Resident[] staff;

    /**
     * Constructor for a bar with no staff
     * @param name name of the bar
     * @param area in square meters
     * @param address street address
     * @param capacity number of people the bar can hold
     * @param minAge minimum age to enter the bar
     */
    public Bar(String name, int area, String address, int capacity, int minAge) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
    }

    /**
        * Constructor for a bar with staff
     * @param name name of the bar
     * @param area in square meters
     * @param address street address
     * @param capacity number of people the bar can hold
     * @param minAge minimum age to enter the bar
     * @param staff the staff of the bar
     */
    public Bar(String name, int area, String address, int capacity, int minAge, Resident[] staff) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
        this.staff = staff;
    }

    /**
     * Constructor for a bar with a staff and owner
     * @param name name of the bar
     * @param area in square meters
     * @param address street address
     * @param capacity number of people the bar can hold
     * @param minAge minimum age to enter the bar
     * @param staff the staff of the bar
     * @param resident the owner of the bar
     */
    public Bar(String name, int area, String address, int capacity, int minAge, Resident[] staff, Resident resident) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
        this.staff = staff;
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

    public Resident[] getStaff() {
        return staff;
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


    public void setStaff(Resident[] staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return name + "has a capacity of " + capacity + " people and is located at " + address + "." + " The minimum age is " + minAge + "." + " The staff is comprised of " + Arrays.toString(staff) + ".";
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Bar bar = (Bar) object;
        return capacity == bar.capacity && minAge == bar.minAge && name.equals(bar.name) && Arrays.equals(staff, bar.staff);
    }

    /**
     *
     * @return The tax on the bar
     */
    public double getTax() {
        if(capacity >= 100) return rateA * area;
        return rateB * area;
    }

    /**
     * Adds a staff member to the bar
     * @param resident the staff member to be added
     */
    public void addStaff(Resident resident) {
        Resident[] newStaff = new Resident[staff.length + 1];
        System.arraycopy(staff, 0, newStaff, 0, staff.length);
        newStaff[newStaff.length - 1] = resident;
        staff = newStaff;
    }

    /**
     * Removes a staff member from the bar
     * @param resident the staff member to be removed
     */
    public void removeStaff(Resident resident) {
        Resident[] newStaff = new Resident[staff.length - 1];
        int index = 0;
        for (Resident r : staff) {
            if(r != resident) {
                newStaff[index++] = r;
            }
        }
        staff = newStaff;
    }
}
