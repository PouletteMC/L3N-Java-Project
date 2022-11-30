package org.example.Instruments.Strings.Guitars;
import org.junit.jupiter.api.*;

public class TestElectricGuitar {

    @Test
    @DisplayName("Create a new ElectricGuitar and check the getters")
    public void testElectricGuitar() {
        ElectricGuitar electricGuitar = new ElectricGuitar("Electric Guitar", 1000, 2000, true, true, 100, 50);
        Assertions.assertEquals("Electric Guitar", electricGuitar.getName());
        Assertions.assertEquals(1000, electricGuitar.getPurchasePrice());
        Assertions.assertEquals(2000, electricGuitar.getSellingPrice());
        Assertions.assertTrue(electricGuitar.hasAmplifier());
        Assertions.assertTrue(electricGuitar.hasPedals());
        Assertions.assertEquals(100, electricGuitar.getLength());
        Assertions.assertEquals(50, electricGuitar.getWidth());
    }

    @Test
    @DisplayName("The toString method returns the correct string")
    public void TestToString() {
        ElectricGuitar electricGuitar = new ElectricGuitar("Electric Guitar", 1000, 2000, true, true, 100, 50);
        Assertions.assertEquals("ElectricGuitar{amplifier=true, pedals=true, length=100, width=50}", electricGuitar.toString());
    }
}
