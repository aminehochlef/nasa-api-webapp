package com.example.nasa_api_demo.service;

import com.example.nasa_api_demo.model.RoverPhotosResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class MarsRoverService {

    @Value("${nasa.api.key}")
    private String apiKey;


    private final String MARS_ROVER_URL = "https://api.nasa.gov/mars-photos/api/v1/rovers/{rover}/photos";

    public RoverPhotosResponse getRoverPhotos(String roverName, String earthDate) {
        RestTemplate restTemplate = new RestTemplate();

        String url = UriComponentsBuilder.fromUriString(MARS_ROVER_URL)
                .buildAndExpand(roverName)
                .toUriString();

        url = UriComponentsBuilder.fromUriString(url)
                .queryParam("earth_date", earthDate)
                .queryParam("api_key", apiKey)
                .toUriString();

        return restTemplate.getForObject(url, RoverPhotosResponse.class);
    }
}
