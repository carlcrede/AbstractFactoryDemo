package com.example.demo;

import com.example.demo.factories.AppleFactory;
import com.example.demo.factories.IPEDFactory;
import com.example.demo.products.interfaces.ILaptop;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void concreteProductIsMacBook() {
        IPEDFactory factory = new AppleFactory();
        ILaptop laptop = factory.createLaptop();
        boolean hasKeyboard = laptop.hasKeyboard();
        assertTrue(hasKeyboard);
    }

}
