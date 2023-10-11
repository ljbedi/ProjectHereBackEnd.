package com.codeclan.projectHere.controllers;

import com.codeclan.projectHere.models.City;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityRepository cityRepository;

    @GetMapping(value = "/cities")
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }
}
