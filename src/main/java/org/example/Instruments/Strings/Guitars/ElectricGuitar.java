package org.example.Instruments.Strings.Guitars;

import org.example.Instruments.Instruments;
import org.example.Instruments.Strings.Strings;

public class ElectricGuitar extends Instruments implements Strings {
    private final boolean amplifier;
    private final boolean pedals;

    private final int length;
    private final int width;

    public ElectricGuitar(String name, int purchasePrice, int sellingPrice, boolean amplifier, boolean pedals, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.amplifier = amplifier;
        this.pedals = pedals;
        this.length = length;
        this.width = width;
    }


    public boolean hasAmplifier() {
        return amplifier;
    }

    public boolean hasPedals() {
        return pedals;
    }

    @Override
    public String toString() {
        return "ElectricGuitar{" +
                "amplifier=" + amplifier +
                ", pedals=" + pedals +
                ", length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }
}
