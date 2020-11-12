package com.example.demo.domain.products.concrete;

import com.example.demo.domain.products.interfaces.ITablet;

public class SamsungGalaxyTab implements ITablet {
    private String pictureUrl;
    private int batteryLife;

    public SamsungGalaxyTab() {
        pictureUrl = "https://dustinweb.azureedge.net/image/476469/400/320/samsung-galaxy-tab-s6-105-128gb-bla.png";
        batteryLife = 9;
    }

    @Override
    public String pictureUrl() {
        return pictureUrl;
    }

    @Override
    public int batteryLife() {
        return batteryLife;
    }
}
