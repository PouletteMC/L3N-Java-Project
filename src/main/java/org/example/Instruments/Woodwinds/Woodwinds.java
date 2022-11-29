package org.example.Instruments.Woodwinds;

import org.example.Instruments.Instruments;

// A woodwind instrument is a type of instrument
public interface Woodwinds {
    // The type is not expected to change, so it is final
    final String type = null;
    String getType();
}
