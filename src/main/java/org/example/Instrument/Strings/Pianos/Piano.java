package org.example.Instrument.Strings.Pianos;

import org.example.Instrument.Strings.Strings;

public abstract class Piano extends Strings {
    private int Strings;

    public Piano( String name, int purchasePrice, int sellingPrice, int length, int width, int Strings) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.Strings = Strings;
    }

    public Piano( String name, int purchasePrice, int sellingPrice, int length, int width) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.Strings = 88;
    }

    public int getStrings() {
        return Strings;
    }

    public void setStrings( int Strings ) {
        this.Strings = Strings;
    }
}
