package com.softklass.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record City(
        String name,
        Double latitude,
        Double longitude,
        String country,
        Long population,
        boolean is_capital
) {
}
