package org.example.Instrument;

public abstract class Instrument {
    private String name;
    private int purchasePrice;
    private int sellingPrice;

    private static int totalProfit = 0; // Extra

    public Instrument(String name, int purchasePrice, int sellingPrice) {
        this.name = name;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        totalProfit += sellingPrice - purchasePrice; // Extra
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    // Extra
    public int calculateMarkup() {
        return this.sellingPrice - this.purchasePrice;
    }


}
