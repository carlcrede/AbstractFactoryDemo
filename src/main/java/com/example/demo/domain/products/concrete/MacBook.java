package com.example.demo.domain.products.concrete;

import com.example.demo.domain.products.interfaces.ILaptop;

public class MacBook implements ILaptop {
    private String pictureUrl;
    private boolean hasKeyboard;

    public MacBook() {
        pictureUrl = "https://www.humac.dk/sites/default/files/product-images/2019-11/MBP13RD-TB-PT-Open105-SpGry_WW-EN.tif-PRINT_0.png";
        hasKeyboard = true;
    }

    @Override
    public String getPictureUrl() {
        return pictureUrl;
    }

    @Override
    public boolean getHasKeyboard() {
        return hasKeyboard;
    }
}
