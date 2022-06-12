package com.softklass.weatherapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherAPI {

    @GetMapping("/")
    public String getWeather() {
        return "...";
    }
}
