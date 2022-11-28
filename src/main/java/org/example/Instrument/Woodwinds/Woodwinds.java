package org.example.Instrument.Woodwinds;

import org.example.Instrument.Instrument;

// A woodwind instrument is a type of instrument
public abstract class Woodwinds extends Instrument {
    // The type is not expected to change, so it is final
    private final String type;
    // We provide values for this class's fields in the constructor, along with the fields inherited from the Instrument class
    public Woodwinds(String name, int purchasePrice, int sellingPrice, String type) {
        super(name, purchasePrice, sellingPrice);
        this.type = type;
    }
    // We provide a getter for the field specific to this class
    public String getType() { return type; }
    // As this class only has a final field, we do not need to provide a setter


    @Override
    public String toString() {
        return super.toString() + " de type " + type;
    }
}
