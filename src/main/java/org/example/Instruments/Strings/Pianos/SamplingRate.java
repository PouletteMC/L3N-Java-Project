package org.example.Instruments.Strings.Pianos;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Translates the sampling rate of a piano into a human-readable format
 */
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
