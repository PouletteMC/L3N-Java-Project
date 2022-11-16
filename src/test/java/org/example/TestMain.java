package org.example;
import org.junit.jupiter.api.*;
public class TestMain {
    @Test
    public void testMain() {
        Assertions.assertEquals(0, TestAssertion.main());
    }
}
