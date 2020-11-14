package com.example.demo.domain.products.concrete;

import com.example.demo.domain.products.interfaces.ILaptop;

public class SamsungGalaxyBook implements ILaptop {
    private String pictureUrl;
    private boolean hasKeyboard;

    public SamsungGalaxyBook() {
        pictureUrl = "https://images.samsung.com/is/image/samsung/uk-galaxy-book-s-intel-np767-np767xcm-k02uk-frontgold-249540335?$720_576_PNG$";
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
