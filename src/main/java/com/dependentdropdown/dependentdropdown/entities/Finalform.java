package com.dependentdropdown.dependentdropdown.entities;

public class Finalform {

    private String user;
    private String country;
    private String state ;

    private String city;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Finalform(String user, String country, String state, String city) {
        this.user = user;
        this.country = country;
        this.state = state;
        this.city = city;
    }

    public Finalform() {
    }

}
