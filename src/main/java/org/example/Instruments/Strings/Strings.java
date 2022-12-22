package org.example.Instruments.Strings;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 * Defines the methods and parameters required for a String instrument
 */
public interface Strings {
    // These values are not expected to change during the lifetime of the object, so they are final
    int length = 0;
    int width = 0;

    int getLength();
    int getWidth();
}


