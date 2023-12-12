package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/crypto")
@CrossOrigin(origins = "http://localhost:3000") 
public class CryptoController {

    @GetMapping("/coins")
    public String listCryptocurrencies() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd&order=market_cap_desc&per_page=100";
            return restTemplate.getForObject(url, String.class);
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}
