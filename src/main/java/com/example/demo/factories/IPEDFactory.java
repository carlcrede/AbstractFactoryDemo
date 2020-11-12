package com.example.demo.factories;

import com.example.demo.products.interfaces.ILaptop;
import com.example.demo.products.interfaces.ISmartPhone;
import com.example.demo.products.interfaces.ITablet;

public interface IPEDFactory {
    ILaptop createLaptop();
    ISmartPhone createSmartPhone();
    ITablet createTablet();
}
