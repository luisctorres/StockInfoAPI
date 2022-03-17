package com.example.StockInfoAPI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/stocksapi")
public class StockController {




    @GetMapping("/overview")
    private String overview(
            RestTemplate restTemplate,
            @RequestParam ("Symbol") String symbol
            ) {

        //String stockApiKey = env.getProperty("API_KEY",);
        String URL = "https://www.alphavantage.co/query?function=OVERVIEW";


        }

}
