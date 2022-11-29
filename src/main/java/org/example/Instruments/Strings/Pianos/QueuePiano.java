package org.example.Instruments.Strings.Pianos;
import org.example.Instruments.Instruments;

enum Size {
    Small("Toad"), Medium("1/4"), Large("1/2"), ExtraLarge("4/4");
    private final String value;
    private Size(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}

public class QueuePiano extends Instruments implements Piano {
    private final int strings;   // We assume that the number of strings cannot be changed after the fact, so the parameter is final
    private final int keys;      // We assume that the number of keys cannot be changed after the fact, so the parameter is final
    private final int length;    // We assume that the length cannot be changed after the fact, so the parameter is final
    private final int width;     // We assume that the width cannot be changed after the fact, so the parameter is final
    private final Size size;     // We assume that the size cannot be changed after the fact, so the parameter is final

    public QueuePiano(String name, int purchasePrice, int sellingPrice, int strings, int keys, int length, int width, Size size) {
        super(name, purchasePrice, sellingPrice);
        this.strings = strings;
        this.keys = keys;
        this.length = length;
        this.width = width;
        this.size = size;
    }

    public QueuePiano(String name, int purchasePrice, int sellingPrice, int keys, int length, int width, Size size) {
        super(name, purchasePrice, sellingPrice);
        this.keys = keys;
        this.strings = keys;
        this.length = length;
        this.width = width;
        this.size = size;
    }
    public QueuePiano(String name, int purchasePrice, int sellingPrice, int length, int width, Size size) {
        super(name, purchasePrice, sellingPrice);
        this.strings = this.keys = 88;
        this.length = length;
        this.width = width;
        this.size = size;
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

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "QueuePiano{" +
                "name='" + getName() + '\'' +
                ", purchasePrice=" + getPurchasePrice() +
                ", sellingPrice=" + getSellingPrice() +
                ", profit=" + getProfit() +
                ", strings=" + strings +
                ", keys=" + keys +
                ", length=" + length +
                ", width=" + width +
                ", size=" + size +
                '}';
    }
}
