package org.example.Instruments.Strings.Pianos;

import org.junit.jupiter.api.*;

public class TestStraightPiano {

    @Test
    @DisplayName("Create a new StraightPiano and check the getters and setters")
    public void testStraightPiano() {
        StraightPiano straightPiano = new StraightPiano("Straight Piano", 1000, 2000, false, true, 88, 88, 100, 50);
        Assertions.assertEquals("Straight Piano", straightPiano.getName());
        Assertions.assertEquals(1000, straightPiano.getPurchasePrice());
        Assertions.assertEquals(2000, straightPiano.getSellingPrice());
        Assertions.assertFalse(straightPiano.isSilenced());
        Assertions.assertTrue(straightPiano.getCrossedStrings());
        Assertions.assertEquals(88, straightPiano.getStrings());
        Assertions.assertEquals(88, straightPiano.getKeys());
        Assertions.assertEquals(100, straightPiano.getLength());
        Assertions.assertEquals(50, straightPiano.getWidth());
        straightPiano.setSilenced(true);
        Assertions.assertTrue(straightPiano.isSilenced());
    }

    @Test
    @DisplayName("The number of strings is equal to the number of keys if not specified")
    public void TestStringsKeySpec() {
        StraightPiano straightPiano = new StraightPiano("Straight Piano", 1000, 2000, false, true, 88, 100, 50);
        Assertions.assertEquals(88, straightPiano.getStrings());
        Assertions.assertEquals(88, straightPiano.getKeys());
    }

    @Test
    @DisplayName("The number of strings and keys are 88 if not specified")
    public void TestStringsNoSpec() {
        StraightPiano straightPiano = new StraightPiano("Straight Piano", 1000, 2000, false, true, 100, 50);
        Assertions.assertEquals(88, straightPiano.getStrings());
        Assertions.assertEquals(88, straightPiano.getKeys());
    }

    @Test
    @DisplayName("The toString method returns the correct string")
    public void TestToString() {
        StraightPiano straightPiano = new StraightPiano("Straight Piano", 1000, 2000, false, true, 88, 88, 100, 50);
        Assertions.assertEquals("StraightPiano{name='Straight Piano', sellingPrice=2000, dimensions=100 x 50, keys=88, strings=88, silenced=false, crossedStrings=true}", straightPiano.toString());
    }

}
