package com.example.demo.domain.factories;

import com.example.demo.domain.products.concrete.SamsungGalaxy;
import com.example.demo.domain.products.concrete.SamsungGalaxyBook;
import com.example.demo.domain.products.concrete.SamsungGalaxyTab;
import com.example.demo.domain.products.interfaces.ILaptop;
import com.example.demo.domain.products.interfaces.ISmartPhone;
import com.example.demo.domain.products.interfaces.ITablet;

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
