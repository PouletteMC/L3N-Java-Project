package org.example;

import org.example.Buildings.*;
import org.example.Buildings.Hotel.Hotel;
import org.example.Instruments.Instruments;
import org.example.Instruments.Strings.Guitars.*;
import org.example.Instruments.Strings.Pianos.*;
import org.example.Instruments.Woodwinds.*;
import org.example.Person.*;
import static org.example.Handlers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Eliot, Adam, Laura, Sebastian
 * @version 1.5
 */

public class Main {
        protected static final Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        protected static final ArrayList<Buildings> buildings = new ArrayList<>();
        protected static final ArrayList<House> houses = new ArrayList<>();
        protected static final ArrayList<Tower> towers = new ArrayList<>();
        protected static final ArrayList<Resident> residents = new ArrayList<>();
        protected static final ArrayList<Tourist> tourists = new ArrayList<>();
        protected static final ArrayList<Tenant> tenants = new ArrayList<>();
        protected static final ArrayList<Instruments> instruments = new ArrayList<>();
        protected static ArrayList<Hotel> hotels = new ArrayList<>();

        public static void main(String[] args) {
                System.out.println("Hello, welcome to Mele-Mele!");
                System.out.println("We will create three towers.");

                System.out.println("The first two will have 10 apartments.");
                System.out.println("Let's create the first one.");
                createTower(10);
                System.out.print("\033[H\033[2J"); // Clear console - https://stackoverflow.com/a/2979383

                System.out.println("Let's create the second one.");
                createTower(10);
                System.out.println("The third tower will have 15 apartments.");
                System.out.println("\033[H\033[2J");

                System.out.println("Let's create the third one.");
                createTower(15);
                System.out.println("\033[H\033[2J");

                System.out.println("We'll also create five houses.");
                System.out.println("Let's create the first one.");
                createHouse();
                System.out.println("\033[H\033[2J");

                System.out.println("Let's create the second one.");
                createHouse();
                System.out.println("\033[H\033[2J");

                System.out.println("Let's create the third one.");
                createHouse();
                System.out.println("\033[H\033[2J");

                System.out.println("Let's create the fourth one.");
                createHouse();
                System.out.println("\033[H\033[2J");

                System.out.println("Let's create the fifth one.");
                createHouse();
                System.out.println("\033[H\033[2J");

                System.out.println("We'll create a few hotels.");
                System.out.println("Let's start with a 5 star hotel.");
                createHotel(5);
                System.out.println("\033[H\033[2J");

                System.out.println("Let's create a 4 star hotel.");
                createHotel(4);
                System.out.println("\033[H\033[2J");

                System.out.println("Now we can create another two hotels");
                createHotel(getNumber("How many stars do you want the first hotel to have?", 1,3));
                System.out.println("\033[H\033[2J");

                createHotel(getNumber("How many stars do you want the second hotel to have?", 1,3));
                System.out.println("\033[H\033[2J");

                System.out.println("Now we'll create a music store.");
                System.out.println("Let's create the music store.");
                Store store = createStore();
                System.out.println("\033[H\033[2J");

                System.out.println("Now we'll add instruments to the store.");
                System.out.println("Let's add instruments to the store.");
                instrumentsMenu(store);
                System.out.println("\033[H\033[2J");

        }
        /**
         * @param message The message to display
         * @param min The minimum value
         * @param max The maximum value
         * @return The number entered by the user
         */
        static int getNumber(String message, int min, int max) {
                int number;
                message = message + " (" + min + "-" + max + ")";
                do {
                        System.out.println(message);
                        while (!Main.scanner.hasNextInt()) {
                                System.out.println("That's not a number!");
                                System.out.println("\033[H\033[2J");
                                System.out.println(message);
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
        static String getString(String message) {
                String string;
                do {
                        System.out.println(message);
                        while (!Main.scanner.hasNext()) {
                                System.out.println("This value must be a string.");
                                System.out.println("\033[H\033[2J");
                                System.out.println(message);
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
        static String getStringWithOptions(String message, String[] options) {
                String string;
                message = message + " (" + String.join(", ", options) + ")";
                do {
                        System.out.println(message);
                        while (!Main.scanner.hasNext()) {
                                System.out.println("This value must be a string.");
                                System.out.println("\033[H\033[2J");
                                System.out.println(message);
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
                System.out.print("\033[H\033[2J");
                String instrumentName;
                String instrumentType = getStringWithOptions("What type of instrument would you like to create?", new String[]{"strings", "woodwinds"});
                // Depending on the type of instrument ask what exactly they want to create
                if (instrumentType.equals("strings")) {
                        instrumentName = getStringWithOptions("Which instrument would you like to create?", new String[]{"acoustic guitar", "electric guitar", "digital piano", "queue piano", "straight piano"});
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
                        instrumentName = getStringWithOptions("Which instrument would you like to create?", new String[]{"flute", "clarinet", "oboe"});
                        switch (instrumentName) {
                                case "flute":
                                        Flute flute = createFlute();
                                        store.addInstrument(flute);
                                        break;
                                case "oboe":
                                        Oboe oboe = createOboe();
                                        store.addInstrument(oboe);
                                        break;
                                case "clarinet":
                                        Clarinet clarinet = createClarinet();
                                        store.addInstrument(clarinet);
                                        break;
                        }
                }
                instrumentsMenu(store);
        }
}
