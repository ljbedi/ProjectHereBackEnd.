package com.codeclan.projectHere.controllers;
import com.codeclan.projectHere.models.Establishment;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.EstablishmentRepository;
import com.codeclan.projectHere.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EstablishmentController {

    @Autowired
    EstablishmentRepository establishmentRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/establishments")
    public List<Establishment> getAllEstablishments() {
        return establishmentRepository.findAll();
    }

    @GetMapping(value ="/establishments/{id}")
    public Optional<Establishment> getEstablishmentById(@PathVariable Long id) {return establishmentRepository.findById(id);}


    @PostMapping(value = "/establishments")
    public Establishment createNewEstablishment(@RequestBody Establishment establishment) {
        return establishmentRepository.save(establishment);}


    @GetMapping(value="/establishments/find")
    public ResponseEntity <Establishment> getEstablishment(
            @RequestParam(name="lat") double lat,
            @RequestParam(name="lng") double lng,
            @RequestParam(name="user_id") Long user_id)
            {
        Establishment found = establishmentRepository.findEstablishment(lat, lng);
        if (found != null) {
            userRepository.addCheckedIn(user_id, found.getId());
            return new ResponseEntity<>(found, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

}