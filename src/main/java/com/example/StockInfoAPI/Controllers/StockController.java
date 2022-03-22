package com.example.StockInfoAPI.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/stocksapi")
public class StockController {

    @Autowired
    Environment env;

    @GetMapping("/overview")
    public Object overview(
            RestTemplate restTemplate,
            @RequestParam ("symbol") String symbol
            ) {

        String URL = "https://www.alphavantage.co/query?function=OVERVIEW";
        String apiKey = env.getProperty("api_key");
        String overviewUrl  = URL + "&symbol=" + symbol + "&apikey=" + apiKey;

        return restTemplate.getForObject(overviewUrl, Object.class);
        }

}
