package com.example.nasa_api_demo.service;

import com.example.nasa_api_demo.model.ApodResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaService {

    @Value("${nasa.api.key}")
    private String apiKey;

    private final String NASA_APOD_URL = "https://api.nasa.gov/planetary/apod";

    public ApodResponse getAstronomyPictureOfTheDay() {
        RestTemplate restTemplate = new RestTemplate();
        String url = NASA_APOD_URL + "?api_key=" + apiKey;
        return restTemplate.getForObject(url, ApodResponse.class);
    }
}
