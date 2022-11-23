package org.example.Residence;

import org.example.Instrument.Instrument;

public class MusicStore extends Residence {
    private Instrument[] instruments; // array of instruments
    private String address; // address of the store
    private String name; // name of the store

    public MusicStore (String name, String address) {
        this.name = name; // set name
        this.address = address; // set address
    }

    public void addInstrument(Instrument instrument) {
        if (instruments == null) { // if the array is empty
            instruments = new Instrument[1]; // create an array with 1 element
            instruments[0] = instrument; // add the instrument to the array
        } else {
            Instrument[] newInstruments = new Instrument[instruments.length + 1]; // create a new array with 1 more element
            System.arraycopy(instruments, 0, newInstruments, 0, instruments.length); // copy the old array to the new one
            newInstruments[instruments.length] = instrument; // add the instrument to the new array
            instruments = newInstruments; // set the new array to the old one
        }
    }

    public void removeInstrument(Instrument instrument) {
        if (instruments == null) { // if the array is empty
            return; // do nothing
        } else { // if the array is not empty
            Instrument[] newInstruments = new Instrument[instruments.length - 1]; // create a new array with 1 less element
            int index = 0; // Initiate the index
            for (Instrument value : instruments) { // loop through the array
                if (value != instrument) { // if the instrument is not the one we want to remove
                    newInstruments[index] = value; // add it to the new array
                    index++; // increase the index
                }
            }
            instruments = newInstruments; // set the new array to the old one
        }
    }

    public Instrument[] getInstruments() {
        return instruments; // return the array of instruments
    }

    public String getAddress() {
        return address; // return the address
    }

    public String getName() {
        return name; // return the name
    }

    public void setAddress(String address) {
        this.address = address; // set the address
    }

    public void setName(String name) {
        this.name = name; // set the name
    }

    public void setInstruments(Instrument[] instruments) {
        this.instruments = instruments; // set the array of instruments
    }

}
