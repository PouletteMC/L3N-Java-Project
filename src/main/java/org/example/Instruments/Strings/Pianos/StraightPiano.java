package org.example.Instruments.Strings.Pianos;

public class StraightPiano extends Piano {
    private boolean silenced;     // We assume that the Piano can be silenced after the fact
    private final boolean crossedStrings; // We assume that the strings cannot be crossed after the fact, so the parameter is final
    private final int strings;    // We assume that the number of strings cannot be changed after the fact, so the parameter is final
    private final int keys;       // We assume that the number of keys cannot be changed after the fact, so the parameter is final

    public StraightPiano(boolean silenced, boolean crossedStrings, int strings, int keys) {
        this.silenced = silenced;
        this.crossedStrings = crossedStrings;
        this.strings = strings;
        this.keys = keys;
    }

    public boolean getSilenced() {
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

    public String toString() {
        return "StraightPiano{" +
                "silenced=" + silenced +
                ", crossedStrings=" + crossedStrings +
                ", strings=" + strings +
                ", keys=" + keys +
                '}';
    }

}
