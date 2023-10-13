//package com.codeclan.projectHere.models;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.*;
//
//
//@Entity
//@Table(name="checked_in")
//public class CheckedIn {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JsonIgnoreProperties({"checked_in"})
//    @JoinColumn(name="user_id", nullable = false)
//    private User user;
//
//    @ManyToOne
//    @JsonIgnoreProperties({"checked_in"})
//    @JoinColumn(name="establishment_id", nullable = false)
//    private Establishment establishment;
//
//    public CheckedIn () {
//
//    }
//    public CheckedIn(int safetyRating, User user, Establishment establishment) {
//        this.safetyRating = safetyRating;
//        this.user = user;
//        this.establishment = establishment;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getSafetyRating() {
//        return safetyRating;
//    }
//
//    public void setSafetyRating(int safetyRating) {
//        this.safetyRating = safetyRating;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Establishment getEstablishment() {
//        return establishment;
//    }
//
//    public void setEstablishment(Establishment establishment) {
//        this.establishment = establishment;
//    }
//}
