package org.example.Buildings.Hotel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestHotel4 {
    @Test
    @DisplayName("Random test")
    void test() {
        Hotel4 hotel = new Hotel4("Hotel", 500, "street", new Room[0], 5, 5, 5, 5);
        Assertions.assertEquals("Hotel4{Hotel, 500, street, 0, 5, 5, 1, 5, 5}", hotel.toString());
    }
}