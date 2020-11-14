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
    public String getPictureUrl() {
        return pictureUrl;
    }

    @Override
    public int getBatteryLife() {
        return batteryLife;
    }
}
