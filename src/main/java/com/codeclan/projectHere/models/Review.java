package com.codeclan.projectHere.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="post", columnDefinition = "TEXT")
    private String post;

    @Column(name="rating")
    private int rating;

    @ManyToOne
    @JsonIgnoreProperties({"reviews"})
    @JoinColumn(name="establishment_id", nullable = false)
    private Establishment establishment;
    @ManyToOne
    @JsonIgnoreProperties({"reviews"})
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    public Review(){

    }

    public Review(String post, int rating, Establishment establishment, User user) {
        this.post = post;
        this.rating = rating;
        this.establishment = establishment;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
