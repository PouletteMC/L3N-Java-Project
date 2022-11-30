package org.example.Instruments.Strings.Guitars;

import org.junit.jupiter.api.*;

public class TestAcousticGuitar {
    @Test
    @DisplayName("Create a new AcousticGuitar and check the getters")
    public void testAcousticGuitar() {
        AcousticGuitar acousticGuitar = new AcousticGuitar("Acoustic Guitar", 1000, 2000, true, 1, 100, 50);
        Assertions.assertEquals("Acoustic Guitar", acousticGuitar.getName());
        Assertions.assertEquals(1000, acousticGuitar.getPurchasePrice());
        Assertions.assertEquals(2000, acousticGuitar.getSellingPrice());
        Assertions.assertEquals(1, acousticGuitar.getPull());
        Assertions.assertTrue(acousticGuitar.isRightHanded());
        Assertions.assertEquals(100, acousticGuitar.getLength());
        Assertions.assertEquals(50, acousticGuitar.getWidth());
    }

    @Test
    @DisplayName("The toString method returns the correct string")
    public void TestToString() {
        AcousticGuitar acousticGuitar = new AcousticGuitar("Acoustic Guitar", 1000, 2000, false, 1, 100, 50);
        Assertions.assertEquals("AcousticGuitar{pull=1, rightHanded=false, length=100, width=50}", acousticGuitar.toString());
    }
}
