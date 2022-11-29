package org.example.Instruments.Strings.Pianos;

import org.example.Instruments.Instruments;

public class StraightPiano extends Instruments implements Piano {
    private boolean silenced;     // We assume that the Piano can be silenced after the fact
    private final boolean crossedStrings; // We assume that the strings cannot be crossed after the fact, so the parameter is final
    private final int strings;    // We assume that the number of strings cannot be changed after the fact, so the parameter is final
    private final int keys;       // We assume that the number of keys cannot be changed after the fact, so the parameter is final
    private final int length;     // We assume that the length cannot be changed after the fact, so the parameter is final
    private final int width;      // We assume that the width cannot be changed after the fact, so the parameter is final

    public StraightPiano(String name, int purchasePrice, int sellingPrice, boolean silenced, boolean crossedStrings, int strings, int keys, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
        this.strings = strings;
        this.keys = keys;
        this.length = length;
        this.width = width;
    }

    public StraightPiano(String name, int purchasePrice, int sellingPrice, boolean silenced, boolean crossedStrings, int keys, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
        this.strings = keys;
        this.keys = keys;
        this.length = length;
        this.width = width;
    }

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
                "silenced=" + silenced +
                ", crossedStrings=" + crossedStrings +
                ", strings=" + strings +
                ", keys=" + keys +
                '}';
    }
}
