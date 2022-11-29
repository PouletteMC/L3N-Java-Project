package org.example.Instruments.Strings.Pianos;

public class StraightPiano extends Piano {
    // We assume that the Piano can be silenced after the fact
    private boolean silenced;
    // We assume that the string cannot be crossed after the fact, so the parameter is final
    private final boolean crossedStrings;

    public StraightPiano(String name, int purchasePrice, int sellingPrice, int length, int width, int Strings, boolean silenced, boolean crossedStrings) {
        super(name, purchasePrice, sellingPrice, length, width, Strings);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
    }

    public StraightPiano(String name, int purchasePrice, int sellingPrice, int length, int width, boolean silenced, boolean crossedStrings) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
    }

    public boolean isSilenced() {
        return silenced;
    }

    public void setSilenced( boolean silenced ) {
        this.silenced = silenced;
    }

    public boolean hasCrossedStrings() {
        return crossedStrings;
    }

    @Override
    public String toString() {
        return "StraightPiano{" +
                "silenced=" + silenced +
                ", crossedStrings=" + crossedStrings +
                ", Strings=" + getStrings() +
                ", name='" + getName() + '\'' +
                ", purchasePrice=" + getPurchasePrice() +
                ", sellingPrice=" + getSellingPrice() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
