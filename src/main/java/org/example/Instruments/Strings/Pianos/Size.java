package org.example.Instruments.Strings.Pianos;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Translates the size of a piano into a human-readable format
 */
public enum Size {
    Small("Toad"), Medium("1/4"), Large("1/2"), ExtraLarge("4/4");
    private final String value;

    private Size(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
