package com.codeclan.projectHere.controllers;

import com.codeclan.projectHere.models.Review;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.EstablishmentRepository;
import com.codeclan.projectHere.repositories.ReviewRepository;
import com.codeclan.projectHere.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewController {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    EstablishmentRepository establishmentRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/reviews")
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @PostMapping(value = "/reviews")
    public Review createNewReview(@RequestBody Review review) {
        return reviewRepository.save(review);

    }
}
