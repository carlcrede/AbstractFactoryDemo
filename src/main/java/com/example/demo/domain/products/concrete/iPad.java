package com.example.demo.domain.products.concrete;

import com.example.demo.domain.products.interfaces.ITablet;

public class iPad implements ITablet {
    private String pictureUrl;
    private int batteryLife;

    public iPad() {
        pictureUrl = "https://store.storeimages.cdn-apple.com/4668/as-images.apple.com/is/ipad-pro-12-select-wifi-spacegray-202003_FMT_WHH?wid=940&hei=1112&fmt=png-alpha&qlt=80&.v=1583553704156";
        batteryLife = 10;
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
