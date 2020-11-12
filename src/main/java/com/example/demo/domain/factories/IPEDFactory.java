package com.example.demo.domain.factories;

import com.example.demo.domain.products.interfaces.ILaptop;
import com.example.demo.domain.products.interfaces.ISmartPhone;
import com.example.demo.domain.products.interfaces.ITablet;

public interface IPEDFactory {
    ILaptop createLaptop();
    ISmartPhone createSmartPhone();
    ITablet createTablet();
}
