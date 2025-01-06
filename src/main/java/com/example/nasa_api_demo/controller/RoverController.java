package com.example.nasa_api_demo.controller;


import com.example.nasa_api_demo.model.RoverPhotosResponse;
import com.example.nasa_api_demo.service.MarsRoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class RoverController {

    @Autowired
    private MarsRoverService marsRoverService;

    @GetMapping("/rover")
    public String getRoverPhotos(
            @RequestParam(defaultValue = "perseverance") String rover,
            @RequestParam(required = false) String date,
            Model model) {

        // If no date provided, use yesterday (as latest photos might not be available immediately)
        if (date == null || date.isEmpty()) {
            date = LocalDate.now().minusDays(1)
                    .format(DateTimeFormatter.ISO_DATE);
        }

        RoverPhotosResponse response = marsRoverService.getRoverPhotos(rover, date);
        model.addAttribute("photos", response.getPhotos());
        model.addAttribute("selectedRover", rover);
        model.addAttribute("selectedDate", date);

        return "rover";
    }

    @GetMapping("/rover/info")
    public String getRoverInfo() {
        return "rover-info";
    }

    @GetMapping("/rover/humanscale")
    public String getScaleHumanRover() {
        return "rover-humanscale";
    }
}
