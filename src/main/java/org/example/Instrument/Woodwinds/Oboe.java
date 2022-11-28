package org.example.Instrument.Woodwinds;

public class Oboe extends Woodwinds{
    // Since an oboe can only have one type of reed, it is a constant and final

    public Oboe(int purchasePrice, int sellingPrice){
        super("Oboe",purchasePrice,sellingPrice,"Double reed");
    }

    @Override
    public String toString() {
        return super.toString() + " (Oboe)";
    }
}
