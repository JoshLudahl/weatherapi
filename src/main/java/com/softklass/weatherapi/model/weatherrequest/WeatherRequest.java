package com.softklass.weatherapi.model.weatherrequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.softklass.weatherapi.model.LatLongLocation;

public record WeatherRequest(
        LatLongLocation location,
        String units
) {}
