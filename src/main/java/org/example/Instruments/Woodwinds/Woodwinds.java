package org.example.Instruments.Woodwinds;

import org.example.GlobalMethods;

/**
 * These methods must be implemented by all woodwind instruments
 * @Param: type
 * @Method: getType() - returns the type of reed used by the instrument
 */
public interface Woodwinds extends GlobalMethods { // A woodwind instrument is a type of instrument
    String type = null;
    String getType();
}
