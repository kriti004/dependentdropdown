package com.dependentdropdown.dependentdropdown.entities;

import java.util.List;
import java.util.Optional;

public class Form {

    private Optional<Countries> countryList;
    private List<Cities> cityList;

    private List<States> stateList;
    public Form() {
    }

    public Optional<Countries> getCountryList() {
        return countryList;
    }

    public void setCountryList(Optional<Countries> countryList) {
        this.countryList = countryList;
    }

    public List<Cities> getCityList() {
        return cityList;
    }

    public void setCityList(List<Cities> cityList) {
        this.cityList = cityList;
    }

    public List<States> getStateList() {
        return stateList;
    }

    public void setStateList(List<States> stateList) {
        this.stateList = stateList;
    }

    public Form(Optional<Countries> countryList, List<Cities> cityList, List<States> stateList) {
        this.countryList = countryList;
        this.cityList = cityList;
        this.stateList = stateList;
    }


}
