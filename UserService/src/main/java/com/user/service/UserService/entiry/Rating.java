package com.user.service.UserService.entiry;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.function.IntFunction;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rating{

    private String ratingId;

    private String userId;

    private String id;

    private Integer rating;

    private String feedback;

    private Hotel hotel;

}
