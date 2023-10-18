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
            "Edinburgh, Scotland",
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

    City london = new City("London, England",
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

    City kuala_lumpur = new City("Kuala Lumpur, Malaysia",
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

    City singapore = new City("Singapore",
            "Singapore, although known for its strict laws and regulations, has made significant progress in creating a more inclusive \n " +
            "\n" + "environment for the LGBT community. While certain laws criminalize same-sex relations, Singapore is gradually evolving and becoming more accepting of \n" +
            "\n" + " diverse sexual orientations and gender identities. The city boasts a growing number of LGBT-friendly establishments and events, fostering a sense of \n " +
            "\n" + "community and acceptance among its residents.",
            "Singapore's LGBTQ+ history reflects a complex interplay of traditional values and modern \n " +
                    "\n" + "social developments. The city-state has seen legal restrictions on homosexual activity,\n" +
                    "\n" + " which continue to influence the climate for LGBTQ+ individuals. Despite challenges,\n " +
                    "\n" + "recent years have witnessed a growing movement advocating for increased awareness,\n" +
                    "\n" +" acceptance, and legal recognition of LGBTQ+ rights, contributing to a more inclusive \n" +
                    "\n" + " and diverse Singaporean society.",
            "Singapore's legal landscape concerning LGBT rights is complex. Section 377A of the Penal Code criminalizes consensual \n" +
                    "\n" + "same-sex relations, which has been a subject of ongoing debate. However, despite these legal challenges, Singapore \n" +
                    "\n" + "has witnessed growing acceptance and visibility of the LGBT community. Organizations and advocacy groups continue to \n " +
                    "\n" + "work towards greater equality and social acceptance, promoting awareness and understanding within the broader society.",
            "Visit the National Museum of Singapore: Engage with Singapore's rich history and culture at \n" +
                    "\n" + " the National Museum, which hosts various inclusive exhibitions and events, showcasing \n" +
                    "\n" + " diverse narratives and perspectives that contribute to a more inclusive understanding of \n" +
                    "\n" + "Singapore's heritage.",
            1.290270,
            103.851959);
    cityRepository.save(singapore);

    City montevideo = new City("Montevideo, Uruguay",
            "Montevideo, the capital city of Uruguay, is known for its progressive and open-minded attitude, \n" +
                    "\n" + " making it one of the most LGBT-friendly cities in South America. It has a vibrant and inclusive \n" +
                    "\n" + " community that is widely accepted, creating a safe and welcoming environment for people of all \n" +
                    "\n" + "sexual orientations and gender identities. Montevideo is home to a diverse range of LGBT-friendly \n" +
                    "\n" + " establishments and events, fostering a sense of belonging and acceptance within the community.",
            "Montevideo boasts a rich history of LGBTQ+ activism and progressive legal reforms in South America. Uruguay has \n" +
                    "\n" + "implemented pioneering LGBTQ+ rights laws, including the legalization of same-sex marriage and the recognition of transgender \n" +
                    "\n" + " rights. Montevideo serves as a prominent hub for LGBTQ+ advocacy and cultural expression, fostering an inclusive and diverse community \n" +
                    "\n" + "that continues to push for social awareness and equal rights for all individuals.",
            "Montevideo has made significant strides in advancing LGBT rights and legal protections." +
                    " Uruguay, as a nation, was one of the first countries in South America to legalize " +
                    "\n" + "same-sex marriage in 2013, reflecting its progressive stance on LGBT rights. The city \n" +
                    "\n" + " hosts various LGBT events and pride celebrations, promoting visibility and equality \n" +
                    "\n" + "for the community. Additionally, Montevideo has implemented anti-discrimination laws \n" +
                    "\n" + "to ensure the safety and protection of LGBT individuals, contributing to a more \n" +
                    "\n" + " inclusive and tolerant society.",
            "Explore the Rambla: Take a leisurely stroll along the picturesque Rambla, a coastal promenade that offers stunning views of the sea and a refreshing ocean breeze, providing a welcoming and safe space for all visitors.\n" +
                    "\n" + "Visit the LGBTQ+ Community Center: Engage with the local LGBTQ+ community by participating in events, workshops, and gatherings organized by the LGBTQ+ Community Center, fostering connections and support within the community.\n" +
                    "\n" + "Attend LGBTQ+ Cultural Events: Attend various LGBTQ+ cultural events, such as film festivals, art exhibitions, and theater performances, showcasing diverse perspectives and promoting inclusivity within Montevideo's cultural scene.",
            -34.901112,
            -56.164532);
    cityRepository.save(montevideo);

    City istanbul = new City("Istanbul, Turkey",
            "Istanbul is a vibrant and culturally rich city that offers a mix of traditional and \n" +
                    "\n" + "contemporary experiences. For the LGBTQ+ community, while Turkey's overall attitude \n " +
                    "\n" + "toward sexual orientation and gender identity is evolving, challenges persist due to \n " +
                    "\n" + "certain societal stigmas and political considerations.",
            "Turkey has seen a complex history regarding LGBTQ+ rights, with certain legal ambiguities and social \n" +
                    "\n" + "challenges. While there are no specific laws criminalizing same-sex relations, societal \n" +
                    "\n" + " prejudices and discrimination remain a concern for the LGBTQ+ community. Despite these challenges, \n" +
                    "\n" + " Istanbul's diverse population contributes to a growing acceptance of different identities, \n " +
                    "\n" + "fostering an inclusive and diverse cultural environment.",
            "There are no known visible centers for support for LGBTQIA+ people, caution is advised even in the 'friendliest' of areas",
            " - Visit Taksim Square: Engage in the vibrant atmosphere of Taksim Square, a popular gathering place known for its\n" +
                    "\n" + " lively energy, diverse cultural events, and inclusive gatherings, reflecting Istanbul's dynamic\n " +
                    "\n" + "social fabric and fostering a sense of community spirit.\n" +
                    "\n" + " - Explore Istanbul Modern: Immerse yourself in Istanbul Modern, a contemporary art \n" +
                    "\n" + " museum known for hosting inclusive exhibitions and cultural events that celebrate diversity and\n " +
                    "\n" + "promote dialogue around various social issues, including LGBTQ+ themes and narratives.\n" +
                    "\n" + " - Stroll through Istiklal Avenue: Enjoy a leisurely walk along Istiklal Avenue, a bustling \n " +
                    "\n" + "pedestrian street adorned with shops, cafes, and cultural landmarks, known for its lively ambiance \n" +
                    "\n" + "and welcoming atmosphere, providing a diverse and inclusive space for people to connect and socialize.",
            41.015137,
            28.979530);

    City cape_town = new City("Cape Town, South Africa",
            "Cape Town, known for its breathtaking natural landscapes and vibrant cultural scene, has been a trailblazer\n  " +
                    "\n" + "in promoting LGBTQ+ rights and inclusivity in South Africa. The city's progressive and liberal attitude\n" +
                    "\n" + " has contributed to the flourishing of a diverse and vibrant LGBTQ+ community, offering a\n " +
                    "\n" + "range of LGBTQ+-friendly establishments and events that celebrate diversity and promote equality.",
            "Cape Town's LGBTQ+ history is closely tied to South Africa's transformative journey from apartheid to democracy.\n" +
                    "\n" + " The city has played a prominent role in promoting LGBTQ+ rights, offering a progressive and vibrant\n " +
                    "\n" + "environment for the community. With the constitutional recognition of LGBTQ+ rights and the \n" +
                    "\n" + "celebration of events such as Cape Town Pride, the city continues to foster an inclusive and\n " +
                    "\n" + "supportive atmosphere, promoting visibility and advocacy for LGBTQ+ rights.",
            "1 Molteno Rd, Oranjezicht, Cape Town, 8001, South Africa\n" +
                    "\n" + "2, 4 Seymour St, Observatory, Kaapstad, 7925, South Africa",
            "Explore Bo-Kaap: Discover the vibrant neighborhood of Bo-Kaap, known for its colorful houses, rich \n" +
                    "\n" + " cultural heritage, and inclusive atmosphere, providing visitors with an authentic and welcoming\n " +
                    "\n" + "experience that celebrates diversity and cultural acceptance.\n" +
                    "\n" + "Visit the Zeitz Museum of Contemporary Art Africa: Immerse yourself in the dynamic contemporary\n " +
                    "\n" + "art scene at the Zeitz MOCAA, which features inclusive exhibitions and diverse artistic expressions that reflect the city's \n" +
                    "\n" + "commitment to promoting cultural diversity and inclusivity.\n" +
                    "\n" + "Hike up Table Mountain: Enjoy a scenic hike up Table Mountain, a picturesque natural landmark \n" +
                    "\n" + "that offers breathtaking views of Cape Town and its surroundings, providing a serene and \n" +
                    "\n" + "welcoming environment for individuals to connect with nature and appreciate the city's stunning beauty.",
            -33.918861,
            18.423300);
    cityRepository.save(cape_town);

    Review review1 = new Review ("Great music and dancing", 5, establishment1, user2);
    reviewRepository.save(review1);

    Category category1 = new Category("Club", establishment1);
    categoryRepository.save(category1);

//    CheckedIn checkedIn1 = new CheckedIn(4, user2, establishment1);
//    checkedInRepository.save(checkedIn1);

    };
};
