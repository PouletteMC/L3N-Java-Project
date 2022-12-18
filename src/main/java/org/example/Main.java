package org.example;

import org.example.Buildings.*;
import org.example.Instruments.Instruments;
import org.example.Instruments.Strings.Guitars.AcousticGuitar;
import org.example.Instruments.Strings.Guitars.ElectricGuitar;
import org.example.Instruments.Strings.Pianos.*;
import org.example.Instruments.Woodwinds.Clarinet;
import org.example.Instruments.Woodwinds.Flute;
import org.example.Instruments.Woodwinds.Oboe;
import org.example.Person.*;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.5
 */

public class Main {
        private static final Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        private static final ArrayList<House> houses = new ArrayList<>();
        private static final ArrayList<Tower> towers = new ArrayList<>();
        private static final ArrayList<Resident> residents = new ArrayList<>();
        private static final ArrayList<Tourist> tourists = new ArrayList<>();
        private static final ArrayList<Tenant> tenants = new ArrayList<>();
        // TODO: Add hotels
        // private static ArrayList<Hotel> hotels = new ArrayList<>();

        public static void main(String[] args) {
//                System.out.println("Hello, welcome to Mele-Mele!");
//                System.out.println("We will create three towers.");
//
//                System.out.println("The first two will have 10 apartments.");
//                System.out.println("Let's create the first one.");
//                Tower tower1 = createTower(10);
//                System.out.print("\033[H\033[2J");
//
//                System.out.println("Let's create the second one.");
//                Tower tower2 = createTower(10);
//                System.out.println("The third tower will have 15 apartments.");
//                System.out.println("\033[H\033[2J");
//
//                System.out.println("Let's create the third one.");
//                Tower tower3 = createTower(15);
//                System.out.println("\033[H\033[2J");
//
//                System.out.println("We'll also create five houses.");
//                System.out.println("Let's create the first one.");
//                House house1 = createHouse();
//                System.out.println("\033[H\033[2J");
//
//                System.out.println("Let's create the second one.");
//                House house2 = createHouse();
//                System.out.println("\033[H\033[2J");
//
//                System.out.println("Let's create the third one.");
//                House house3 = createHouse();
//                System.out.println("\033[H\033[2J");
//
//                System.out.println("Let's create the fourth one.");
//                House house4 = createHouse();
//                System.out.println("\033[H\033[2J");
//
//                System.out.println("Let's create the fifth one.");
//                House house5 = createHouse();
//                System.out.println("\033[H\033[2J");

                System.out.println("Now we'll create a music store.");
                System.out.println("Let's create the music store.");
                Store store = createStore();
                System.out.println("\033[H\033[2J");

                System.out.println("Now we'll add instruments to the store.");
                System.out.println("Let's add instruments to the store.");
                instrumentsMenu(store);
                System.out.println("\033[H\033[2J");

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
        private static Clarinet createClarinet(){
                int sellingPrice = getNumber("What is the selling price of the clarinet?", 0, 100000);
                System.out.println("The clarinet will cost " + sellingPrice + " euros.");

                int purchasePrice = getNumber("What is the purchase price of the clarinet?", 0, 100000);
                System.out.println("The clarinet will cost " + purchasePrice + " euros.");

                return new Clarinet(purchasePrice, sellingPrice);
        }
        private static Flute createFlute(){
                int sellingPrice = getNumber("What is the selling price of the flute?", 0, 100000);
                System.out.println("The flute will cost " + sellingPrice + " euros.");

                int purchasePrice = getNumber("What is the purchase price of the flute?", 0, 100000);
                System.out.println("The flute will cost " + purchasePrice + " euros.");

                return new Flute(purchasePrice, sellingPrice);
        }
        private static Oboe createOboe(){
                int sellingPrice = getNumber("What is the selling price of the oboe?", 0, 100000);
                System.out.println("The oboe will cost " + sellingPrice + " euros.");

                int purchasePrice = getNumber("What is the purchase price of the oboe?", 0, 100000);
                System.out.println("The oboe will cost " + purchasePrice + " euros.");

                return new Oboe(purchasePrice, sellingPrice);
        }
        private static AcousticGuitar createAcousticGuitar(){
                int purchasePrice = getNumber("What is the purchase price of the acoustic guitar?", 0, 100000);
                System.out.println("The acoustic guitar will cost " + purchasePrice + " euros.");

                int sellingPrice = getNumber("What is the selling price of the acoustic guitar?", purchasePrice, 100000);
                System.out.println("The acoustic guitar will cost " + sellingPrice + " euros.");

                String name = getString("What is the name of the guitar?");
                System.out.println("The guitar will be called " + name + ".");

                boolean rightHanded = getStringWithOptions("Is it right handed?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The guitar will " + (rightHanded ? "" : "not ") + "be right handed.");

                int pull = getNumber("What is the pull of the guitar?", 0, 100);
                System.out.println("The guitar will have a pull of " + pull + ".");

                int length = getNumber("What is the length of the guitar?", 0, 100);
                System.out.println("The guitar will have a length of " + length + ".");

                int width = getNumber("What is the width of the guitar?", 0, 100);
                System.out.println("The guitar will have a width of " + width + ".");

                return new AcousticGuitar(name, purchasePrice, sellingPrice, rightHanded, pull, length, width);
        }
        private static ElectricGuitar createElectricGuitar(){
                int purchasePrice = getNumber("What is the purchase price of the electric guitar?", 0, 100000);
                System.out.println("The electric guitar will cost " + purchasePrice + " euros.");

                int sellingPrice = getNumber("What is the selling price of the electric guitar?", purchasePrice, 100000);
                System.out.println("The electric guitar will cost " + sellingPrice + " euros.");

                String name = getString("What is the name of the guitar?");
                System.out.println("The guitar will be called " + name + ".");

                boolean amplifier = getStringWithOptions("Does it have an amplifier?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The guitar will " + (amplifier ? "" : "not ") + "have an amplifier.");

                boolean pedals = getStringWithOptions("Does it have pedals?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The guitar will " + (pedals ? "" : "not ") + "have pedals.");

                int length = getNumber("What is the length of the guitar?", 0, 100);
                System.out.println("The guitar will have a length of " + length + ".");

                int width = getNumber("What is the width of the guitar?", 0, 100);
                System.out.println("The guitar will have a width of " + width + ".");

                return new ElectricGuitar(name, purchasePrice, sellingPrice, amplifier, pedals, length, width);
        }
        private static DigitalPiano createDigitalPiano() {
                int purchasePrice = getNumber("What is the purchase price of the digital piano?", 0, 100000);
                System.out.println("The digital piano will cost " + purchasePrice + " euros.");

                int sellingPrice = getNumber("What is the selling price of the digital piano?", purchasePrice, 100000);
                System.out.println("The digital piano will cost " + sellingPrice + " euros.");

                String name = getString("What is the name of the digital piano?");
                System.out.println("The digital piano will be called " + name + ".");

                SamplingRate samplingRate = SamplingRate.valueOf(getStringWithOptions("What is the sampling rate of the digital piano?", new String[]{"Low", "Medium", "High"}));
                System.out.println("The digital piano will have a sampling rate of " + samplingRate + ".");

                boolean heavy = getStringWithOptions("Is it heavy?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The digital piano will " + (heavy ? "" : "not ") + "be heavy.");

                int length = getNumber("What is the length of the digital piano?", 0, 100);
                System.out.println("The digital piano will have a length of " + length + ".");

                int width = getNumber("What is the width of the digital piano?", 0, 100);
                System.out.println("The digital piano will have a width of " + width + ".");

                int keys = getNumber("What is the number of keys of the digital piano?", 1, 100);
                System.out.println("The digital piano will have " + keys + " keys.");

                return new DigitalPiano(name, purchasePrice, sellingPrice, samplingRate, heavy, length, width, keys);
        }
        private static QueuePiano createQueuePiano() {
                int purchasePrice = getNumber("What is the purchase price of the queue piano?", 0, 100000);
                System.out.println("The queue piano will cost " + purchasePrice + " euros.");

                int sellingPrice = getNumber("What is the selling price of the queue piano?", purchasePrice, 100000);
                System.out.println("The queue piano will cost " + sellingPrice + " euros.");

                String name = getString("What is the name of the queue piano?");
                System.out.println("The queue piano will be called " + name + ".");

                int strings = getNumber("What is the number of strings of the queue piano?", 1, 100);
                System.out.println("The queue piano will have " + strings + " strings.");

                int length = getNumber("What is the length of the queue piano?", 0, 100);
                System.out.println("The queue piano will have a length of " + length + ".");

                int width = getNumber("What is the width of the queue piano?", 0, 100);
                System.out.println("The queue piano will have a width of " + width + ".");

                Size size = Size.valueOf(getStringWithOptions("What is the size of the queue piano?", new String[]{"Small", "Medium", "Large"}));
                System.out.println("The queue piano will have a size of " + size + ".");

                return new QueuePiano(name, purchasePrice, sellingPrice, strings, length, width, size);
        }
        private static StraightPiano createStraightPiano() {
                int purchasePrice = getNumber("What is the purchase price of the straight piano?", 0, 100000);
                System.out.println("The straight piano will cost " + purchasePrice + " euros.");

                int sellingPrice = getNumber("What is the selling price of the straight piano?", purchasePrice, 100000);
                System.out.println("The straight piano will cost " + sellingPrice + " euros.");

                String name = getString("What is the name of the straight piano?");
                System.out.println("The straight piano will be called " + name + ".");

                int strings = getNumber("What is the number of strings of the straight piano?", 1, 100);
                System.out.println("The straight piano will have " + strings + " strings.");

                boolean silenced = getStringWithOptions("Is it silenced?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The straight piano will " + (silenced ? "" : "not ") + "be silenced.");

                boolean crossedStrings = getStringWithOptions("Does it have crossed strings?", new String[]{"yes", "no"}).equals("yes");
                System.out.println("The straight piano will " + (crossedStrings ? "" : "not ") + "have crossed strings.");

                int length = getNumber("What is the length of the straight piano?", 0, 100);
                System.out.println("The straight piano will have a length of " + length + ".");

                int width = getNumber("What is the width of the straight piano?", 0, 100);
                System.out.println("The straight piano will have a width of " + width + ".");

                return new StraightPiano(name, purchasePrice, sellingPrice, silenced, crossedStrings, strings, length, width);
        }
        private static @NotNull Store createStore() {
                String address = getString("What is the address of the store?");
                System.out.println("The address will be " + address + ".");
                int area = getNumber("What is the area of the store?", 0, 10000);
                System.out.println("The area will be " + area + " square meters.");
                return new Store(area, address);
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
        private static void instrumentsMenu(Store store) {
                // Ask the user which type of instrument they want to create
                String instrumentType = getStringWithOptions("What type of instrument would you like to create? It can be 'strings' or 'woodwinds'", new String[]{"strings", "woodwinds"});
                String instrumentName;
                // Depending on the type of instrument ask what exactly they want to create
                if (instrumentType.equals("strings")) {
                        instrumentName = getStringWithOptions("Which instrument would you like to create? It can be 'electric guitar', 'acoustic guitar', digital piano', 'queue piano', 'straight piano'", new String[]{"acoustic guitar", "electric guitar", "digital piano", "queue piano", "straight piano"});
                        // Create the instrument
                        switch (instrumentName) {
                                case "acoustic guitar":
                                        AcousticGuitar acousticGuitar = createAcousticGuitar();
                                        store.addInstrument(acousticGuitar);
                                        break;
                                case "electric guitar":
                                        ElectricGuitar electricGuitar = createElectricGuitar();
                                        store.addInstrument(electricGuitar);
                                        break;
                                case "digital piano":
                                        DigitalPiano digitalPiano = createDigitalPiano();
                                        store.addInstrument(digitalPiano);
                                        break;
                                case "queue piano":
                                        QueuePiano queuePiano = createQueuePiano();
                                        store.addInstrument(queuePiano);
                                        break;
                                case "straight piano":
                                        StraightPiano straightPiano = createStraightPiano();
                                        store.addInstrument(straightPiano);
                                        break;
                        }
                }
                else {
                        instrumentName = getStringWithOptions("Which instrument would you like to create? It can be 'flute', 'oboe', 'clarinet'", new String[]{"flute", "clarinet", "oboe"});
                }
        }
}
