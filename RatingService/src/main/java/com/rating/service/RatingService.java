package com.rating.service;

import com.rating.entity.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);

    List<Rating> getRatings();

    List<Rating> getRatingByUserId(String userId);

    List<Rating> getRatingByHotelId(String hotelId);
}
