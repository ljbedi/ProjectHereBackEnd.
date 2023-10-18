package com.codeclan.projectHere.components;

import com.codeclan.projectHere.models.*;
import com.codeclan.projectHere.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.persistence.criteria.From;

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

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
    User user1 = new User("Liam", "password", "liam@gmail.com", "Edinburgh");
    userRepository.save(user1);
    
    City edinburgh = new City(
            "Edinburgh, Scotland",
            "Edinburgh, the capital of Scotland, is a city that beautifully combines history, culture, and stunning landscapes.\n" +
            "It's renowned for its historic and architectural wonders, including the iconic Edinburgh Castle, which overlooks the city.\n" +
                    "Visitors are captivated by its charming cobbled streets, rich cultural festivals, and a vibrant arts scene. \n" +
                    "Edinburgh is a city where the past and the present harmoniously coexist, offering a unique blend of tradition and modernity. \n ",
            "Over the past few decades, Edinburgh has evolved into a welcoming and diverse city for the LGBTQIA+ community. \n" +
                    "While the city has faced historical challenges, it has transformed into a place where LGBTQIA+ individuals can openly express themselves. \n " +
                    "Notably, LGBTQIA+ bars, events, and support networks thrive, contributing to a more inclusive and accepting atmosphere.",
            "LGBT Health and Wellbeing\n" +
            "Duncan Place Community Hub\n" +
            "4 Duncan Place\n" +
            "Edinburgh\n" +
            "EH6 8HW\n" +
            "\uD83D\uDCDE 0131 564 3970\n" +
            "\uD83D\uDCE7 admin@lgbthealth.org.uk",
            "Edinburgh, a vibrant and inclusive city, offers a plethora of activities and spaces for the LGBTQIA+ community to explore. \n" +
                    "From enjoying a night out at LGBTQIA+-friendly bars and clubs, like CC Blooms and The Regent Bar, to participating in events like Pride Edinburgh, \n" +
                    "the city celebrates diversity and offers a welcoming environment for all. You can also visit LGBTQIA+ owned establishments such as Kafe Kweer, Victoria Bar, \n" +
                    "and more, which create a safe and inclusive atmosphere.",
            55.953252,
            -3.188267);
    cityRepository.save(edinburgh);

    Establishment CCBlooms = new Establishment(
            "CC Blooms",
            "CC Blooms is a well-known LGBTQIA+ bar situated in the vibrant city of Edinburgh, Scotland. \n" +
            "This LGBTQIA+ friendly establishment offers a welcoming and inclusive atmosphere, making it a go-to spot for locals and visitors alike. \n" +
            "With a reputation for its lively drag shows, delicious dining options, and a spacious dance floor, CC Blooms is a must-visit venue for those \n" +
            "looking to experience the city's thriving LGBTQIA+ scene.",
            "bar",
            55.957106,
            -3.185179);
    establishmentRepository.save(CCBlooms);

    Establishment KafeKweer = new Establishment(
            "Kafe Kweer",
            "Kafe Kweer is a welcoming LGBTQIA+ owned café located in the heart of Edinburgh. It offers a cozy and sober space for \n" +
            "visitors to enjoy quality time and delicious offerings in a friendly atmosphere. This café embodies the spirit of inclusion and community.",
            "cafe",
            55.940357,
            -3.211599);
    establishmentRepository.save(KafeKweer);

    Establishment TheRegentBar = new Establishment(
            "The Regent Bar",
            "The Regent Bar is a well-loved LGBTQIA+ friendly bar nestled in the heart of Edinburgh. \n" +
            "It's a vibrant and inclusive space where people gather to enjoy lively entertainment, dance the night away, and savor drinks with friends. \n" +
            "The Regent Bar is known for its welcoming and diverse community.",
            "bar",
            55.945629,
            -3.204008);
    establishmentRepository.save(TheRegentBar);

    Establishment VictoriaBar = new Establishment(
            "Victoria Bar",
            "The Victoria Bar is a cherished LGBTQIA+ friendly bar in Edinburgh, known for its warm and inviting atmosphere. \n" +
            "Located in a vibrant part of the city, this bar welcomes everyone to enjoy a variety of events, including drag shows, themed parties, and karaoke nights. \n" +
            "It's a hub for the LGBTQIA+ community to come together and celebrate.",
            "bar",
            55.960561,
            -3.172252);
    establishmentRepository.save(VictoriaBar);

    Establishment Planet = new Establishment(
            "Planet",
            "Planet is a lively and vibrant LGBTQIA+ friendly bar in the heart of Edinburgh. With a fun and welcoming atmosphere, \n" +
            "this bar offers a wide range of events and entertainment, including drag shows, live music, and themed parties. It's a popular destination for both locals and \n" +
            "tourists looking to enjoy a night out in the LGBTQIA+ community",
            "bar",
            55.947963,
            -3.186570);
    establishmentRepository.save(Planet);

    Establishment ParadisePalms = new Establishment(
            "Paradise Palms",
            "Paradise Palms is a popular LGBTQIA+ friendly bar located in the vibrant city of Edinburgh. Known for its quirky and unique atmosphere, \n" +
            "this bar offers a mix of art, music, and delicious cocktails. The decor is eclectic and retro, creating a fun and welcoming environment for patrons. \n" +
            "Paradise Palms hosts various events, live music, and DJ nights, making it a must-visit spot for those looking to experience the LGBTQIA+ scene in Edinburgh.",
            "bar",
            55.947387,
            -3.186570);
    establishmentRepository.save(ParadisePalms);

    Establishment Lighthouse = new Establishment(
            "Lighthouse",
            "Lighthouse is a well-loved LGBTQIA+ friendly bar situated in the heart of Edinburgh. It's known for its cozy and welcoming ambiance, \n" +
            "providing a comfortable space for patrons to relax and socialize. The bar offers a variety of drinks, including craft beers and signature cocktails, and often hosts themed nights, \n" +
            "drag shows, and live performances. With its friendly staff and vibrant atmosphere, Lighthouse is a go-to destination for those seeking LGBTQIA+ nightlife in Edinburgh.",
            "bar",
            55.948097,
            -55.948097);
    establishmentRepository.save(Lighthouse);

    City london = new City("London, England",
            "Description: London, the capital of the United Kingdom, is a sprawling metropolis renowned for its rich history, diverse culture, and vibrant LGBTQIA+ community. \n" +
                    "The city is a melting pot of identities, making it a welcoming and inclusive place for people of all backgrounds to live and visit.",
            "London has played a pivotal role in the LGBTQIA+ rights movement. It was here that the first recorded gay rights demonstration took place in the early 1970s, \n" +
                    "giving birth to the LGBTQIA+ rights movement in the UK. London is home to iconic LGBTQIA+ venues like the Royal Vauxhall Tavern and Heaven, which have been spaces for celebration and activism. \n" +
                    "The city hosts Pride in London, one of the largest LGBTQIA+ Pride events globally, and has made significant progress in LGBTQIA+ rights over the years.",
            "LONDON FRIEND MAIN OFFICE\n" +
                    "86 Caledonian Road\n" +
                    "London N19DN\n" +
                    "020 7833 1674\n" +
                    "office@londonfriend.org.uk",
            "London has vibrant LGBTQIA+ districts, including Soho and Vauxhall. These areas are filled with LGBTQIA+ bars, clubs, and shops. \n" +
                    "It's a great place to explore, meet new people, and enjoy the nightlife. Its home to landmarks like the LGBTQIA+ Pride Crossing at Trafalgar Square and the Alan Turing Memorial in Manchester Square. \n" +
                    "These sites are significant in LGBTQIA+ history.",
            51.509865,
            -0.118092);
    cityRepository.save(london);

    Establishment SheSoho = new Establishment(
            "She Soho",
            "She Soho is a vibrant and inclusive LGBTQ+ venue located in the heart of London's Soho district. It's a popular destination for lesbians, bisexual women, and their friends. \n" +
            "She Soho offers a welcoming and energetic atmosphere with regular events, including DJ nights, live performances, and more. It's a great place to socialize, dance, and celebrate diversity in a safe and accepting environment.",
            "venue",
            51.514479,
            -0.133808);
    establishmentRepository.save(SheSoho);

    Establishment RoyalVauxhallTavern = new Establishment(
            "Royal Vauxhall Tavern",
            "The Royal Vauxhall Tavern, often affectionately referred to as \"The RVT,\" is an iconic LGBTQ+ cabaret and performance venue in London. \n" +
            "Located in Vauxhall, it has a rich history of drag shows, live performances, and queer events. The venue offers a diverse and inclusive space where you can enjoy everything from comedy to cabaret, \n" +
            "making it a beloved destination for the LGBTQ+ community and allies.",
            "venue",
            51.486062,
            -0.122430);
    establishmentRepository.save(RoyalVauxhallTavern);

    Establishment AdmiralDuncanMemorial = new Establishment(
            "Admiral Duncan Memorial",
            "The Admiral Duncan Memorial, often referred to as \"The Admiral Duncan,\" is a renowned LGBTQ+ pub and a significant part of London's queer history. \n" +
            "Situated in Soho, it has been a welcoming and inclusive establishment for the LGBTQ+ community. The pub is known for its lively atmosphere, friendly patrons, and vibrant events, \n" +
            "making it a cherished spot for people to socialize, dance, and enjoy a sense of community.",
            "pub",
            51.514378,
            -0.133070);
    establishmentRepository.save(AdmiralDuncanMemorial);

    Establishment TheGlory = new Establishment(
            "The Glory",
            "The Glory is a dynamic and inclusive LGBTQ+ bar and performance venue located in the heart of East London. It has become a celebrated hub for drag shows, cabaret performances, \n" +
            "and a wide range of entertainment that embraces diversity and self-expression.",
            "bar",
            51.527079,
            -0.066063);
    establishmentRepository.save(TheGlory);

    Establishment Glasshouse = new Establishment(
            "Glasshouse",
            "Glasshouse is a well-known LGBTQ+ bar and club in London, offering a unique and lively nightlife experience. This venue is celebrated for its vibrant atmosphere, themed nights, and diverse events. \n" +
            "It provides a safe and inclusive space where people can dance, socialize, and enjoy a wide range of entertainment.",
            "club",
            51.515299,
            -0.135206);
    establishmentRepository.save(Glasshouse);

    Establishment GaysTheWord = new Establishment(
            "Gays The Word",
            "Gays The Word is a renowned LGBTQ+ bookshop in London that has been an essential hub for the community since its establishment in 1979. \n" +
            "This unique bookstore is dedicated to LGBTQ+ literature, providing a vast selection of books, magazines, and resources. It's a welcoming space where individuals can explore a rich variety of LGBTQ+ literature, \n" +
            "connect with like-minded people, and participate in community events, such as book readings and author signings.",
            "bookstore",
            51.524366,
            -0.126501);
    establishmentRepository.save(GaysTheWord);

    City kuala_lumpur = new City("Kuala Lumpur, Malaysia",
            "The capital of Malaysia",
            "Lesbian, gay, bisexual, and transgender (LGBTQIA+) people in Malaysia face severe challenges, prejudices and threats not experienced by non-LGBT residents. \n" +
                    "Sodomy is a crime in the country, with laws strictly enforced. \n" +
                    "Extrajudicial murders of LGBT people have also occurred in the country. \n" +
                    "There are no Malaysian laws that protect the LGBT community against discrimination and hate crimes.",
            "There are no known visible centers for support for LGBTQIA+ people, caution is advised even in the 'friendliest' of areas",
            "We have no recommendations for places to visit for people in the LGBTQIA+ Community in Kuala Lumpur.",
            3.140853,
            101.693207);
    cityRepository.save(kuala_lumpur);

    City singapore = new City("Singapore",
            "Singapore, although known for its strict laws and regulations, has made significant progress in creating a more inclusive \n " +
            "environment for the LGBT community. While certain laws criminalize same-sex relations, Singapore is gradually evolving and becoming more accepting of \n" +
             "diverse sexual orientations and gender identities. The city boasts a growing number of LGBT-friendly establishments and events, fostering a sense of \n " +
                    "community and acceptance among its residents.",
            "Singapore's LGBTQ+ history reflects a complex interplay of traditional values and modern \n " +
                    "social developments. The city-state has seen legal restrictions on homosexual activity,\n" +
                    " which continue to influence the climate for LGBTQ+ individuals. Despite challenges,\n " +
                    "recent years have witnessed a growing movement advocating for increased awareness,\n" +
                    "acceptance, and legal recognition of LGBTQ+ rights, contributing to a more inclusive \n" +
                    " and diverse Singaporean society.",
            "Singapore's legal landscape concerning LGBT rights is complex. Section 377A of the Penal Code criminalizes consensual \n" +
                    "same-sex relations, which has been a subject of ongoing debate. However, despite these legal challenges, Singapore \n" +
                    "has witnessed growing acceptance and visibility of the LGBT community. Organizations and advocacy groups continue to \n " +
                    "work towards greater equality and social acceptance, promoting awareness and understanding within the broader society.",
            "Visit the National Museum of Singapore: Engage with Singapore's rich history and culture at \n" +
                     " the National Museum, which hosts various inclusive exhibitions and events, showcasing \n" +
                     "diverse narratives and perspectives that contribute to a more inclusive understanding of \n" +
                    "Singapore's heritage.",
            1.290270,
            103.851959);
    cityRepository.save(singapore);

    Establishment TantricBar = new Establishment(
            "Tantric Bar & May Wong's Cafe",
            "A popular LGBTQ+-friendly bar and cafe known for its vibrant ambiance, \n" +
            "serving an array of cocktails and Asian fusion dishes, providing a welcoming space for social gatherings and celebrations.",
            "bar and cafe",
            1.2839,
            103.8500);
    establishmentRepository.save(TantricBar);

    Establishment DorothysBar = new Establishment(
            "Dorothy's Bar",
            "A renowned LGBTQ+-friendly bar and performance venue, offering a lively atmosphere, \n" +
            "live entertainment, and a diverse range of events, creating a safe and inclusive environment for patrons to enjoy and express themselves.",
            "bar",
            1.2898,
            103.8495);
    establishmentRepository.save(DorothysBar);

    Establishment BooksActually = new Establishment(
            "BooksActually",
            "An inclusive independent bookstore known for its diverse selection of literature and LGBTQ+ themed books, \n" +
            "providing a cozy and inviting space for book lovers and members of the community to explore and connect.",
            "bookstore",
            1.2827,
            103.8492);
    establishmentRepository.save(BooksActually);

    Establishment TheProjector = new Establishment(
            "The Projector",
            "A well-known independent cinema and creative space showcasing LGBTQ+ films and hosting various cultural events,\n + " +
            "fostering a sense of community and appreciation for diverse storytelling and artistic expressions.",
            "venue",
            1.2956,
            103.8554);
    establishmentRepository.save(TheProjector);

    Establishment OutBar = new Establishment(
            "OutBar",
            "An LGBTQ+-owned bar and social hub promoting a welcoming and safe environment for the community, \n" +
            "offering refreshing beverages and a comfortable setting for individuals to socialize and enjoy a vibrant nightlife experience.",
            "bar",
            1.2824,
            103.8505);
    establishmentRepository.save(OutBar);

    City montevideo = new City("Montevideo, Uruguay",
            "Montevideo, the capital city of Uruguay, is known for its progressive and open-minded attitude, \n" +
                    " making it one of the most LGBT-friendly cities in South America. It has a vibrant and inclusive \n" +
                    " community that is widely accepted, creating a safe and welcoming environment for people of all \n" +
                    "sexual orientations and gender identities. Montevideo is home to a diverse range of LGBT-friendly \n" +
                    " establishments and events, fostering a sense of belonging and acceptance within the community.",
            "Montevideo boasts a rich history of LGBTQ+ activism and progressive legal reforms in South America. Uruguay has \n" +
                    "implemented pioneering LGBTQ+ rights laws, including the legalization of same-sex marriage and the recognition of transgender \n" +
                    " rights. Montevideo serves as a prominent hub for LGBTQ+ advocacy and cultural expression, fostering an inclusive and diverse community \n" +
                    "that continues to push for social awareness and equal rights for all individuals.",
            "Montevideo has made significant strides in advancing LGBT rights and legal protections." +
                    " Uruguay, as a nation, was one of the first countries in South America to legalize " +
                    "same-sex marriage in 2013, reflecting its progressive stance on LGBT rights. The city \n" +
                    " hosts various LGBT events and pride celebrations, promoting visibility and equality \n" +
                    "for the community. Additionally, Montevideo has implemented anti-discrimination laws \n" +
                    "to ensure the safety and protection of LGBT individuals, contributing to a more \n" +
                    " inclusive and tolerant society.",
            "Explore the Rambla: Take a leisurely stroll along the picturesque Rambla, a coastal promenade that offers stunning views of the sea and a refreshing ocean breeze, providing a welcoming and safe space for all visitors.\n" +
                    "Visit the LGBTQ+ Community Center: Engage with the local LGBTQ+ community by participating in events, workshops, and gatherings organized by the LGBTQ+ Community Center, fostering connections and support within the community.\n" +
                    "Attend LGBTQ+ Cultural Events: Attend various LGBTQ+ cultural events, such as film festivals, art exhibitions, and theater performances, showcasing diverse perspectives and promoting inclusivity within Montevideo's cultural scene.",
            -34.901112,
            -56.164532);
    cityRepository.save(montevideo);

    Establishment TempoBar = new Establishment(
            "Tempo Bar",
            "A renowned theater in Montevideo known for promoting diverse and inclusive performances, providing a platform for LGBTQ+ artists and showcasing queer-centric productions.",
            "bar",
            -34.9062,
            -56.1914);
    establishmentRepository.save(TempoBar);

    Establishment SalaVerdiTheatre = new Establishment(
            "Sala Verdi Theatre",
            "A renowned theater in Montevideo known for promoting diverse and inclusive performances, providing a platform for LGBTQ+ artists and showcasing queer-centric productions.",
            "theatre",
            -34.9044,
            -56.1866);
    establishmentRepository.save(SalaVerdiTheatre);

    Establishment LaFondaRestaurant = new Establishment(
            "La Fonda Restaurant",
            "A popular eatery celebrated for its inclusive environment and traditional Uruguayan cuisine, attracting both locals and visitors who appreciate a welcoming and friendly dining experience.",
            "restaurant",
            -34.9103,
            -56.1916);
    establishmentRepository.save(LaFondaRestaurant);

    Establishment PurpleHouseCafe = new Establishment(
            "Purple House Cafe",
            "An LGBTQ+-owned cafe known for its cozy ambiance and delightful beverages, serving as a gathering spot for the community to connect and relax in a safe and comfortable setting.",
            "cafe",
            -34.9065,
            -56.1893);
    establishmentRepository.save(PurpleHouseCafe);

    Establishment MuseoTorres = new Establishment(
            "Museo Torres Garcia",
            " A renowned art museum featuring the works of celebrated artist Joaquín Torres García, known for its inclusive approach to art and culture, providing a welcoming space for all art enthusiasts.",
            "museum",
            -34.9070,
            -56.1873);
    establishmentRepository.save(MuseoTorres);

    City istanbul = new City("Istanbul, Turkey",
            "Istanbul is a vibrant and culturally rich city that offers a mix of traditional and \n" +
                    "contemporary experiences. For the LGBTQ+ community, while Turkey's overall attitude \n " +
                    "toward sexual orientation and gender identity is evolving, challenges persist due to \n " +
                    "certain societal stigmas and political considerations.",
            "Turkey has seen a complex history regarding LGBTQ+ rights, with certain legal ambiguities and social \n" +
                    "challenges. While there are no specific laws criminalizing same-sex relations, societal \n" +
                    " prejudices and discrimination remain a concern for the LGBTQ+ community. Despite these challenges, \n" +
                    " Istanbul's diverse population contributes to a growing acceptance of different identities, \n " +
                    "fostering an inclusive and diverse cultural environment.",
            "There are no known visible centers for support for LGBTQIA+ people, caution is advised even in the 'friendliest' of areas",
            " - Visit Taksim Square: Engage in the vibrant atmosphere of Taksim Square, a popular gathering place known for its\n" +
                    " lively energy, diverse cultural events, and inclusive gatherings, reflecting Istanbul's dynamic\n " +
                    "social fabric and fostering a sense of community spirit.\n" +
                    " - Explore Istanbul Modern: Immerse yourself in Istanbul Modern, a contemporary art \n" +
                    " museum known for hosting inclusive exhibitions and cultural events that celebrate diversity and\n " +
                    "promote dialogue around various social issues, including LGBTQ+ themes and narratives.\n" +
                    " - Stroll through Istiklal Avenue: Enjoy a leisurely walk along Istiklal Avenue, a bustling \n " +
                    "pedestrian street adorned with shops, cafes, and cultural landmarks, known for its lively ambiance \n" +
                    "and welcoming atmosphere, providing a diverse and inclusive space for people to connect and socialize.",
            41.015137,
            28.979530);
    cityRepository.save(istanbul);

    Establishment LoveDancePoint = new Establishment(
            "Love Dance Point",
            "A popular LGBTQ+-friendly bar and dance club known for its vibrant \n" +
            "nightlife and energetic atmosphere, offering an inclusive space for socializing, dancing, and enjoying a variety of music genres, \n" +
            "fostering a sense of camaraderie and celebration within the community.",
            "club",
            41.0368,
            28.985);
    establishmentRepository.save(LoveDancePoint);

    Establishment CoffeeManifesto = new Establishment(
            "Coffee Manifesto",
            "A cozy and inclusive LGBTQ+-friendly cafe offering a selection of \n" +
            "specialty coffees and baked goods, providing a warm and inviting environment for individuals to relax, socialize, and enjoy quality conversations, \n" +
            "fostering a sense of community and connection.",
            "cafe",
            41.0425,
            28.9845);
    establishmentRepository.save(CoffeeManifesto);

    Establishment IstanbulPride = new Establishment(
            "Istanbull Pride Park",
            "A prominent venue for various LGBTQ+ events and community gatherings, \n" +
            "promoting inclusivity, advocacy, and solidarity within the LGBTQ+ community, offering a safe and welcoming space for individuals to express themselves and celebrate their identities.",
            "park",
            41.0301,
            28.9737);
    establishmentRepository.save(IstanbulPride);

    Establishment RoxyClub = new Establishment(
            "Roxy Club",
            "An iconic LGBTQ+-friendly nightclub and performance venue hosting a range of events and live shows, known for its lively entertainment and welcoming atmosphere, \n" +
                    "providing a vibrant space for individuals to celebrate and express themselves freely.",
            "club",
            41.0366,
            28.9805);
    establishmentRepository.save(RoxyClub);

    Establishment QueerCyprus = new Establishment(
            "Queer Cyprus Association",
            "A notable LGBTQ+ advocacy and community organization, fostering dialogue and promoting awareness about LGBTQ+ issues and rights in Istanbul and beyond,\n" +
                    "providing support, resources, and a sense of belonging for the local LGBTQ+ community.",
            "support",
            41.0124,
            28.9768);
    establishmentRepository.save(QueerCyprus);

    City cape_town = new City("Cape Town, South Africa",
            "Cape Town, known for its breathtaking natural landscapes and vibrant cultural scene, has been a trailblazer\n  " +
                    "in promoting LGBTQ+ rights and inclusivity in South Africa. The city's progressive and liberal attitude\n" +
                    " has contributed to the flourishing of a diverse and vibrant LGBTQ+ community, offering a\n " +
                    "range of LGBTQ+-friendly establishments and events that celebrate diversity and promote equality.",
            "Cape Town's LGBTQ+ history is closely tied to South Africa's transformative journey from apartheid to democracy.\n" +
                    " The city has played a prominent role in promoting LGBTQ+ rights, offering a progressive and vibrant\n " +
                    "environment for the community. With the constitutional recognition of LGBTQ+ rights and the \n" +
                    "celebration of events such as Cape Town Pride, the city continues to foster an inclusive and\n " +
                    "supportive atmosphere, promoting visibility and advocacy for LGBTQ+ rights.",
            "1 Molteno Rd, Oranjezicht, Cape Town, 8001, South Africa\n" +
                    "2, 4 Seymour St, Observatory, Kaapstad, 7925, South Africa",
            "Explore Bo-Kaap: Discover the vibrant neighborhood of Bo-Kaap, known for its colorful houses, rich \n" +
                    " cultural heritage, and inclusive atmosphere, providing visitors with an authentic and welcoming\n " +
                    "experience that celebrates diversity and cultural acceptance.\n" +
                    "Visit the Zeitz Museum of Contemporary Art Africa: Immerse yourself in the dynamic contemporary\n " +
                    "art scene at the Zeitz MOCAA, which features inclusive exhibitions and diverse artistic expressions that reflect the city's \n" +
                    "commitment to promoting cultural diversity and inclusivity.\n" +
                    "Hike up Table Mountain: Enjoy a scenic hike up Table Mountain, a picturesque natural landmark \n" +
                    "that offers breathtaking views of Cape Town and its surroundings, providing a serene and \n" +
                    "welcoming environment for individuals to connect with nature and appreciate the city's stunning beauty.",
            -33.918861,
            18.423300);
    cityRepository.save(cape_town);

    Establishment CrewBar = new Establishment(
            "Crew Bar",
            "A well-known LGBTQ+-friendly bar and social hub, offering a welcoming atmosphere and a range of events, \n" +
                    "including drag shows and themed parties, providing a vibrant space for individuals to socialize, network, \n" +
                    "and celebrate inclusivity within the community.",
            "bar",
            -33.9293,
            18.4092);
    establishmentRepository.save(CrewBar);

    Establishment Zer021Club = new Establishment(
            "Zer021 Social Club",
            "An inclusive LGBTQ+ nightclub and entertainment venue known for its diverse music and lively atmosphere, \n" +
                    "providing a safe and vibrant space for individuals to enjoy a night of dancing and celebration with like-minded people \n" +
                    "from the LGBTQ+ community.",
            "club",
            -33.9276,
            18.4194);
    establishmentRepository.save(Zer021Club);

    Establishment BeulahBar = new Establishment(
            "Beulah Bar",
            "A popular LGBTQ+-friendly bar and lounge offering a relaxed and inviting environment for patrons to unwind, enjoy refreshing beverages, \n" +
                    "and engage in meaningful conversations, fostering a sense of community and camaraderie within Cape Town's LGBTQ+ scene.",
            "bar",
            -33.9324,
            18.4143);
    establishmentRepository.save(BeulahBar);

    Establishment PinkPanther = new Establishment(
            "The Pink Panther Social Club",
            "A prominent LGBTQ+-friendly social club and gathering spot known for its inclusive events and community-focused initiatives, \n" +
                    "providing a welcoming and supportive environment for LGBTQ+ individuals to connect, share experiences, and celebrate their identities.",
            "club",
            -33.9312,
            18.4119);
    establishmentRepository.save(PinkPanther);

    Establishment DragKing = new Establishment(
            "The Drag King Bar",
            " An iconic LGBTQ+-friendly bar and performance venue hosting drag king shows and diverse entertainment events, \n" +
                    "known for its lively energy and welcoming atmosphere, providing a platform for self-expression and celebration within Cape Town's LGBTQ+ community.",
            "bar",
            -33.9241,
            18.4238);
    establishmentRepository.save(DragKing);

    Review review1 = new Review ("Great music and dancing", 5, CCBlooms, user1);
    reviewRepository.save(review1);
    };
};
