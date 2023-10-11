package com.codeclan.projectHere.controllers;

import com.codeclan.projectHere.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    @Autowired
    CityRepository cityRepository;
}
