package com.michau.movieInfoService.controllers;


import com.michau.movieInfoService.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @RequestMapping("/{movieId}")
    private Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return new Movie("mov1", "Terminator", "awesome");
    }

}
