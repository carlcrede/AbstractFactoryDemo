package com.example.demo;

import com.example.demo.domain.factories.AppleFactory;
import com.example.demo.domain.factories.IPEDFactory;
import com.example.demo.domain.products.interfaces.ILaptop;
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
        boolean hasKeyboard = laptop.getHasKeyboard();
        assertTrue(hasKeyboard);
    }

}
