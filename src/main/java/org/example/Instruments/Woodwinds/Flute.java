package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

public class Flute extends Instruments implements Woodwinds{
    // Since a flute can only have one type of reed, it is a constant and final
    private static final String type = "Bevel";
    public Flute(int purchasePrice, int sellingPrice){
        super("Flute",purchasePrice,sellingPrice);
    }

    public String toString() {
        return null;
    }

    public String getType() {
        return null;
    }
}
