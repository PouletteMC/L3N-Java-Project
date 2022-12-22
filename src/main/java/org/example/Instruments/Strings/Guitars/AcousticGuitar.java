package org.example.Instruments.Strings.Guitars;

import org.example.Instruments.Instruments;
import org.example.Instruments.Strings.Strings;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Creates an acoustic guitar object
 */
public class AcousticGuitar extends Instruments implements Strings {
    private final boolean rightHanded;
    private final int pull;
    private final int length;
    private final int width;

    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param rightHanded Whether the instrument is right-handed
     * @param pull The pull of the instrument
     * @param length The length of the instrument
     * @param width The width of the instrument
     */
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
        return "AcousticGuitar{" +
                "pull=" + pull +
                ", rightHanded=" + rightHanded +
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
