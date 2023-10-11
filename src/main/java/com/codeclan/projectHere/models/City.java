package com.codeclan.projectHere.models;


import javax.persistence.*;

@Entity
@Table(name="cities")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="history")
    private String history;

    @Column(name="wellbeing")
    private String wellbeing;

    @Column(name="toDo")
    private String toDo;

    @Column(name="latitude")
    private Float latitude;

    @Column(name="longitude")
    private Float longitude;

    public City() {

    }

    public City(Long id, String name, String description, String history, String wellbeing, String toDo, Float latitude, Float longitude) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.history = history;
        this.wellbeing = wellbeing;
        this.toDo = toDo;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}


