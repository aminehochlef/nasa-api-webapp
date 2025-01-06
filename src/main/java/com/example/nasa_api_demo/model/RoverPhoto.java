package com.example.nasa_api_demo.model;

import java.util.Date;

public class RoverPhoto {
    private Long id;
    private Integer sol;
    private Camera camera;
    private String img_src;
    private String earth_date;
    private Rover rover;

    // Nested Camera class
    public static class Camera {
        private Long id;
        private String name;
        private String full_name;

        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getFull_name() { return full_name; }
        public void setFull_name(String full_name) { this.full_name = full_name; }
    }

    // Nested Rover class
    public static class Rover {
        private Long id;
        private String name;
        private String landing_date;
        private String launch_date;
        private String status;

        // Getters and Setters
        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getLanding_date() { return landing_date; }
        public void setLanding_date(String landing_date) { this.landing_date = landing_date; }

        public String getLaunch_date() { return launch_date; }
        public void setLaunch_date(String launch_date) { this.launch_date = launch_date; }

        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
    }

    // Getters and Setters for RoverPhoto
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getSol() { return sol; }
    public void setSol(Integer sol) { this.sol = sol; }

    public Camera getCamera() { return camera; }
    public void setCamera(Camera camera) { this.camera = camera; }

    public String getImg_src() { return img_src; }
    public void setImg_src(String img_src) { this.img_src = img_src; }

    public String getEarth_date() { return earth_date; }
    public void setEarth_date(String earth_date) { this.earth_date = earth_date; }

    public Rover getRover() { return rover; }
    public void setRover(Rover rover) { this.rover = rover; }
}
