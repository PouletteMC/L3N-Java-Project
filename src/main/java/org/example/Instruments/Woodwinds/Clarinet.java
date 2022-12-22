package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

/**
 * Creates a Clarinet
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.0
 * @see Instruments
 * @see Woodwinds
 */
public class Clarinet extends Instruments implements Woodwinds{
    // Since a clarinet can only have one type of reed, it is a constant and final
    private static final String type = "Single Reed";

    public Clarinet(int purchasePrice, int sellingPrice){
        super("Clarinet",purchasePrice,sellingPrice);
    }
    @Override
    public String toString() {
        return "Clarinet{" +
                "type='" + type + '\'' +
                '}';
    }
    public String getType() {
        return type;
    }
}
