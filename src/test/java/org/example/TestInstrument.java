package org.example;
import org.junit.jupiter.api.*;
public class TestInstrument {
    @Test
    public void testMain() {
        Assertions.assertEquals(0, TestAssertion.main());
    }
}
