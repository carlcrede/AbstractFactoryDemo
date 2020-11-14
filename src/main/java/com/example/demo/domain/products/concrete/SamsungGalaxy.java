package com.example.demo.domain.products.concrete;

import com.example.demo.domain.products.interfaces.ISmartPhone;

public class SamsungGalaxy implements ISmartPhone {
    private String pictureUrl;
    private int weight;

    public SamsungGalaxy() {
        pictureUrl = "https://static.mbilling.dk/images/webshop/product_images/10226f664f60b97264236c740cff384fba4395c8_1581411750.png";
        weight = 222;
    }

    @Override
    public String getPictureUrl() {
        return pictureUrl;
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
