package com.example.demo.products.concrete;

import com.example.demo.products.interfaces.ILaptop;

public class MacBook implements ILaptop {
    private String pictureUrl;
    private boolean hasKeyboard;

    public MacBook() {
        pictureUrl = "https://www.humac.dk/sites/default/files/product-images/2019-11/MBP13RD-TB-PT-Open105-SpGry_WW-EN.tif-PRINT_0.png";
        hasKeyboard = true;
    }

    @Override
    public String pictureUrl() {
        return pictureUrl;
    }

    @Override
    public boolean hasKeyboard() {
        return hasKeyboard;
    }
}
