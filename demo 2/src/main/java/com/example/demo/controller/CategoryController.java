package com.example.demo.controller;

import com.example.demo.entity.Category;
import com.example.demo.services.implementation.CategoryServiceImplementation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/category")
public class CategoryController {
    private final CategoryServiceImplementation categoryService;

    @GetMapping
    public List<Category> findAll(){
//        return categoryService.findAll();
        return null;
    }

    @PostMapping
    public void save(@RequestBody Category category){
//        categoryService.save(category);
    }

    @PutMapping("/{id}")
    public void updateById(@PathVariable Long id, @RequestBody Category category){
//        categoryService.updateById(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
//        categoryService.deleteById(id);
    }
}
