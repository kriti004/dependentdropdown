package com.dependentdropdown.dependentdropdown.entities;

import org.springframework.beans.factory.annotation.Autowired;

public class FormData {

    private String username;
    private int countryId;
    private int stateId;
    private int  cityId;

//   public void setCountry(){
//
//   }
//  public String getCountry(){
//     return country;
//  }
//
//    public void setState(){
//
//    }
//    public String getState(){
//        return state;
//    }
//
//    public void setCity(){
//
//    }
//    public String getCity(){
//        return city;
//    }


    public FormData(String username,int countryId, int stateId, int cityId) {
        this.username = username;
        this.countryId = countryId;
        this.stateId = stateId;
        this.cityId = cityId;
    }

    public FormData() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
