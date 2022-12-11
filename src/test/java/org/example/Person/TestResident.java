package org.example.Person;
import org.example.Buildings.Bar;
import org.example.Buildings.Buildings;
import org.example.Buildings.House;
import org.example.Buildings.Tower;
import org.junit.jupiter.api.*;

public class TestResident {

    Bar bar = new Bar("Bar", 100, "Address", 100, 18);
    House house = new House(100, "Address", 50, 2, 1, false );
    Tower tower1 = new Tower("Tower1", 100, 100, "Address1");
    Tower tower2 = new Tower("Tower2", 100, 100, "Address2");


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

    @Test
    @DisplayName("The setters work correctly")
    public void testSetters() {
        Resident resident = new Resident("John", "Doe", 30);
        resident.setJob("Plumber");
        Assertions.assertEquals("Plumber", resident.getJob());
        resident.setWorkPlace(bar);
        Assertions.assertEquals(bar, resident.getWorkPlace());
        resident.setResidence(house);
        Assertions.assertEquals(house, resident.getResidence());
        resident.addBuilding(tower1);
        Assertions.assertEquals(tower1, resident.getBuildings()[0]);
        resident.addBuilding(tower2);
        Assertions.assertEquals(tower2, resident.getBuildings()[1]);
        Assertions.assertEquals(2, resident.getBuildings().length);
        resident.removeBuilding(tower1);
        Assertions.assertEquals(tower2, resident.getBuildings()[0]);
        Assertions.assertEquals(1, resident.getBuildings().length);
        resident.removeBuilding(tower2);
        Assertions.assertEquals(0, resident.getBuildings().length);
        resident.setBuildings(new Buildings[]{tower1, tower2});
        Assertions.assertEquals(tower1, resident.getBuildings()[0]);
    }
}
