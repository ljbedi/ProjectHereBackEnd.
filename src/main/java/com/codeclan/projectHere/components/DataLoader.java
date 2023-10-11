package com.codeclan.projectHere.components;
import com.codeclan.projectHere.models.City;
import com.codeclan.projectHere.models.User;
import com.codeclan.projectHere.repositories.CityRepository;
import com.codeclan.projectHere.repositories.UserRepository;
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
    CityRepository cityRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
    User user1 = new User("Liam", "liam@gmail.com", "Edinburgh");
    userRepository.save(user1);

    User user2 = new User("Holly", "holly@gmail.com", "Edinburgh");
    userRepository.save(user2);

    City city1 = new City("Edinburgh", "Capital of Scotland", "XXXXX", "XXXXX", "XXXXXXX", 55.9533, -3.1883);
    cityRepository.save(city1);
    };
};
