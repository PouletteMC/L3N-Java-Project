package org.example.Person;

import org.example.Residence.Residence;

public class Owner extends Person {

    private Residence[] residences;

    public Owner(String name, String surname, int age, Residence[] residences) {
        super(name, surname, age);
        this.residences = residences;
    }

    public Owner(String name, String surname, int age) {
        super(name, surname, age);
        this.residences = new Residence[0];
    }

    public Residence[] getResidences() {
        return residences;
    }

    public void setResidences(Residence[] residences) {
        this.residences = residences;
    }

    public void addResidence(Residence residence) {
        Residence[] newResidences = new Residence[residences.length + 1];
        System.arraycopy(residences, 0, newResidences, 0, residences.length);
        newResidences[newResidences.length - 1] = residence;
        residences = newResidences;
        residence.addOwner(this);
    }

    
    public void removeResidence(Residence residence) {
        Residence[] newResidences = new Residence[residences.length - 1];
        int index = 0;
        for (Residence r : residences) {
            if(r != residence) {
                newResidences[index++] = r;
            }
        }
        residences = newResidences;
    }
}
