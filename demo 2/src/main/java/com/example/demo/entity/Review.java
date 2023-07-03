package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Review {
    @Id
    private long review_id;

    private String review;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JsonBackReference
    private Product product;

    @ManyToOne
    @JsonBackReference
    private User user;


}
