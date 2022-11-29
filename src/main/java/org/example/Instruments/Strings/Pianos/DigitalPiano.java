package org.example.Instruments.Strings.Pianos;

enum SamplingRate {
    Low(1), Medium(2), High(3);

    private final int value;
    private SamplingRate(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
};

public class DigitalPiano extends Piano {
    private final boolean heavy;
    private final int samplingRate; // Low, Medium, High

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, int length, int width, boolean heavy, SamplingRate samplingRate, int Strings ) {
        super(name, purchasePrice, sellingPrice, length, width, Strings);
        this.heavy = heavy;
        this.samplingRate = samplingRate.getValue();
    }

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, int length, int width, boolean heavy, SamplingRate samplingRate ) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.heavy = heavy;
        this.samplingRate = samplingRate.getValue();
    }

    public boolean isHeavy() {
        return heavy;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    @Override
    public String toString() {
        return "DigitalPiano{" +
                "heavy=" + heavy +
                ", samplingRate=" + samplingRate +
                ", Strings=" + getStrings() +
                ", name='" + getName() + '\'' +
                ", purchasePrice=" + getPurchasePrice() +
                ", sellingPrice=" + getSellingPrice() +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
