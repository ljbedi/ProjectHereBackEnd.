package com.codeclan.projectHere.components;

import com.codeclan.projectHere.models.*;
import com.codeclan.projectHere.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EstablishmentRepository establishmentRepository;
  
    @Autowired
    CityRepository cityRepository;

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    CheckedInRepository checkedInRepository;

    @Autowired
    CategoryRepository categoryRepository;



    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
    User user1 = new User("Liam", "password", "liam@gmail.com", "Edinburgh");
    userRepository.save(user1);

    User user2 = new User("Holly", "password1", "holly@gmail.com", "Edinburgh");
    userRepository.save(user2);
      
    Establishment establishment1 = new Establishment("CC Blooms", "Fun place for dancing", 55.957, -3.1877);
    establishmentRepository.save(establishment1);
    
    City city1 = new City("Edinburgh", "Capital of Scotland", "XXXXX", "XXXXX", "XXXXXXX", 55.9533, -3.1883);
    cityRepository.save(city1);

    Review review1 = new Review ("Great music and dancing", 5, establishment1, user2);
    reviewRepository.save(review1);

    Category category1 = new Category("Club", establishment1);
    categoryRepository.save(category1);

    CheckedIn checkedIn1 = new CheckedIn(4, user2, establishment1);
    checkedInRepository.save(checkedIn1);

    };
};
