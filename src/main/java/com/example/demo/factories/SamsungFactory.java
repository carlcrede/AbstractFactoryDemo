package com.example.demo.factories;

import com.example.demo.products.concrete.SamsungGalaxy;
import com.example.demo.products.concrete.SamsungGalaxyBook;
import com.example.demo.products.concrete.SamsungGalaxyTab;
import com.example.demo.products.interfaces.ILaptop;
import com.example.demo.products.interfaces.ISmartPhone;
import com.example.demo.products.interfaces.ITablet;

public class SamsungFactory implements IPEDFactory{
    @Override
    public ILaptop createLaptop() {
        return new SamsungGalaxyBook();
    }

    @Override
    public ISmartPhone createSmartPhone() {
        return new SamsungGalaxy();
    }

    @Override
    public ITablet createTablet() {
        return new SamsungGalaxyTab();
    }
}
