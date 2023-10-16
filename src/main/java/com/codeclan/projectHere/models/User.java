package com.codeclan.projectHere.models;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "location")
    private String location;

//    @Column(name="reviews")
//    private List<Review> reviews;
    @JsonIgnoreProperties("checked_in_users")
    @ManyToMany
    @JoinTable(
            name = "checked_in",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "establishment_id")
    )
    Set<Establishment> checked_ins;

    public User() {

    }

    public User(String username, String password, String email, String location) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.location = location;
//        this.checked_ins = new ArrayList<>();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }


    public Set<Establishment> getChecked_ins() {
        return checked_ins;
    }

    public void setChecked_ins(Set<Establishment> checked_ins) {
        this.checked_ins = checked_ins;
    }

    public void addCheckIn(Establishment establishment) {
        this.checked_ins.add(establishment);
    }
}
