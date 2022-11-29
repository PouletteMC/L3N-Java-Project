package org.example.Instruments.Strings.Pianos;
import org.junit.jupiter.api.*;

@DisplayName("Test Digital Piano")
public class TestDigitalPiano {
    @Test
    @DisplayName("The sampling rate can be set")
    public void SamplingRate() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, SamplingRate.Low, 88, 88, true);
        Assertions.assertEquals(1, digitalPiano.getSamplingRate());
        digitalPiano.setSamplingRate(SamplingRate.Medium);
        Assertions.assertEquals(2, digitalPiano.getSamplingRate());
        digitalPiano.setSamplingRate(SamplingRate.High);
        Assertions.assertEquals(3, digitalPiano.getSamplingRate());
    }
    @Test
    @DisplayName("The number of strings and keys can be initialized")
    public void TestStringsSpec() {
        DigitalPiano digitalPiano = new DigitalPiano("Casio", 1000, 2000, SamplingRate.Low, 88, 120, false);
        Assertions.assertEquals(120, digitalPiano.getStrings());
        Assertions.assertEquals(88, digitalPiano.getKeys());
    }
    @Test
    @DisplayName("The number of strings is equal to the number of keys if not specified")
    public void TestStringsKeySpec() {
        DigitalPiano digitalPiano = new DigitalPiano("Roland", 1000, 2000, SamplingRate.Low, 88, false);
        Assertions.assertEquals(88, digitalPiano.getStrings());
        Assertions.assertEquals(88, digitalPiano.getKeys());
    }
    @Test
    @DisplayName("The number of strings and keys are 88 if not specified")
    public void TestStringsNoSpec() {
        DigitalPiano digitalPiano = new DigitalPiano("Korg", 1000, 2000, SamplingRate.Medium, false);
        Assertions.assertEquals(88, digitalPiano.getStrings());
        Assertions.assertEquals(88, digitalPiano.getKeys());
    }
    @Test
    @DisplayName("The heavy param can be initialized")
    public void TestHeavyParam(){
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, SamplingRate.Low, 88, 88, true);
        Assertions.assertTrue(digitalPiano.isHeavy());
        digitalPiano = new DigitalPiano("Casio", 1000, 2000, SamplingRate.Low, 88, 120, false);
        Assertions.assertFalse(digitalPiano.isHeavy());
        digitalPiano = new DigitalPiano("Roland", 1000, 2000, SamplingRate.Low, 88, false);
        Assertions.assertFalse(digitalPiano.isHeavy());
        digitalPiano = new DigitalPiano("Korg", 1000, 2000, SamplingRate.Medium, false);
        Assertions.assertFalse(digitalPiano.isHeavy());
    }

    @Test
    @DisplayName("The length and width can be initialized")
    public void TestDimensions() {
        DigitalPiano digitalPiano = new DigitalPiano("Yamaha", 1000, 2000, SamplingRate.Low, 88, 88, true);
        Assertions.assertEquals(0, digitalPiano.getLength());
        Assertions.assertEquals(0, digitalPiano.getWidth());
    }

}
