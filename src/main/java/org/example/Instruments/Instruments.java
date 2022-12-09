package org.example.Instruments;

import org.example.GlobalMethods;

/**
 * This is the parent class of all instruments
 * @Param: name
 * @Param: purchasePrice
 * @Param: sellingPrice
 * @Method: toString() - returns a string representation of the instrument
 * @Method: getPurchasePrice() - returns the purchase price of the instrument
 * @Method: getSellingPrice() - returns the selling price of the instrument
 * @Method: getProfit() - returns the profit of the instrument
 */

public abstract class Instruments implements GlobalMethods {
    private String name;
    private int purchasePrice;
    private int sellingPrice;

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

    public abstract String toString(); // Forces subclasses to implement this method
}
