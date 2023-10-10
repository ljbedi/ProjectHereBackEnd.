package com.codeclan.projectHere.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username")
    private String username;

    @Column(name="email")
    private String email;

    @Column(name="location")
    private String location;

//    @Column(name="favourites")
//    private List<Favourite> favourites;

//    @Column(name="reviews")
//    private List<Review> reviews;

//    @Column(name="checked_in")
//    private Boolean checked_in;

    public User() {

    }

    public User(String username, String email, String location) {
        this.username = username;
        this.email = email;
        this.location = location;
//        this.checked_in = checked_in;
//        this.favourites = new ArrayList<>();
//        this.reviews = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

//    public List<Favourite> getFavourites() {
//        return favourites;
//    }
//
//    public void setFavourites(List<Favourite> favourites) {
//        this.favourites = favourites;
//    }
//
//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }

//    public Boolean getChecked_in() {
//        return checked_in;
//    }
//
//    public void setChecked_in(Boolean checked_in) {
//        this.checked_in = checked_in;
//    }
}
