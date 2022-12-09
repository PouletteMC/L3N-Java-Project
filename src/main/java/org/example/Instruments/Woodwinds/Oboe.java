package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

public class Oboe extends Instruments implements Woodwinds{
    // Since an oboe can only have one type of reed, it is a constant and final
    private static final String type = "Double Reed";

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
