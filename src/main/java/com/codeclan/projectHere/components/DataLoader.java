package com.codeclan.projectHere.components;

import com.codeclan.projectHere.models.*;
import com.codeclan.projectHere.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Profile("!test") //Run every time EXCEPT Tests
//@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    EstablishmentRepository establishmentRepository;
  
    @Autowired
    CityRepository cityRepository;

    @Autowired
    ReviewRepository reviewRepository;

//    @Autowired
//    CheckedInRepository checkedInRepository;

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
    
    City edinburgh = new City(
            "Edinburgh",
            "The Beautiful Capital of Scotland",
            "Although Edinburgh doesn't have the happiest history for the LGBTQIA+ community, in the last 40 Years it has become a warm and welcoming city with a thriving LGBTQIA+ friendly scene.\n" +
            "\n" +
            "The International Lesbian and Gay Association last year ranked Scotland as having the second highest legal equality for LGBT+ people anywhere in Europe, higher than the rest of the UK.\n" +
            "\n" +
            "From cosy pubs with real ale to buzzing nightclubs with fabulous cocktails and DJ nights, Edinburgh has lots of friendly and safe hangouts for the LGBTQIA+ community.\n",
            "LGBT Health and Wellbeing\n" +
            "Duncan Place Community Hub\n" +
            "4 Duncan Place\n" +
            "Edinburgh\n" +
            "EH6 8HW\n" +
            "\n" + "\uD83D\uDCDE 0131 564 3970\n" +
            "\uD83D\uDCE7 admin@lgbthealth.org.uk",
            "You’ll find a lot of venues at the top of Leith Walk, in the popular neighbourhood of Leith and across to Broughton Street, known locally as the ‘Pink Triangle’",
            55.9533,
            -3.1883);
    cityRepository.save(edinburgh);

    City london = new City("London",
            "England's capital and largest city",
            "The first Gay Pride march took place in London on 1 July 1972, inspired by the 1969 Stonewall Riots in New York. \n" +
            "\n" + "These were triggered by police harassment at the Stonewall Inn, a bar catering to New York's gay, lesbian, transgender and crossdressing community. \n" +
            "\n" + "The bar's patrons fought back, striking a symbolic blow for gay liberation.",
            "LONDON FRIEND MAIN OFFICE\n" +
                    "86 Caledonian Road\n" +
                    "London N19DN\n" +
                    "020 7833 1674\n" +
                    "office@londonfriend.org.uk",
            "From Soho to Brixton, or Clapham and Shorditch, there are plenty of fun and exciting places to visit in London. \n" +
            "\n" + "Although not all of London is safe for people in the LGBTQIA+ Community, you will find plenty of places in the Uks largest city to go and see, safely.",
            51.5072,
            0.1276);
    cityRepository.save(london);

    City kuala_lumpur = new City("Kuala Lumpur",
            "The capital and most important Malay city on the Malay Peninsula",
            "Lesbian, gay, bisexual, and transgender (LGBTQIA+) people in Malaysia face severe challenges, prejudices and threats not experienced by non-LGBT residents. \n" +
                    "\n" + "Sodomy is a crime in the country, with laws strictly enforced. \n" +
                    "\n" + "Extrajudicial murders of LGBT people have also occurred in the country. \n" +
                    "\n" + "There are no Malaysian laws that protect the LGBT community against discrimination and hate crimes.",
            "Please remain diligent in Kuala Lumpur and remember that local authorities do not recognize hate crimes against LGBTQIA+, sentences for suspected LGBTQIA+ activity can result in 20 years imprisonment with violence committed on prisoners.",
            "We have no recommendations for places to visit for people in the LGBTQIA+ Community in Kuala Lumpur.",
            3.1319,
            101.6841);
    cityRepository.save(kuala_lumpur);

    Review review1 = new Review ("Great music and dancing", 5, establishment1, user2);
    reviewRepository.save(review1);

    Category category1 = new Category("Club", establishment1);
    categoryRepository.save(category1);

//    CheckedIn checkedIn1 = new CheckedIn(4, user2, establishment1);
//    checkedInRepository.save(checkedIn1);

    };
};
