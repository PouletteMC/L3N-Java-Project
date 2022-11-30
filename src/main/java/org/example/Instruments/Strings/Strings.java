package org.example.Instruments.Strings;
import org.example.GlobalMethods;
import org.example.Instruments.Instruments;

// A string instrument is a type of instrument
public interface Strings extends GlobalMethods {
    // These values are not expected to change during the lifetime of the object, so they are final
    int length = 0;
    int width = 0;

    int getLength();
    int getWidth();
}


