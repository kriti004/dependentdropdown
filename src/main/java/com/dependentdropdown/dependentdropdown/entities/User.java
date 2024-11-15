package com.dependentdropdown.dependentdropdown.entities;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="username")
    private String username;

    @Column(name="country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User(String username, String country, String city, String state) {
        this.username = username;
        this.country = country;
        this.city = city;
        this.state = state;
    }

    public User() {
    }
}
