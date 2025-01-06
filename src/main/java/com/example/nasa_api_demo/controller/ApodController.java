package com.example.nasa_api_demo.controller;

import com.example.nasa_api_demo.model.ApodResponse;
import com.example.nasa_api_demo.service.NasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApodController {

    @Autowired
    private NasaService nasaService;

    @GetMapping("/")
    public String getApod(Model model) {
        ApodResponse apodResponse = nasaService.getAstronomyPictureOfTheDay();
        model.addAttribute("apod", apodResponse);
        return "index";
    }
}