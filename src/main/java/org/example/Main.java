package org.example;

import org.example.Buildings.Buildings;
import org.example.Buildings.Hotel.Hotel;
import org.example.Buildings.*;
import org.example.Instruments.Instruments;
import org.example.Person.*;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.Getters.getNumber;
import static org.example.Handlers.*;
import static org.example.Menus.mainMenu;


/**
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.5
 * Main class for the program. Runs the CLI tool that interacts with the user.
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
        protected static final ArrayList<Store> stores = new ArrayList<>();
        protected static ArrayList<Hotel> hotels = new ArrayList<>();
        protected static Store store;


        /**
         * Main method
         * Walks the user through the required initial setup then runs the main menu
         */
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
                store = createStore();
                System.out.println("\033[H\033[2J");

                mainMenu();

        }
        public static ArrayList<Tower> getTowers() {
                return towers;
        }
        public static ArrayList<House> getHouses() {
                return houses;
        }
        public static ArrayList<Hotel> getHotels() {
                return hotels;
        }
        public static ArrayList<Instruments> getInstruments() {
                return instruments;
        }
        public static ArrayList<Buildings> getBuildings() {
                return buildings;
        }
        public static ArrayList<Resident> getResidents() {
                return residents;
        }
        public static ArrayList<Tourist> getTourists() {
                return tourists;
        }
        public static ArrayList<Tenant> getTenants() {
                return tenants;
        }
        public static ArrayList<Store> getStores() {
                return stores;
        }

}
