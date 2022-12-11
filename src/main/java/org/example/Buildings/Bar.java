package org.example.Buildings;
import org.example.Person.Resident;
import org.example.Person.Person;

import java.util.Arrays;

public class Bar extends Buildings {
    private String name;
    private int capacity;
    private int minAge;
    private Resident[] staff;

    public Bar(String name, int area, String address, int capacity, int minAge) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
    }

    public Bar(String name, int area, String address, int capacity, int minAge, Resident[] staff) {
        super(area, address);
        this.name = name;
        this.capacity = capacity;
        this.minAge = minAge;
        this.staff = staff;
    }

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

    public double getTax() {
        if(capacity >= 100) return rateA * area;
        return rateB * area;
    }

    public void addStaff(Resident resident) {
        Resident[] newStaff = new Resident[staff.length + 1];
        System.arraycopy(staff, 0, newStaff, 0, staff.length);
        newStaff[newStaff.length - 1] = resident;
        staff = newStaff;
    }

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
