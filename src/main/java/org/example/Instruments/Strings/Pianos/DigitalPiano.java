package org.example.Instruments.Strings.Pianos;

import org.example.Instruments.Instruments;

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

public class DigitalPiano extends Instruments implements Piano {

    private int samplingRate;
    private final int keys;
    private final int strings;
    private final boolean heavy;
    private final int length;
    private final int width;

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, SamplingRate samplingRate, int keys, int strings, boolean heavy, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.samplingRate = samplingRate.getValue();
        this.keys = keys;
        this.strings = strings;
        this.heavy = heavy;
        this.length = length;
        this.width = width;
    }

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, SamplingRate samplingRate, int keys, boolean heavy, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.samplingRate = samplingRate.getValue();
        this.keys = keys;
        this.strings = keys;
        this.heavy = heavy;
        this.length = length;
        this.width = width;
    }

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, SamplingRate samplingRate, boolean heavy, int length, int width) {
        super(name, purchasePrice, sellingPrice);
        this.samplingRate = samplingRate.getValue();
        this.strings = this.keys = 88;
        this.heavy = heavy;
        this.length = length;
        this.width = width;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    public int getKeys() {
        return keys;
    }

    public int getStrings() {
        return strings;
    }

    public boolean isHeavy() {
        return heavy;
    }

    public void setSamplingRate(SamplingRate samplingRate) {
        this.samplingRate = samplingRate.getValue();
    }

    @Override
    public String toString() {
        return "DigitalPiano{" +
                "name='" + getName() + '\'' +
                ", purchasePrice=" + getPurchasePrice() +
                ", sellingPrice=" + getSellingPrice() +
                ", profit=" + getProfit() +
                ", samplingRate=" + samplingRate +
                ", keys=" + keys +
                ", strings=" + strings +
                ", heavy=" + heavy +
                '}';
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
}
