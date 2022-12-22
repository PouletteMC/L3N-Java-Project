package org.example;

import org.example.Buildings.*;
import org.example.Buildings.Hotel.*;
import org.example.Instruments.Strings.Guitars.*;
import org.example.Instruments.Strings.Pianos.*;
import org.example.Instruments.Woodwinds.*;

import static org.example.Handlers.*;
import static org.example.Getters.*;

/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.5
 * Handles the different menus
 */
public class Menus {
    protected static void mainMenu() {
        System.out.print("\033[H\033[2J");
        System.out.println("What would you like to do?");
        int action = getNumber("1. Create a building\n2. Add an instrument to the store\n3. List buildings\n4. List instruments\n5. Exit", 1, 5);

        switch(action){
            case 1:
                buildingsCreationMenu();
                break;
            case 2:
                instrumentsCreationMenu();
                break;
            case 3:
                buildingsListMenu();
                break;
            case 4:
                instrumentsListMenu();
                break;
            case 5:
                System.exit(0);
                break;
        }
    }

    /**
     * Menu for creating instruments
     */
    protected static void instrumentsCreationMenu() {
        // Ask the user which type of instrument they want to create
        System.out.print("\033[H\033[2J");
        String instrumentName;
        String instrumentType = getStringWithOptions("What type of instrument would you like to create?", new String[]{"strings", "woodwinds", "cancel"});
        // Depending on the type of instrument ask what exactly they want to create
        if (instrumentType.equals("strings")) {
            instrumentName = getStringWithOptions("Which instrument would you like to create?", new String[]{"acoustic guitar", "electric guitar", "digital piano", "queue piano", "straight piano"});
            // Create the instrument
            switch (instrumentName) {
                case "acoustic guitar":
                    AcousticGuitar acousticGuitar = createAcousticGuitar();
                    Main.store.addInstrument(acousticGuitar);
                    break;
                case "electric guitar":
                    ElectricGuitar electricGuitar = createElectricGuitar();
                    Main.store.addInstrument(electricGuitar);
                    break;
                case "digital piano":
                    DigitalPiano digitalPiano = createDigitalPiano();
                    Main.store.addInstrument(digitalPiano);
                    break;
                case "queue piano":
                    QueuePiano queuePiano = createQueuePiano();
                    Main.store.addInstrument(queuePiano);
                    break;
                case "straight piano":
                    StraightPiano straightPiano = createStraightPiano();
                    Main.store.addInstrument(straightPiano);
                    break;
            }
            mainMenu();
        }
        else if(instrumentType.equals("woodwinds")) {
            instrumentName = getStringWithOptions("Which instrument would you like to create?", new String[]{"flute", "clarinet", "oboe", "cancel"});
            switch (instrumentName) {
                case "flute":
                    Flute flute = createFlute();
                    Main.store.addInstrument(flute);
                    break;
                case "oboe":
                    Oboe oboe = createOboe();
                    Main.store.addInstrument(oboe);
                    break;
                case "clarinet":
                    Clarinet clarinet = createClarinet();
                    Main.store.addInstrument(clarinet);
                    break;
                case "cancel":
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid instrument name");
                    instrumentsCreationMenu();
                    break;
            }
            mainMenu();
        }
        else if(instrumentType.equals("cancel")) {
            mainMenu();
        }
        else {
            System.out.println("Invalid instrument type");
            instrumentsCreationMenu();
        }
        mainMenu();
    }

    /**
     * Menu for creating buildings
     */
    protected static void buildingsCreationMenu(){
        System.out.println("\033[H\033[2J");
        String buildingName = getStringWithOptions("What type of building would you like to create?", new String[]{"tower", "house", "hotel", "cancel"});
        switch (buildingName) {
            case "tower":
                Tower tower = createTower();
                break;
            case "house":
                House house = createHouse();
                break;
            case "hotel":
                Hotel hotel = createHotel();
                break;
            case "cancel":
                mainMenu();
                break;
            default:
                System.out.println("Invalid input");
                buildingsCreationMenu();
                break;
        }
        mainMenu();
    }

    /**
     * Menu for listing buildings
     */
    private static void buildingsListMenu(){
        System.out.println("\033[H\033[2J");
        String buildingName = getStringWithOptions("What type of building would you like to list?", new String[]{"towers", "houses", "hotels", "stores", "all", "cancel"});
        switch (buildingName) {
            case "towers":
                if(Main.getTowers().size() == 0){
                    System.out.println("There are no towers");
                }
                else {
                    System.out.println("Found " + Main.getTowers().size() + " towers");
                    for (Tower tower : Main.getTowers()) {
                        System.out.println(tower);
                    }
                }
                break;
            case "houses":
                if(Main.getHouses().size() == 0) {
                    System.out.println("There are no houses");
                }
                else {
                    System.out.println("Found " + Main.getHouses().size() + " houses");
                    System.out.println(Main.getHouses());
                }
                break;
            case "hotels":
                if(Main.getHotels().size() == 0) {
                    System.out.println("There are no hotels");
                }
                else {
                    System.out.println("Found " + Main.getHotels().size() + " hotels");
                    System.out.println(Main.getHotels());
                }
                break;
            case "stores":
                if(Main.getStores().size() == 0) {
                    System.out.println("There are no stores");
                }
                else {
                    System.out.println("Found " + Main.getStores().size() + " stores");
                    System.out.println(Main.getStores());
                }
                break;
            case "all":
                if(Main.getBuildings().size() == 0) {
                    System.out.println("There are no buildings");
                }
                else {
                    System.out.println("Found " + Main.getBuildings().size() + " buildings");
                    System.out.println(Main.getBuildings());
                }
                break;
            case "cancel":
                mainMenu();
                break;
            default:
                System.out.println("Invalid input");
                buildingsListMenu();
                break;
        }
        mainMenu();
    }

    /**
     * Listing all instruments
     */
    private static void instrumentsListMenu(){
        System.out.println("\033[H\033[2J");
        System.out.println(Main.getInstruments());
    }
}
