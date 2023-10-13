package com.codeclan.projectHere.controllers;
import com.codeclan.projectHere.models.Establishment;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstablishmentController {

    @Autowired
    EstablishmentRepository establishmentRepository;

    @GetMapping(value = "/establishments")
    public List<Establishment> getAllEstablishments() {
        return establishmentRepository.findAll();
    }

    @PostMapping(value = "/establishments")
    public Establishment createNewEstablishment(@RequestBody Establishment establishment) {
        return establishmentRepository.save(establishment);}


}