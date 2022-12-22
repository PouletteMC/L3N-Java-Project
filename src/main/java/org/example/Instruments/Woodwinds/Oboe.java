package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

/**
 * Creates an Oboe
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * @see Instruments
 * @see Woodwinds
 */
public class Oboe extends Instruments implements Woodwinds{
    // Since an oboe can only have one type of reed, it is a constant and final
    private final String type = "Double Reed";

    /**
     * Constructor of the Oboe class
     * @param purchasePrice Purchase price of the instrument
     * @param sellingPrice Selling price of the instrument
     */
    public Oboe(int purchasePrice, int sellingPrice){
        super("Oboe",purchasePrice,sellingPrice);
    }

    public String toString() {
        return "Oboe{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

}
