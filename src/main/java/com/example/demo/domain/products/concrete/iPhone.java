package com.example.demo.domain.products.concrete;

import com.example.demo.domain.products.interfaces.ISmartPhone;

public class iPhone implements ISmartPhone {
    private String pictureUrl;
    private int weight;

    public iPhone() {
        pictureUrl = "https://static.mbilling.dk/images/webshop/product_images/Apple_iPhone12_Sort_1602765241.png";
        weight = 164;
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
