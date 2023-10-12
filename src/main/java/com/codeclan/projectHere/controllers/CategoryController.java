package com.codeclan.projectHere.controllers;

import com.codeclan.projectHere.models.Category;
import com.codeclan.projectHere.models.Review;
import com.codeclan.projectHere.repositories.CategoryRepository;
import com.codeclan.projectHere.repositories.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    EstablishmentRepository establishmentRepository;



    @GetMapping(value = "/categories")
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }



}
