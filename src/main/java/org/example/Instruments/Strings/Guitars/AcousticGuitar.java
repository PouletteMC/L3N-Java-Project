package org.example.Instruments.Strings.Guitars;

import org.example.Instruments.Instruments;
import org.example.Instruments.Strings.Strings;

public class AcousticGuitar extends Instruments implements Strings {
    private final boolean rightHanded;
    private final int pull;
    private final int length;
    private final int width;

    public AcousticGuitar(String name, int purchasePrice, int sellingPrice, boolean rightHanded, int pull, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.rightHanded = rightHanded;
        this.pull = pull;
        this.length = length;
        this.width = width;
    }

    public boolean isRightHanded() {
        return rightHanded;
    }

    public int getPull() {
        return pull;
    }

    @Override
    public String toString() {
        // TODO: Implement this method
        return null;
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
