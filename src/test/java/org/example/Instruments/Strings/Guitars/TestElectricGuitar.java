//package org.example.Instruments.Strings.Guitars;
//import org.junit.jupiter.api.*;
//
//public class TestElectricGuitar {
//    @Test
//    public void hasAmplifier() {
//        ElectricGuitar electricGuitar = new ElectricGuitar(, 2000, 100, 50, true,  true);
//
//        Assertions.assertTrue(electricGuitar.hasAmplifier());
//        Assertions.assertEquals(1000, electricGuitar.getPurchasePrice());
//        Assertions.assertEquals(2000, electricGuitar.getSellingPrice());
//        Assertions.assertEquals(1000, electricGuitar.getProfit());
//
//        electricGuitar.setPurchasePrice(2000);
//        electricGuitar.setSellingPrice(3000);
//        Assertions.assertEquals(2000, electricGuitar.getPurchasePrice());
//        Assertions.assertEquals(3000, electricGuitar.getSellingPrice());
//        Assertions.assertEquals(1000, electricGuitar.getProfit());
//
//    }
//
//    @Test
//    public void hasPedals() {
//        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
//        Assertions.assertTrue(electricGuitar.hasPedals());
//    }
//
//    @Test
//    public void hasNoAmplifier() {
//        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
//        Assertions.assertFalse(electricGuitar.hasAmplifier());
//    }
//
//    @Test
//    public void hasNoPedals() {
//        ElectricGuitar electricGuitar = new ElectricGuitar(1000, 2000, 100, 50, true,  true);
//        Assertions.assertFalse(electricGuitar.hasPedals());
//    }
//}
