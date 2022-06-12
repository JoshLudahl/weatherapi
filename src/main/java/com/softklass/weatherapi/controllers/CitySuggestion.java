package com.softklass.weatherapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CitySuggestion {

    /**
     * First we'll support America by searching for city or zip code, then expand to other locations
     * @return ArrayList of locations that match the city or zip code
     */
    @GetMapping("/cities")
    public List<String> getCitySuggestions(@RequestParam(value = "keyword") String keyword) {
        List<String> list = new ArrayList<>();
        list.add("Portland");
        list.add("Tigard");
        return list;
    }
}
