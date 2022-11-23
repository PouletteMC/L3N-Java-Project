package org.example.Instrument.Strings.Guitars;

import org.example.Instrument.Strings.Strings;

public class ElectricGuitar extends Strings {
    private final boolean amplifier;
    private final boolean pedals;

    public ElectricGuitar(String name, int purchasePrice, int sellingPrice, int length, int width, boolean amplifier, boolean pedals) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.amplifier = amplifier;
        this.pedals = pedals;
    }

    public boolean hasAmplifier() {
        return amplifier;
    }

    public boolean hasPedals() {
        return pedals;
    }
}
