package com.example.cicdtest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${dessert}")
    private String dessert;

    @GetMapping
    public String getHello() {
        return "hello";
    }

    @GetMapping("/dessert")
    public String getDessert() {
        return dessert;
    }
}
