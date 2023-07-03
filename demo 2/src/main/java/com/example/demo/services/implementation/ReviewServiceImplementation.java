package com.example.demo.services.implementation;

import com.example.demo.entity.Review;
import com.example.demo.services.ReviewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImplementation implements ReviewService {
    @Override
    public void saveReview(Review review) {

    }

    @Override
    public List<Review> getAll() {
        return null;
    }
}
