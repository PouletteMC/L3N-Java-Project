package org.example.Buildings;

import org.example.Instruments.Instruments;
import org.example.Person.Resident;

public class Store extends Buildings{

    private Instruments[] instruments;
    private Resident[] employees;
    private int profit = 0;
    private String name;
    private static int totalProfit = 0;

    public Store(int area, String address, Resident owner, Instruments[] instruments, Resident[] employees) {
        super(area, address, owner);
        this.instruments = instruments;
        this.employees = employees;
    }

    public Store(int area, String address, Instruments[] instruments, Resident[] employees) {
        super(area, address);
        this.instruments = instruments;
        this.employees = employees;
    }

    public Store(int area, String address, Resident owner, Instruments[] instruments) {
        super(area, address, owner);
        this.instruments = instruments;
        this.employees = new Resident[0];
    }

    public Store(int area, String address, Instruments[] instruments) {
        super(area, address);
        this.instruments = instruments;
        this.employees = new Resident[0];
    }

    public Store(int area, String address){
        super(area, address);
        this.instruments = new Instruments[0];
        this.employees = new Resident[0];
    }

    public Instruments[] getInstruments() {
        return instruments;
    }

    public Resident[] getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstruments(Instruments[] instruments) {
        this.instruments = instruments;
    }

    public void setEmployees(Resident[] employees) {
        this.employees = employees;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void addInstrument(Instruments instrument) {
        Instruments[] newInstruments = new Instruments[this.instruments.length + 1];
        System.arraycopy(this.instruments, 0, newInstruments, 0, this.instruments.length);
        newInstruments[newInstruments.length - 1] = instrument;
        this.instruments = newInstruments;
    }

    public void removeInstrument(Instruments instrument) {
        Instruments[] newInstruments = new Instruments[this.instruments.length - 1];
        int index = 0;
        for (Instruments i : this.instruments) {
            if(i != instrument) {
                newInstruments[index++] = i;
            }
        }
        this.instruments = newInstruments;
    }

    public void addEmployee(Resident employee) {
        Resident[] newEmployees = new Resident[this.employees.length + 1];
        System.arraycopy(this.employees, 0, newEmployees, 0, this.employees.length);
        newEmployees[newEmployees.length - 1] = employee;
        this.employees = newEmployees;
    }

    public void removeEmployee(Resident employee) {
        Resident[] newEmployees = new Resident[this.employees.length - 1];
        int index = 0;
        for (Resident r : this.employees) {
            if(r != employee) {
                newEmployees[index++] = r;
            }
        }
        this.employees = newEmployees;
    }

    public void sellInstrument(Instruments instrument) {
        removeInstrument(instrument);
        profit += instrument.getProfit();
        totalProfit += instrument.getProfit();
    }

    public void buyInstrument(Instruments instrument) {
        addInstrument(instrument);
        profit -= instrument.getPurchasePrice();
        totalProfit -= instrument.getPurchasePrice();
    }

    public void hireEmployee(Resident employee) {
        addEmployee(employee);
    }

    public void fireEmployee(Resident employee) {
        removeEmployee(employee);
    }

    @Override
    public double getTax() {
        return rateA * area;
    }

    @Override
    public String toString() {
//        return name + " has " + instruments.length + " instruments in store and hires " + employees.length + " employees." + " It has a profit of " + profit + " and is located at " + getAddress() + ".";
        return "This store has " + instruments.length + " instruments in store and hires " + employees.length + " employees." + " It has a profit of " + profit + " and is located at " + getAddress() + ".";
    }

}
