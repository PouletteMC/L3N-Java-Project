package org.example.Person;
import org.junit.jupiter.api.*;

public class TestResident {
    @Test
    @DisplayName("Create a new Resident and check the getters")
    public void testResident() {
        Resident resident = new Resident("John", "Doe", 30);
        Assertions.assertEquals("John", resident.getName());
        Assertions.assertEquals("Doe", resident.getSurname());
        Assertions.assertEquals(30, resident.getAge());
    }
    @Test
    @DisplayName("The toString method returns the correct string")
    public void TestToString() {
        Resident resident = new Resident("John", "Doe", 30);
        Assertions.assertEquals("Resident: John Doe, 30", resident.toString());
    }

    
}
