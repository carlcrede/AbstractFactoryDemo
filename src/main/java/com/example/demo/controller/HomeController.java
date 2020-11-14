package com.example.demo.controller;

import com.example.demo.domain.factories.AppleFactory;
import com.example.demo.domain.factories.IPEDFactory;
import com.example.demo.domain.factories.SamsungFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping({"/", " "})
    public String index(){
        return "index";
    }
}
