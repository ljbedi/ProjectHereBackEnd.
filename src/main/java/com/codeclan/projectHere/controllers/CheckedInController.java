package com.codeclan.projectHere.controllers;

import com.codeclan.projectHere.models.CheckedIn;
import com.codeclan.projectHere.models.Review;
import com.codeclan.projectHere.repositories.CheckedInRepository;
import com.codeclan.projectHere.repositories.EstablishmentRepository;
import com.codeclan.projectHere.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class CheckedInController {

    @Autowired
    CheckedInRepository checkedInRepository;

    @Autowired
    EstablishmentRepository establishmentRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/checked_in")
    public List<CheckedIn> getAllCheckIns() {
        return checkedInRepository.findAll();
    }

}
