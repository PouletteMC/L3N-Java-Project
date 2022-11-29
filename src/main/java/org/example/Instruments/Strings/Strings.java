package org.example.Instruments.Strings;
import org.example.Instruments.Instruments;

// A string instrument is a type of instrument
public abstract class Strings extends Instruments {
    // These values are not expected to change during the lifetime of the object, so they are final
    private final int length;
    private final int width;

    // We provide values for this class's fields in the constructor, along with the fields inherited from the Instruments class
    public Strings(String name, int purchasePrice, int sellingPrice, int length, int width) {
        // We use the super keyword to call the constructor of the parent class
        super(name, purchasePrice, sellingPrice);
        // We can now set the values of the fields specific to this class
        this.length = length;
        this.width = width;
    }
    // We provide getters for the fields specific to this class
    public int getLength() { return length; }
    public int getWidth() {
        return width;
    }
}


