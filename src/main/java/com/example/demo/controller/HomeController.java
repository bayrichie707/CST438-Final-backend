package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to the Crypto Application!</h1>" +
               "<p>Click <a href='/crypto/coins'>here</a> to view cryptocurrency data.</p>";
    }
}
