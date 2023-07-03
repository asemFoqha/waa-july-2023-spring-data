package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ProductRepository extends ListCrudRepository<Product,Long> {

    List<Product> findAllByPriceGreaterThan(int minPrice);

    List<Product> findAllByPriceGreaterThanAndCategory_Name(int maxPrice, String CategoryName);

    List<Product> findAllByNameContains(String keyWord);

    Product findById(long id);
}
