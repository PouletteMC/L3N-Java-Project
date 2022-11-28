package org.example.Instrument.Strings.Guitars;

import org.example.Instrument.Strings.Strings;

public class AcousticGuitar extends Strings {
    private final boolean rightHanded;
    private final int pull;

    public AcousticGuitar( int purchasePrice, int sellingPrice, int length, int width, boolean rightHanded, int pull) {
        super("Guitare acoustique", purchasePrice, sellingPrice, length, width);
        this.rightHanded = rightHanded;
        this.pull = pull;
    }

    public boolean isRightHanded() {
        return rightHanded;
    }

    public int getPull() {
        return pull;
    }

    @Override
    public String toString() {
        return super.toString() + "de type guitare. \n Pour droitier : " + rightHanded +
                " \n Nombres de tirants : " + pull;
    }
}
