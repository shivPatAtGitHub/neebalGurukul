package com.neebal.practicespringcore.services;

import com.neebal.practicespringcore.entities.Movie;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
// every spring managed bean bu default is Singleton scope
//@Scope("prototype")
//if we use this for every usage a new obj in Spring Framework will be created
public class SupriseMeService {

    private List<String> movieTitles;
    private Random random;


    // Dependency injection (DI)
    // Inversion of Control (IOC)

//    @Autowired // property injection
//    private MovieDetailsService movieDetailsService;

    private  MovieDetailsService movieDetailsService;

    // constructor injection
//    public SupriseMeService(MovieDetailsService movieDetailsService) {
//        System.out.println("Object created by SpringFramework");
//        this.movieDetailsService = movieDetailsService;
//        this.movieTitles = Arrays.asList(
//                "Rocky 1",
//                "Rocky 2",
//                "Rocky 3",
//                "Rocky 4",
//                "Rocky 5"
//        );
//        this.random = new Random();
//    }
    public SupriseMeService() {
        System.out.println("Object created by Spring Container");
        this.movieTitles = Arrays.asList(
                "Rocky 1",
                "Rocky 2",
                "Rocky 3",
                "Rocky 4",
                "Rocky 5"
        );
        this.random = new Random();

//        avoid!
//        dependency injection - graph gets completed once all the constructors finish running
//        System.out.println(this.movieDetailsService.getMovieMap());
    }
    @PostConstruct
    public void init() {
        // runs after the constructor has finished running
        // and the dependency injection graph is initialized
        System.out.println(this.movieDetailsService.getMovieMap());
    }

    @PreDestroy
    public void cleanUp() {
        // runs just before the object is destroyed
        System.out.println("bye!!!");
    }


    // Setter injection
    @Autowired
    public void setMovieDetailsService(MovieDetailsService movieDetailsService) {
        this.movieDetailsService = movieDetailsService;
    }


    // business function
    public Movie getMovie() {
        int r = this.random.nextInt(this.movieTitles.size());
        String title = this.movieTitles.get(r);
        return this.movieDetailsService.getMovieDetails(title);

    }

}
