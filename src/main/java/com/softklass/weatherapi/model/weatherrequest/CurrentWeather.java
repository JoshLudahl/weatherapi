package com.softklass.weatherapi.model.weatherrequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record CurrentWeather(
        Double temp,
        Double feels_like,
        int pressure,
        int humidity
) {
}
