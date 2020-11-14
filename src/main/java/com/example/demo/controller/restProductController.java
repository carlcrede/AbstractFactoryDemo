package com.example.demo.controller;

import com.example.demo.domain.factories.AppleFactory;
import com.example.demo.domain.factories.IPEDFactory;
import com.example.demo.domain.factories.SamsungFactory;
import com.example.demo.domain.products.interfaces.ILaptop;
import com.example.demo.domain.products.interfaces.ISmartPhone;
import com.example.demo.domain.products.interfaces.ITablet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restProductController {
    private IPEDFactory factory;

    @GetMapping("/choice")
    public String chooseAppleOrSamsung(@RequestParam() String choice) {
        System.out.println(choice);
        switch (choice) {
            case "apple": factory = new AppleFactory();
            case "samsung": factory = new SamsungFactory();
        }
        return choice;
    }

    @GetMapping("/laptop")
    public ILaptop getLaptop(){
        ILaptop lap = factory.createLaptop();
        System.out.println(lap);
        return lap;
    }
    @GetMapping("/tablet")
    public ITablet getTablet(){
        return factory.createTablet();
    }
    @GetMapping("/smartPhone")
    public ISmartPhone getSmartPhone(){
        return factory.createSmartPhone();
    }
}
