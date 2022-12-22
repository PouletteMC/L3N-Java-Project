package org.example.Instruments.Strings.Pianos;

import org.example.Instruments.Instruments;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Creates a Digital Piano object
 */
public class DigitalPiano extends Instruments implements Piano {
    private int samplingRate;
    private final int keys;
    private final int strings;
    private final boolean heavy;
    private final int length;
    private final int width;

    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param samplingRate The sampling rate of the instrument
     * @param heavy Whether or bot the instrument is heavy
     * @param length The length of the instrument
     * @param width The width of the instrument
     * @param keys The number of keys on the instrument
     * @param strings The number of strings on the instrument
     */
    public DigitalPiano(String name, int purchasePrice, int sellingPrice, SamplingRate samplingRate, boolean heavy, int length, int width,  int keys, int strings) {
        super(name, purchasePrice, sellingPrice);
        this.samplingRate = samplingRate.getValue();
        this.keys = keys;
        this.strings = strings;
        this.heavy = heavy;
        this.length = length;
        this.width = width;
    }

    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param samplingRate The sampling rate of the instrument
     * @param heavy Whether or bot the instrument is heavy
     * @param length The length of the instrument
     * @param width The width of the instrument
     * @param keys The number of keys on the instrument
     */
    public DigitalPiano(String name, int purchasePrice, int sellingPrice, SamplingRate samplingRate, boolean heavy, int length, int width,  int keys) {
        super(name, purchasePrice, sellingPrice);
        this.samplingRate = samplingRate.getValue();
        this.keys = keys;
        this.strings = keys;
        this.heavy = heavy;
        this.length = length;
        this.width = width;
    }
    /**
     * @param name The name of the instrument
     * @param purchasePrice The purchase price of the instrument
     * @param sellingPrice The selling price of the instrument
     * @param samplingRate The sampling rate of the instrument
     * @param heavy Whether or bot the instrument is heavy
     * @param length The length of the instrument
     * @param width The width of the instrument
     */
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

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
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
                ", sellingPrice=" + getSellingPrice() +
                ", dimensions=" + String.format("%d x %d", getLength(), getWidth()) +
                ", samplingRate=" + samplingRate +
                ", keys=" + keys +
                ", strings=" + strings +
                ", heavy=" + heavy +
                '}';

        // Sample output of toString() method
        // DigitalPiano{name='Yamaha P-125', purchasePrice=500, sellingPrice=600, dimensions=1200x400, samplingRate=2, keys=88, strings=88, heavy=false}
         }
}
