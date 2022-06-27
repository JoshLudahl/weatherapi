package com.softklass.weatherapi.network;

import com.softklass.weatherapi.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class CitySuggestionService {

    WebClient webClient = WebClient.create();
    private static final String API_KEY = "";

    @Autowired
    public CitySuggestionService() { }

    public Mono<City[]> getCitySuggestionFromStringInput(String keyword) {
        return webClient
                .get()
                .uri("https://api.api-ninjas.com/v1/city?name=" + keyword + "&limit=20")
                .header("X-Api-Key", API_KEY)
                .retrieve()
                .bodyToMono(City[].class);
    }
}
