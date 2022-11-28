package org.example.Instrument.Woodwinds;

public class Flute extends Woodwinds {
    // Since a flute can only have one type of reed, it is a constant and final

    public Flute(int purchasePrice, int sellingPrice){
        super("Flute",purchasePrice,sellingPrice,"Bevel");
    }

    @Override
    public String toString() {
        return super.toString() + " (Flute)";
    }

}
