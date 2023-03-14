package com.blocks.ratingsdataservice.resources;

import com.blocks.ratingsdataservice.models.Rating;
import com.blocks.ratingsdataservice.models.UserRating;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.PushBuilder;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingDataResource {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 9);
    }

    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId) {
        List<Rating> ratingList = Arrays.asList(
                new Rating("1", 7),
                new Rating("2", 8)
        );
        UserRating userRating = new UserRating();
        userRating.setUserRating(ratingList);
        return userRating;
    }

}
