package com.neebal.practicespringcore.services;

import com.neebal.practicespringcore.entities.Movie;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MovieDetailsService {
    private Map<String, Movie> movieMap;

    public Map<String, Movie> getMovieMap() {
        return movieMap;
    }

    public void setMovieMap(Map<String, Movie> movieMap) {
        this.movieMap = movieMap;
    }

    public MovieDetailsService() {
        this.movieMap = new HashMap<>();
        this.movieMap.put(
                "Rocky 1",
                new Movie("Rocky 1", "First Part of Rocky Balboa", 4)
        );this.movieMap.put(
                "Rocky 2",
                new Movie("Rocky 2", "Second Part of Rocky Balboa", 5)
        );this.movieMap.put(
                "Rocky 3",
                new Movie("Rocky 3", "Third Part of Rocky Balboa", 3)
        );this.movieMap.put(
                "Rocky 4",
                new Movie("Rocky 4", "Fourth Part of Rocky Balboa", 5)
        );this.movieMap.put(
                "Rocky 5",
                new Movie("Rocky 5", "Five Part of Rocky Balboa", 4)
        );
    }

    public Movie getMovieDetails(String title) {
        return this.movieMap.get(title);
    }

}
