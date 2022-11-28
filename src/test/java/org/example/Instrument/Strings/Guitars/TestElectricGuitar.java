package org.example.Instrument.Strings.Guitars;
import org.junit.jupiter.api.*;

public class TestElectricGuitar {
    @Test
    public void hasAmplifier() {
        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
        Assertions.assertTrue(electricGuitar.hasAmplifier());
    }

    @Test
    public void hasPedals() {
        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
        Assertions.assertTrue(electricGuitar.hasPedals());
    }

    @Test
    public void hasNoAmplifier() {
        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
        Assertions.assertFalse(electricGuitar.hasAmplifier());
    }

    @Test
    public void hasNoPedals() {
        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
        Assertions.assertFalse(electricGuitar.hasPedals());
    }
}
