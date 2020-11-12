package com.example.demo.domain.factories;

import com.example.demo.domain.products.concrete.MacBook;
import com.example.demo.domain.products.concrete.iPad;
import com.example.demo.domain.products.concrete.iPhone;
import com.example.demo.domain.products.interfaces.ILaptop;
import com.example.demo.domain.products.interfaces.ISmartPhone;
import com.example.demo.domain.products.interfaces.ITablet;

public class AppleFactory implements IPEDFactory {
    @Override
    public ILaptop createLaptop() {
        return new MacBook();
    }

    @Override
    public ISmartPhone createSmartPhone() {
        return new iPhone();
    }

    @Override
    public ITablet createTablet() {
        return new iPad();
    }
}
