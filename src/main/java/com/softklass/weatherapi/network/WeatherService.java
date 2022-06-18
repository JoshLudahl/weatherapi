package com.softklass.weatherapi.network;

import com.softklass.weatherapi.model.weatherrequest.WeatherRequest;
import com.softklass.weatherapi.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class WeatherService {

    private static final Logger LOGGER = Logger.getLogger( WeatherService.class.getName() );
    private static final String WEATHER_BASE_URL = "https://api.openweathermap.org/data/2.5/weather?";

    private String API_KEY;

    WebClient webClient = WebClient.create();

    @Autowired
    public WeatherService() { }

    public Mono<WeatherResponse> getWeatherOneCall(WeatherRequest request) throws URISyntaxException {
        LOGGER.log(Level.INFO, API_KEY);
        return webClient
                .get()
                .uri(getUrlFromRequest(request))
                .retrieve()
                .bodyToMono(WeatherResponse.class);
    }

    private URI getUrlFromRequest(WeatherRequest request) throws URISyntaxException {
        StringBuilder sb = new StringBuilder(WEATHER_BASE_URL);
        sb.append("lat=");
        sb.append(request.location().latitude());
        sb.append("&lon=");
        sb.append(request.location().longitude());
        sb.append("&units=");
        sb.append(request.units());
        sb.append("&appid=");
        sb.append(API_KEY);
        return new URI(sb.toString());
    }
}
