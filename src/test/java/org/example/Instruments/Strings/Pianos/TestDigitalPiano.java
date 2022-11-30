package org.example.Instruments.Strings.Pianos;
import org.junit.jupiter.api.*;

@DisplayName("Test Digital Piano")
public class TestDigitalPiano {
    @Test
    @DisplayName("The sampling rate can be set")
    public void SamplingRate() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, SamplingRate.Low, true, 100, 100, 88, 88);
        Assertions.assertEquals(1, digitalPiano.getSamplingRate());
        digitalPiano.setSamplingRate(SamplingRate.Medium);
        Assertions.assertEquals(2, digitalPiano.getSamplingRate());
        digitalPiano.setSamplingRate(SamplingRate.High);
        Assertions.assertEquals(3, digitalPiano.getSamplingRate());
    }
    @Test
    @DisplayName("The number of strings and keys can be initialized")
    public void TestStringsSpec() {
        DigitalPiano digitalPiano = new DigitalPiano("Casio", 1000, 2000, SamplingRate.Low, false, 120, 100, 88, 120);
        Assertions.assertEquals(120, digitalPiano.getStrings());
        Assertions.assertEquals(88, digitalPiano.getKeys());
    }
    @Test
    @DisplayName("The number of strings is equal to the number of keys if not specified")
    public void TestStringsKeySpec() {
        DigitalPiano digitalPiano = new DigitalPiano("Roland", 1000, 2000, SamplingRate.Low, false, 120, 100, 88);
        Assertions.assertEquals(88, digitalPiano.getStrings());
        Assertions.assertEquals(88, digitalPiano.getKeys());
    }
    @Test
    @DisplayName("The number of strings and keys are 88 if not specified")
    public void TestStringsNoSpec() {
        DigitalPiano digitalPiano = new DigitalPiano("Korg", 1000, 2000, SamplingRate.Low, false, 120, 100);
        Assertions.assertEquals(88, digitalPiano.getStrings());
        Assertions.assertEquals(88, digitalPiano.getKeys());
    }
    @Test
    @DisplayName("The heavy param can be initialized")
    public void TestHeavyParam(){
        DigitalPiano digitalPiano = new DigitalPiano("Korg", 1000, 2000, SamplingRate.Low, false, 120, 100);
        Assertions.assertFalse(digitalPiano.isHeavy());
        DigitalPiano digitalPiano2 = new DigitalPiano("Korg", 1000, 2000, SamplingRate.Low, true, 120, 100);
        Assertions.assertTrue(digitalPiano2.isHeavy());
    }

    @Test
    @DisplayName("The getters return the correct values")
    public void TestDimensions() {
        DigitalPiano digitalPiano = new DigitalPiano("Casio", 1000, 2000, SamplingRate.Low, false, 120, 100, 88, 88);
        Assertions.assertEquals(120, digitalPiano.getLength());
        Assertions.assertEquals(100, digitalPiano.getWidth());
    }

    @Test
    @DisplayName("The toString method returns the correct string")
    public void TestToString() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha P-125", 500, 700, SamplingRate.Medium, false, 1200, 400, 88, 88);
        Assertions.assertEquals("DigitalPiano{name='Yamaha P-125', sellingPrice=700, dimensions=1200 x 400, samplingRate=2, keys=88, strings=88, heavy=false}", digitalPiano.toString());
    }

}
