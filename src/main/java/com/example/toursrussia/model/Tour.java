package com.example.toursrussia.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Tour implements Serializable {
    private int id;
    private String name;
    private String region;
    private String description;
    private String details;
    private double price;
    private int duration;
    private double rating;
    private int reviews;
    private String imageUrl;
    private List<String> attractions;
    private List<String> highlights;
    private String difficulty;

    public Tour(int id, String name, String region, String description, String details,
                double price, int duration, double rating, int reviews, String imageUrl) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.description = description;
        this.details = details;
        this.price = price;
        this.duration = duration;
        this.rating = rating;
        this.reviews = reviews;
        this.imageUrl = imageUrl;
        this.attractions = new ArrayList<>();
        this.highlights = new ArrayList<>();
        this.difficulty = "Medium";
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
    public int getReviews() { return reviews; }
    public void setReviews(int reviews) { this.reviews = reviews; }
    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
    public List<String> getAttractions() { return attractions; }
    public void setAttractions(List<String> attractions) { this.attractions = attractions; }
    public void addAttraction(String attraction) { this.attractions.add(attraction); }
    public List<String> getHighlights() { return highlights; }
    public void setHighlights(List<String> highlights) { this.highlights = highlights; }
    public void addHighlight(String highlight) { this.highlights.add(highlight); }
    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
}
