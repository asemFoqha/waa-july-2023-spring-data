package com.example.demo.services.implementation;

import com.example.demo.entity.Product;
import com.example.demo.entity.Review;
import com.example.demo.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImplementation implements ProductService {
    @Override
    public void saveProduct(Product product) {

    }

    @Override
    public List<Product> getAll() {
        return null;
    }

    @Override
    public List<Product> findAllByPriceGreaterThan(int price) {
        return null;
    }

    @Override
    public List<Product> findAllByPriceGreaterThanAndCategory_Name(int price, String name) {
        return null;
    }

    @Override
    public List<Product> findAllByNameContains(String name) {
        return null;
    }

    @Override
    public List<Review> findAllReviewsByProductId(long id) {
        return null;
    }
}
