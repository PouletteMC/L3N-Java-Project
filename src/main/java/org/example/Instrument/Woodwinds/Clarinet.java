package org.example.Instrument.Woodwinds;

public class Clarinet extends Woodwinds{
    // Since a clarinet can only have one type of reed, it is a constant and final

    public Clarinet(int purchasePrice, int sellingPrice){
        super("Clarinet",purchasePrice,sellingPrice,"Single reed");
    }

    @Override
    public String toString() {
        return super.toString() + " (Clarinet)";
    }
}
