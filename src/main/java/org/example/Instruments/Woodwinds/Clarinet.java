package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

public class Clarinet extends Instruments implements Woodwinds{
    // Since a clarinet can only have one type of reed, it is a constant and final
    private static final String type = "Single Reed";

    public Clarinet(int purchasePrice, int sellingPrice){
        super("Clarinet",purchasePrice,sellingPrice);
    }
    public String toString() {
        // TODO: Implement this method
        return null;
    }
    public String getType() {
        // TODO: Implement this method
        return null;
    }
}
