package org.example.Instruments.Strings.Pianos;

import org.example.Instruments.Strings.Strings;

public interface Piano extends Strings {
    int Strings = 88;
    int Keys = 88;

    int getStrings();
    int getKeys();
}
