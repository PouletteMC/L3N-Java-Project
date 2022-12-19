package org.example;

import org.example.Buildings.Hotel.*;
import org.example.Buildings.House;
import org.example.Buildings.Store;
import org.example.Buildings.Tower;
import org.example.Instruments.Strings.Guitars.AcousticGuitar;
import org.example.Instruments.Strings.Guitars.ElectricGuitar;
import org.example.Instruments.Strings.Pianos.*;
import org.example.Instruments.Woodwinds.Clarinet;
import org.example.Instruments.Woodwinds.Flute;
import org.example.Instruments.Woodwinds.Oboe;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static org.example.Main.*;


public class Handlers {
    private static int stars;

    /**
     * @return The house
     * @see House
     */
    static @NotNull House createHouse() {
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
        buildings.add(house);
        System.out.println("The house has been created.");
        return house;
    }

    /**
     * @param apartments The number of apartments in the tower
     * @return The created tower
     * @see Tower
     */
    static @NotNull Tower createTower(int apartments) {
        String towerName = getString("What is the name of the tower?");
        System.out.println("The first tower will be called " + towerName + ".");

        String towerAddress = getString("What is the address of the tower?");
        System.out.println("The address will be " + towerAddress + ".");

        int towerOffices = getNumber("How many offices does it have?", 0, 100);
        System.out.println("The tower will have " + towerOffices + " offices.");

        Tower tower = new Tower(towerName, apartments, towerOffices, towerAddress);
        towers.add(tower);
        buildings.add(tower);
        System.out.println("Created a new tower called " + tower.getName() + " with " + tower.getOffices() + " offices" + " and " + tower.getApartments() + " apartments over " + tower.getFloors() + " floors and will be located at " + tower.getAddress() + ".");
        return tower;
    }

    /**
     * @return The created store
     * @see Store
     */
    static @NotNull Store createStore() {
        String address = getString("What is the address of the store?");
        System.out.println("The address will be " + address + ".");
        int area = getNumber("What is the area of the store?", 0, 10000);
        System.out.println("The area will be " + area + " square meters.");

        Store store = new Store(area, address);
        buildings.add(store);
        return store;
    }

    /**
     * @param stars The number of stars of the hotel
     * @return The created hotel
     * @see Hotel
     */
    static @NotNull Hotel createHotel(int stars){
        switch (stars){
            case 5:
                return createHotel5();
            case 4:
                return createHotel4();
            default:
                return createNormalHotel(stars);
        }
    }

    /**
     * @return The created 5-star hotel
     * @see Hotel5
     */
    private static @NotNull Hotel5 createHotel5(){
        String name = getString("What is the name of the hotel?");
        System.out.println("The hotel will be called " + name + ".");

        int area = getNumber("What is the area of the hotel?", 0, 50000);
        System.out.println("The area will be " + area + " square meters.");

        String address = getString("What is the address of the hotel?");
        System.out.println("The address will be " + address + ".");

        Room[] rooms = new Room[getNumber("How many rooms does the hotel have?", 0, 50)];
        System.out.println("The hotel will have " + rooms.length + " rooms.");

        int floors = getNumber("How many floors does it have?", 0, 30);
        System.out.println("The hotel will have " + floors + " floors.");

        int pools = getNumber("How many pools does it have?", 0, 10);
        System.out.println("The hotel will have " + pools + " pools.");

        int spas = getNumber("How many spas does it have?", 0, 3);
        System.out.println("The hotel will have " + spas + " spas.");

        int restaurants = getNumber("How many restaurants does it have?", 0, 8);
        System.out.println("The hotel will have " + restaurants + " restaurants.");

        int suites = getNumber("How many suites does it have?", 0, 10);
        System.out.println("The hotel will have " + suites + " suites.");

        Hotel5 hotel = new Hotel5(name, area, address, rooms, floors, pools, spas, restaurants, suites);
        hotels.add(hotel);
        buildings.add(hotel);
        return hotel;
    }

    /**
     * @return The created 4-star hotel
     * @see Hotel4
     */
    private static @NotNull Hotel4 createHotel4(){
        String name = getString("What is the name of the hotel?");
        System.out.println("The hotel will be called " + name + ".");

        int area = getNumber("What is the area of the hotel?", 0, 50000);
        System.out.println("The area will be " + area + " square meters.");

        String address = getString("What is the address of the hotel?");
        System.out.println("The address will be " + address + ".");

        Room[] rooms = new Room[getNumber("How many rooms does the hotel have?", 0, 40)];
        System.out.println("The hotel will have " + rooms.length + " rooms.");

        int floors = getNumber("How many floors does it have?", 0, 20);
        System.out.println("The hotel will have " + floors + " floors.");

        int spas = getNumber("How many spas does it have?", 0, 10);
        System.out.println("The hotel will have " + spas + " spas.");

        int restaurants = getNumber("How many restaurants does it have?", 0, 4);
        System.out.println("The hotel will have " + restaurants + " restaurants.");

        Hotel4 hotel = new Hotel4(name, area, address, rooms, floors, spas, restaurants);
        hotels.add(hotel);
        buildings.add(hotel);
        return hotel;
    }

