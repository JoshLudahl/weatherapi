package com.softklass.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrentWeatherDetails(
        int id,
        String main,
        String description,
        String icon
) {
}
