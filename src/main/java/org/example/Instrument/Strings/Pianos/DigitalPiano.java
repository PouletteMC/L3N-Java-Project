package org.example.Instrument.Strings.Pianos;

public class DigitalPiano extends Piano {
    private final boolean heavy;
    private final int samplingRate; // Can only be 1, 2 or 3

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, int length, int width, boolean heavy, int samplingRate, int Strings ) {
        super(name, purchasePrice, sellingPrice, length, width, Strings);
        this.heavy = heavy;
        this.samplingRate = samplingRate;
    }

    public DigitalPiano(String name, int purchasePrice, int sellingPrice, int length, int width, boolean heavy, int samplingRate ) {
        super(name, purchasePrice, sellingPrice, length, width);
        this.heavy = heavy;
        this.samplingRate = samplingRate;
    }

    public boolean isHeavy() {
        return heavy;
    }

    public int getSamplingRate() {
        return samplingRate;
    }

    @Override
    public String toString() {
        return super.toString() + " est un piano  numérique. \n Possède un clavier lourd : " + heavy +
                " \n Qualité d'échantillonage : " + samplingRate;
    }
}
