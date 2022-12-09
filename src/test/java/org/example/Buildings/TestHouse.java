package org.example.Buildings;

import org.junit.jupiter.api.*;

@DisplayName("Test House")
public class TestHouse {
    @Test
    @DisplayName("The house has a garden")
    public void TestGardenArea(){
        House house = new House( 100, "1234 Main Street", 100, 5, 2, true);
        Assertions.assertEquals(100, house.getGardenArea());
    }
}
