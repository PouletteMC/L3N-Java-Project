package org.example.Instrument.Strings.Guitars;

import org.example.Instrument.Strings.Strings;

public class AcousticGuitar extends Strings {
    private final boolean rightHanded;
    private final int pull;

    public AcousticGuitar(String name, int purchasePrice, int sellingPrice, int length, int width, boolean rightHanded, int pull) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.rightHanded = rightHanded;
        this.pull = pull;
    }

    public boolean isRightHanded() {
        return rightHanded;
    }

    public int getPull() {
        return pull;
    }
}
