package com.softklass.weatherapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CitySuggestion {

    @GetMapping("/cities")
    public List<String> getCitySuggestions(@RequestParam(value = "keyword") String keyword) {
        List<String> list = new ArrayList<>();
        list.add("Portland");
        list.add("Tigard");
        return list;
    }
}
