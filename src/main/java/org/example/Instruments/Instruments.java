package org.example.Instruments;

/**
 * This is the parent class of all instruments
 * @author Eliot, Adam, Laura, Sebastian, Thomas
 * @version 1.0
 */

public abstract class Instruments {
    private String name;
    private int purchasePrice;
    private int sellingPrice;

    /**
     * Constructor of the Instruments class
     * @param name Name of the instrument
     * @param purchasePrice Purchase price of the instrument
     * @param sellingPrice Selling price of the instrument
     */
    public Instruments(String name, int purchasePrice, int sellingPrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
    }

    public String getName() {
        return name;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public int getProfit() {
        return sellingPrice - purchasePrice;
    }

    public Instruments setName(String name) {
        this.name = name;
        return this; // Allow method chaining
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    /**
     * @return the name of the instrument
     * Signature - Forces its children to implement this method
     */
    public abstract String toString(); // Forces subclasses to implement this method
}
