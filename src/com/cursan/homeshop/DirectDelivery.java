package com.cursan.homeshop;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getInfo() {
        return "livraison à domicile à 4.99€";
    }
}
