package com.example.demo.controller;

import com.example.demo.domain.factories.AppleFactory;
import com.example.demo.domain.factories.IPEDFactory;
import com.example.demo.domain.factories.SamsungFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private IPEDFactory factory;

    @PostMapping("/choice")
    public String chooseAppleOrSamsung(@RequestParam() String choice) {
        switch (choice) {
            case "apple": factory = new AppleFactory();
            case "samsung": factory = new SamsungFactory();
        }
        return "/products";
    }
}
