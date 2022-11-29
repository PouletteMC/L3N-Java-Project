package org.example.Instruments;

import org.example.GlobalMethods;

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

    public Instruments setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
        return this; // Allow method chaining
    }

    public Instruments setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this; // Allow method chaining
    }

    public abstract String toString(); // Forces subclasses to implement this method
}
