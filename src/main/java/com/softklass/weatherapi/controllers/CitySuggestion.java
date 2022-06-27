package com.softklass.weatherapi.controllers;

import com.softklass.weatherapi.model.City;
import com.softklass.weatherapi.network.CitySuggestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CitySuggestion {
    CitySuggestionService css = new CitySuggestionService();
    /**
     * First we'll support America by searching for city or zip code, then expand to other locations
     * @return ArrayList of locations that match the city or zip code
     */
    @GetMapping("/cities")
    public Mono<City[]> getCitySuggestions(@RequestParam(value = "keyword") String keyword) {
        return css.getCitySuggestionFromStringInput(keyword);
    }
}
