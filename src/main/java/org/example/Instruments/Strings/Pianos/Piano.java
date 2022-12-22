package org.example.Instruments.Strings.Pianos;

import org.example.Instruments.Strings.Strings;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Defines the methods and parameters required for a Piano and initializes them with default values
 */
public interface Piano extends Strings {
    int Strings = 88;
    int Keys = 88;
    int getStrings();
    int getKeys();

}