    /**
     * @param stars The number of stars of the hotel
     * @return The created hotel
     */
    private static @NotNull NormalHotel createNormalHotel(int stars){
        Handlers.stars = stars;
        String name = getString("What is the name of the hotel?");
        System.out.println("The hotel will be called " + name + ".");

        int area = getNumber("What is the area of the hotel?", 0, 50000);
        System.out.println("The area will be " + area + " square meters.");

        String address = getString("What is the address of the hotel?");
        System.out.println("The address will be " + address + ".");

        Room[] rooms = new Room[getNumber("How many rooms does the hotel have?", 0, stars * 10)];
        System.out.println("The hotel will have " + rooms.length + " rooms.");

        int floors = getNumber("How many floors does it have?", 0, 10);
        System.out.println("The hotel will have " + floors + " floors.");

        int restaurants = getNumber("How many restaurants does it have?", 0, 2);
        System.out.println("The hotel will have " + restaurants + " restaurants.");

        NormalHotel hotel = new NormalHotel(name, area, address, rooms, stars, floors, restaurants);
        hotels.add(hotel);
        buildings.add(hotel);
        return hotel;
    }
    @Contract(" -> new")
    static @NotNull Clarinet createClarinet(){
        int sellingPrice = getNumber("What is the selling price of the clarinet?", 0, 100000);
        System.out.println("The clarinet will cost " + sellingPrice + " euros.");

        int purchasePrice = getNumber("What is the purchase price of the clarinet?", 0, 100000);
        System.out.println("The clarinet will cost " + purchasePrice + " euros.");

        Clarinet clarinet = new Clarinet(purchasePrice, sellingPrice);
        instruments.add(clarinet);
        return clarinet;
    }
    @Contract(" -> new")
    static @NotNull Flute createFlute(){
        int sellingPrice = getNumber("What is the selling price of the flute?", 0, 100000);
        System.out.println("The flute will cost " + sellingPrice + " euros.");

        int purchasePrice = getNumber("What is the purchase price of the flute?", 0, 100000);
        System.out.println("The flute will cost " + purchasePrice + " euros.");

        Flute flute = new Flute(purchasePrice, sellingPrice);
        instruments.add(flute);
        return flute;
    }
    @Contract(" -> new")
    static @NotNull Oboe createOboe(){
        int sellingPrice = getNumber("What is the selling price of the oboe?", 0, 100000);
        System.out.println("The oboe will cost " + sellingPrice + " euros.");

        int purchasePrice = getNumber("What is the purchase price of the oboe?", 0, 100000);
        System.out.println("The oboe will cost " + purchasePrice + " euros.");

        Oboe oboe = new Oboe(purchasePrice, sellingPrice);
        instruments.add(oboe);
        return oboe;
    }
    @Contract(" -> new")
    static @NotNull AcousticGuitar createAcousticGuitar(){
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

        AcousticGuitar acousticGuitar = new AcousticGuitar(name, purchasePrice, sellingPrice, rightHanded, pull, length, width);
        instruments.add(acousticGuitar);
        return acousticGuitar;
    }
    @Contract(" -> new")
    static @NotNull ElectricGuitar createElectricGuitar(){
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

        ElectricGuitar electricGuitar = new ElectricGuitar(name, purchasePrice, sellingPrice, amplifier, pedals, length, width);
        instruments.add(electricGuitar);
        return electricGuitar;
    }
    @Contract(" -> new")
    static @NotNull DigitalPiano createDigitalPiano() {
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

        DigitalPiano digitalPiano = new DigitalPiano(name, purchasePrice, sellingPrice, samplingRate, heavy, length, width, keys);
        instruments.add(digitalPiano);
        return digitalPiano;
    }
    @Contract(" -> new")
    static @NotNull QueuePiano createQueuePiano() {
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

        QueuePiano queuePiano = new QueuePiano(name, purchasePrice, sellingPrice, strings, length, width, size);
        instruments.add(queuePiano);
        return queuePiano;
    }
    @Contract(" -> new")
    static @NotNull StraightPiano createStraightPiano() {
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

        StraightPiano straightPiano = new StraightPiano(name, purchasePrice, sellingPrice, silenced, crossedStrings, strings, length, width);
        instruments.add(straightPiano);
        return straightPiano;
    }
}
