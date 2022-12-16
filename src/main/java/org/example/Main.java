package org.example;

import org.example.Buildings.*;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Poulette
 * @version 1.2
 */

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Hello, welcome to Mele-Mele!");
                System.out.println("We will start by creating three towers");

                System.out.println("Now we will create five houses");
                for (int i = 0; i < 5; i++) {
                        createHouse(sc);
                }
        }










        private static House createHouse(Scanner sc) {
                String houseAddress = getString(sc, "Please enter the address of the house");
                System.out.println("The address will be " + houseAddress + ".");

                int houseArea = getNumber(sc, "What is the area of the house?", 0, 1000);
                System.out.println("The area will be " + houseArea + " square meters.");

                int houseRooms = getNumber(sc, "How many rooms does it have?", 0, 10);
                System.out.println("The house will have " + houseRooms + " rooms.");

                int houseFloors = getNumber(sc, "How many floors does it have?", 0, 3);
                System.out.println("The house will have " + houseFloors + " floors.");

                boolean hasGarage = getBoolean(sc, "Does it have a garage?");
                System.out.println("The house will " + (hasGarage ? "have" : "not have") + " a garage.");

                boolean hasGarden = getBoolean(sc, "Does it have a garden?");
                int houseGardenArea = hasGarden ? getNumber(sc, "What is the area of the garden?", 0, 1000) : 0;
                System.out.println("The house will " + (hasGarden ? "have a garden of " + houseGardenArea + " square meters." : "not have a garden."));

                House house = new House(houseArea, houseAddress, houseGardenArea, houseRooms, houseFloors, hasGarage);
                System.out.println("The house has been created.");
                return house;
        }

        private static Tower createTower(@NotNull Scanner sc, int floors, int apartments) {
                String towerName = getString(sc, "What is the name of the tower?");
                System.out.println("The first tower will be called " + towerName + ".");

                String towerAddress = getString(sc, "What is the address of the tower?");
                System.out.println("The address will be " + towerAddress + ".");

                int towerOffices = getNumber(sc, "How many offices does it have?", 0, 100);
                System.out.println("The tower will have " + towerOffices + " offices.");

                Tower tower = new Tower(towerName, apartments, towerOffices, towerAddress);
                System.out.println("Created a new tower called " + tower.getName() + " with " + tower.getOffices() + " offices" + " and " + tower.getApartments() + " apartments over " + tower.getFloors() + " floors and will be located at " + tower.getAddress() + ".");
                return tower;
        }






        private static int getNumber(@NotNull Scanner sc, String message, int min, int max) {
                int number;
                do {
                        System.out.println(message);
                        while (!sc.hasNextInt()) {
                                System.out.println("That's not a number!");
                                sc.next();
                        }
                        number = sc.nextInt();
                        // If the number is outside the range, tell the range and ask again
                        if (number < min || number > max) {
                                System.out.println("The number must be between " + min + " and " + max + ".");
                        }
                } while ( number > max || number < min);
                return number;
        }


        private static boolean getBoolean(@NotNull Scanner sc, String message) {
                boolean bool;
                do {
                        System.out.println(message);
                        while (!sc.hasNextBoolean()) {
                                System.out.println("This value must be true or false.");
                                sc.next();
                        }
                        bool = sc.nextBoolean();
                } while ( bool != true || bool != false);
                return bool;
        }

        private static String getString(@NotNull Scanner sc, String message) {
                String string;
                do {
                        System.out.println(message);
                        while (!sc.hasNext()) {
                                System.out.println("This value must be a string.");
                                sc.next();
                        }
                        string = sc.next();
                } while ( string == null);
                return string;
        }

        private static String getStringWithOptions(@NotNull Scanner sc, String message, String[] options) {
                String string;
                do {
                        System.out.println(message);
                        while (!sc.hasNext()) {
                                System.out.println("This value must be a string.");
                                sc.next();
                        }
                        string = sc.next();
                } while ( string == null || !Arrays.asList(options).contains(string));
                return string;
        }

}
