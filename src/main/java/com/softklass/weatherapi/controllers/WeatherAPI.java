package com.softklass.weatherapi.controllers;

import com.softklass.weatherapi.model.LatLongLocation;
import com.softklass.weatherapi.model.WeatherResponse;
import com.softklass.weatherapi.model.weatherrequest.WeatherRequest;
import com.softklass.weatherapi.network.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.net.URISyntaxException;

@RestController
public class WeatherAPI {

    @GetMapping("/")
    public Mono<WeatherResponse> getWeather() throws URISyntaxException {
        WeatherRequest request = new WeatherRequest(
                new LatLongLocation(45.5152, -122.6784),
                "imperial"
        );
        WeatherService ws = new WeatherService();
        return ws.getWeatherOneCall(request);
    }
}
