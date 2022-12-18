package org.example.Instruments.Strings.Pianos;

public enum SamplingRate {
    Low(1), Medium(2), High(3);

    private final int value;

    private SamplingRate(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
