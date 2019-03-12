package com.cursan.homeshop;

public class Fridge extends Product{
    private int liter;
    private boolean isFreezer;

    public Fridge(String name, String description, double price, int liter, boolean isFreezer) {
        super(name, description, price);
        this.liter = liter;
        this.isFreezer = isFreezer;
    }


    public int getLiter() {
        return liter;
    }

    public boolean isFreezer() {
        return isFreezer;
    }


}
