package com.example.demo.services;

import com.example.demo.entity.Review;

import java.util.List;

public interface ReviewService {
    void saveReview(Review review);

    List<Review> getAll();
}
