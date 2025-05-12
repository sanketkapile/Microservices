package com.user.service.UserService.services;

import com.user.service.UserService.entiry.Hotel;
import com.user.service.UserService.entiry.Rating;
import com.user.service.UserService.entiry.User;
import com.user.service.UserService.repository.UserRepository;
import com.user.service.UserService.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {

        User user = userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User Not found "+userId));

        //get rating for above user
        ArrayList<Rating> ratingOfUser = restTemplate.getForObject("http://localhost:5003/ratings/users/" + user.getUserId(), ArrayList.class);
        logger.info("{}",ratingOfUser);
        user.setRatings(ratingOfUser);
        return user;

    }
}
