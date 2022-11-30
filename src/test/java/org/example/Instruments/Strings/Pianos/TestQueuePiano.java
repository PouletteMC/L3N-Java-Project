package org.example.Instruments.Strings.Pianos;
import org.junit.jupiter.api.*;

public class TestQueuePiano {
@Test
@DisplayName("Create a new QueuePiano and check the getters")
    public void testQueuePiano() {
        QueuePiano queuePiano = new QueuePiano("Queue Piano", 1000, 2000, 88, 88, 100, 50, Size.ExtraLarge);
        Assertions.assertEquals("Queue Piano", queuePiano.getName());
        Assertions.assertEquals(1000, queuePiano.getPurchasePrice());
        Assertions.assertEquals(2000, queuePiano.getSellingPrice());
        Assertions.assertEquals(88, queuePiano.getStrings());
        Assertions.assertEquals(88, queuePiano.getKeys());
        Assertions.assertEquals(100, queuePiano.getLength());
        Assertions.assertEquals(50, queuePiano.getWidth());
        Assertions.assertEquals( "4/4", queuePiano.getSize());
    }

    @Test
    @DisplayName("The number of strings is equal to the number of keys if not specified")
    public void TestStringsKeySpec() {
        QueuePiano queuePiano = new QueuePiano("Queue Piano", 1000, 2000, 88, 100, 50, Size.ExtraLarge);
        Assertions.assertEquals(88, queuePiano.getStrings());
        Assertions.assertEquals(88, queuePiano.getKeys());
    }

    @Test
    @DisplayName("The number of strings and keys are 88 if not specified")
    public void TestStringsNoSpec() {
        QueuePiano queuePiano = new QueuePiano("Queue Piano", 1000, 2000, 100, 50, Size.ExtraLarge);
        Assertions.assertEquals(88, queuePiano.getStrings());
        Assertions.assertEquals(88, queuePiano.getKeys());
    }

    @Test
    @DisplayName("The toString method returns the correct string")
    public void TestToString() {
        QueuePiano queuePiano = new QueuePiano("Queue Piano", 1000, 2000, 88, 88, 100, 50, Size.ExtraLarge);
        Assertions.assertEquals("QueuePiano{name='Queue Piano', sellingPrice=2000, dimensions=100 x 50, keys=88, strings=88, size=4/4}", queuePiano.toString());
    }
}
