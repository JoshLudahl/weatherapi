package com.softklass.weatherapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softklass.weatherapi.model.weatherrequest.CurrentWeather;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record WeatherResponse(
        CurrentWeather main,
        List<CurrentWeatherDetails> weather
) {
}
