package com.hotel.entity.services;

import com.hotel.entity.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotel();

    Hotel getHotel(String hotelId);
}
