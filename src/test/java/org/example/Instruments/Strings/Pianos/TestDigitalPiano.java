package org.example.Instruments.Strings.Pianos;
import org.junit.jupiter.api.*;

public class TestDigitalPiano {
    @Test
    public void SamplingRate() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, 100, 50, true, 3, 90);
        Assertions.assertEquals(3, digitalPiano.getSamplingRate());
    }
    @Test
    public void StringAmountSpecified() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, 100, 50, true, 1, 120);
        Assertions.assertEquals(120, digitalPiano.getStrings());
    }

    @Test
    public void StringAmountDefault() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, 100, 50, true, 2);
        Assertions.assertEquals(88, digitalPiano.getStrings());
    }
}
