package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

/**
 * Creates a Flute
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * @see Instruments
 * @see Woodwinds
 */
public class Flute extends Instruments implements Woodwinds{
    // Since a flute can only have one type of reed, it is a constant and final
    private final String type = "Bevel";
    public Flute(int purchasePrice, int sellingPrice){
        super("Flute",purchasePrice,sellingPrice);
    }

    public String toString() {
        return "Flute{" +
                "type='" + type + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }
}
