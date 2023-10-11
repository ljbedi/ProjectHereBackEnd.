//package com.codeclan.projectHere.models;
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Locale;
//
//@Entity
//@Table(name="establishments")
//public class Establishment {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name="name")
//    private String name;
//
//    @Column(name="categories")
//    private List<Category> categories;
//
//    @Column(name="reviews")
//    private List<Review> reviews;
//
//    @Column(name="description")
//    private String description;
//
//    @Column(name="longitude")
//    private Float longitude;
//
//    @Column(name="latitude")
//    private Float latitude;
//
//    public Establishment(){
//
//    }
//
//    public Establishment(String name, String description, Float longitude, Float latitude) {
//        this.name = name;
//        this.description = description;
//        this.longitude = longitude;
//        this.latitude = latitude;
//        this.categories = new ArrayList<>();
//        this.reviews = new ArrayList<>();
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
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Category> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(List<Category> categories) {
//        this.categories = categories;
//    }
//
//    public List<Review> getReviews() {
//        return reviews;
//    }
//
//    public void setReviews(List<Review> reviews) {
//        this.reviews = reviews;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Float getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(Float longitude) {
//        this.longitude = longitude;
//    }
//
//    public Float getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(Float latitude) {
//        this.latitude = latitude;
//    }
//}
