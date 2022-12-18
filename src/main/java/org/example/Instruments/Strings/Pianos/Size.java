package org.example.Instruments.Strings.Pianos;

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
