package com.michau.ratingsDataService.controllers;


import com.michau.ratingsDataService.models.Rating;
import com.michau.ratingsDataService.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @RequestMapping("/{movieId}")
    public Rating getMovieRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId, 4);
    }

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
        List<Rating> ratings= Arrays.asList(
                new Rating("ssj", 5),
                new Rating("klk", 6)
        );
        UserRating userRating = new UserRating();
        userRating.setRatings(ratings);
        return userRating;

    }
}
