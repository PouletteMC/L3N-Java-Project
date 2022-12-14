package org.example.Instruments.Strings.Pianos;

import org.example.Instruments.Instruments;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Creates a new Straight Piano object
 */
public class StraightPiano extends Instruments implements Piano {
    private boolean silenced;     // We assume that the Piano can be silenced after the fact
    private final boolean crossedStrings; // We assume that the strings cannot be crossed after the fact, so the parameter is final
    private final int strings;    // We assume that the number of strings cannot be changed after the fact, so the parameter is final
    private final int keys;       // We assume that the number of keys cannot be changed after the fact, so the parameter is final
    private final int length;     // We assume that the length cannot be changed after the fact, so the parameter is final
    private final int width;      // We assume that the width cannot be changed after the fact, so the parameter is final

    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param silenced Whether the instrument is silenced or not
     * @param crossedStrings Whether the strings are crossed or not
     * @param strings The number of strings on the instrument
     * @param keys The number of keys on the instrument
     * @param length The length of the instrument
     * @param width The width of the instrument
     */
    public StraightPiano(String name, int purchasePrice, int sellingPrice, boolean silenced, boolean crossedStrings, int strings, int keys, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
        this.strings = strings;
        this.keys = keys;
        this.length = length;
        this.width = width;
    }

    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param silenced Whether the instrument is silenced or not
     * @param crossedStrings Whether the strings are crossed or not
     * @param keys The number of keys on the instrument
     * @param length The length of the instrument
     * @param width The width of the instrument
     */
    public StraightPiano(String name, int purchasePrice, int sellingPrice, boolean silenced, boolean crossedStrings, int keys, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
        this.strings = keys;
        this.keys = keys;
        this.length = length;
        this.width = width;
    }
    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param silenced Whether the instrument is silenced or not
     * @param crossedStrings Whether the strings are crossed or not
     * @param length The length of the instrument
     * @param width The width of the instrument
     */
    public StraightPiano(String name, int purchasePrice, int sellingPrice, boolean silenced, boolean crossedStrings, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
        this.strings = this.keys = 88;
        this.length = length;
        this.width = width;
    }

    public boolean isSilenced() {
        return silenced;
    }

    public void setSilenced(boolean silenced) {
        this.silenced = silenced;
    }

    public boolean getCrossedStrings() {
        return crossedStrings;
    }

    public int getStrings() {
        return strings;
    }

    public int getKeys() {
        return keys;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public String toString() {
        return "StraightPiano{" +
                "name='" + getName() + '\'' +
                ", sellingPrice=" + getSellingPrice() +
                ", dimensions=" + String.format("%d x %d", getLength(), getWidth()) +
                ", keys=" + keys +
                ", strings=" + strings +
                ", silenced=" + silenced +
                ", crossedStrings=" + crossedStrings +
                '}';
    }
}
