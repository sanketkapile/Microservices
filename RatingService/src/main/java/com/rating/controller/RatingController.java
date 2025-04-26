package com.rating.controller;

import com.rating.entity.Rating;
import com.rating.repository.RatingRepository;
import com.rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> addRating(@RequestBody Rating rating) {

        return new ResponseEntity<>(ratingService.createRating(rating), HttpStatus.CREATED);

    }

    @GetMapping("/list")
    public ResponseEntity<List<Rating>> getAllRatings() {

        return new ResponseEntity<>(ratingService.getRatings(), HttpStatus.OK);

    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingsByUser(@PathVariable String userId) {

        return new ResponseEntity<>(ratingService.getRatingByUserId(userId), HttpStatus.OK);

    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingByHotel(@PathVariable String hotelId) {

        return new ResponseEntity<>(ratingService.getRatingByHotelId(hotelId), HttpStatus.OK);

    }

}
