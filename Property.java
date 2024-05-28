package com.rentify.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String place;
    private String area;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private String nearbyHospitals;
    private String nearbyColleges;

    // Getters and Setters
}
