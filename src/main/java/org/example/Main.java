package org.example;

import org.example.Buildings.*;
import org.example.Person.*;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.5
 */

public class Main {

        private static final Scanner scanner = new Scanner(System.in);
        private static final ArrayList<House> houses = new ArrayList<>();
        private static final ArrayList<Tower> towers = new ArrayList<>();
        private static final ArrayList<Resident> residents = new ArrayList<>();
        private static final ArrayList<Tourist> tourists = new ArrayList<>();
        private static final ArrayList<Tenant> tenants = new ArrayList<>();

        // TODO: Add hotels
//        private static ArrayList<Hotel> hotels = new ArrayList<>();



        public static void main(String[] args) {
                System.out.println("Hello, welcome to Mele-Mele!");
                System.out.println("Please enter your name:");
                String userName = scanner.nextLine();
                System.out.println("Hello " + userName);

//                System.out.println("We will start by creating a few towers");
//                Tower tower10_1 = createTower(10);
//                Tower tower10_2 = createTower(10);
//                Tower tower15 = createTower(15);
//
//                System.out.println("Now we will create a few houses");
//                House house1 = createHouse();
//                House house2 = createHouse();
//                House house3 = createHouse();
//                House house4 = createHouse();
//                House house5 = createHouse();

                handleMainMenu();

        }



        private static @NotNull House createHouse() {
                String houseAddress = getString("Please enter the address of the house");
                System.out.println("The address will be " + houseAddress + ".");

                int houseArea = getNumber("What is the area of the house?", 0, 1000);
                System.out.println("The area will be " + houseArea + " square meters.");

                int houseRooms = getNumber("How many rooms does it have?", 0, 10);
                System.out.println("The house will have " + houseRooms + " rooms.");

                int houseFloors = getNumber("How many floors does it have?", 0, 3);
                System.out.println("The house will have " + houseFloors + " floors.");

                boolean hasGarage = getStringWithOptions("Does it have a garage?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The house will " + (hasGarage ? "" : "not ") + "have a garage.");

                boolean hasGarden = getStringWithOptions("Does it have a garden?", new String[]{"yes", "no"}).equals("yes");
                int houseGardenArea = hasGarden ? getNumber("What is the area of the garden?", 0, 1000) : 0;
                System.out.println("The house will " + (hasGarden ? "have a garden of " + houseGardenArea + " square meters." : "not have a garden."));

                House house = new House(houseArea, houseAddress, houseGardenArea, houseRooms, houseFloors, hasGarage);
                houses.add(house);
                System.out.println("The house has been created.");
                return house;
        }

        private static @NotNull Tower createTower(int apartments) {
                String towerName = getString("What is the name of the tower?");
                System.out.println("The first tower will be called " + towerName + ".");

                String towerAddress = getString("What is the address of the tower?");
                System.out.println("The address will be " + towerAddress + ".");

                int towerOffices = getNumber("How many offices does it have?", 0, 100);
                System.out.println("The tower will have " + towerOffices + " offices.");

                Tower tower = new Tower(towerName, apartments, towerOffices, towerAddress);
                towers.add(tower);
                System.out.println("Created a new tower called " + tower.getName() + " with " + tower.getOffices() + " offices" + " and " + tower.getApartments() + " apartments over " + tower.getFloors() + " floors and will be located at " + tower.getAddress() + ".");
                return tower;
        }


        /**
         * @param message The message to display
         * @param min The minimum value
         * @param max The maximum value
         * @return The number entered by the user
         */
        private static int getNumber(String message, int min, int max) {
                int number;
                do {
                        System.out.println(message);
                        while (!Main.scanner.hasNextInt()) {
                                System.out.println("That's not a number!");
                                Main.scanner.next();
                        }
                        number = Main.scanner.nextInt();
                        // If the number is outside the range, tell the range and ask again
                        if (number < min || number > max) {
                                System.out.println("The number must be between " + min + " and " + max + ".");
                        }
                } while ( number > max || number < min);
                return number;
        }

        /**
         * @param message The message to display
         * @return The string entered by the user
         */
        private static String getString(String message) {
                String string;
                do {
                        System.out.println(message);
                        while (!Main.scanner.hasNext()) {
                                System.out.println("This value must be a string.");
                                Main.scanner.next();
                        }
                        string = Main.scanner.next();
                } while ( string == null);
                return string;
        }

        /**
         * @param message The message to display
         * @param options The options to choose from
         * @return The string chosen by the user
         */
        private static String getStringWithOptions(String message, String[] options) {
                String string;
                do {
                        System.out.println(message);
                        while (!Main.scanner.hasNext()) {
                                System.out.println("This value must be a string.");
                                Main.scanner.next();
                        }
                        string = Main.scanner.next();
                } while ( string == null || !Arrays.asList(options).contains(string));
                return string;
        }



        public static ArrayList<Tower> getTowers() {
                return towers;
        }

        public static ArrayList<House> getHouses() {
                return houses;
        }

        private static int displayTowerMenu() {
                System.out.println("What would you like to do?");
                System.out.println("1. Display all the towers");
                System.out.println("2. Display a specific tower");
                System.out.println("3. Display the largest tower");
                System.out.println("4. Return to the main menu");
                return getNumber("Please enter a number between 1 and 4", 1, 4);
        };
        private static int displayHouseMenu() {
                System.out.println("What would you like to do?");
                System.out.println("1. Display all the houses");
                System.out.println("2. Display a specific house");
                System.out.println("3. Display the largest house");
                System.out.println("4. Return to the main menu");
                return getNumber("Please enter a number between 1 and 4", 1, 4);
        };
        private static int displayBuildingMenu() {
                System.out.println("What would you like to do?");
                System.out.println("1. Display all the buildings");
                System.out.println("2. Display a specific building");
                System.out.println("3. Display the largest building");
                System.out.println("4. Return to the main menu");
                return getNumber("Please enter a number between 1 and 4", 1, 4);
        };
        private static void displayMainMenu() {
                System.out.flush();
                System.out.println("Please select an option:");
                System.out.println("1. Create a new house");
                System.out.println("2. Create a new tower");
                System.out.println("3. Display all the houses");
                System.out.println("4. Display all the towers");

        };

        private static void handleMainMenu() {
                while(true) {
                        displayMainMenu();
                        int option = getNumber("Please enter a number between 1 and 4", 1, 4);
                        switch (option) {
                                case 1:
                                        createHouse();
                                        break;
                                case 2:
                                        createTower(getNumber("How many apartments does it have?", 0, 1000));
                                        break;
                        }
                }
        }

}
