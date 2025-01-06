package com.example.nasa_api_demo.model;

import java.util.List;

public class RoverPhotosResponse {
    private List<RoverPhoto> photos;

    public List<RoverPhoto> getPhotos() { return photos; }
    public void setPhotos(List<RoverPhoto> photos) { this.photos = photos; }
}
