package com.neebal.practicespringcore.entities;

public class Movie {
    private String title;
    private String description;
    private Integer ratings;

    public Movie() {
    }

    public Movie(String title, String description, Integer ratings) {
        this.title = title;
        this.description = description;
        this.ratings = ratings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
