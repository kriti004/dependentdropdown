package com.dependentdropdown.dependentdropdown.controller;
import com.dependentdropdown.dependentdropdown.entities.Cities;
import com.dependentdropdown.dependentdropdown.entities.Countries;
import com.dependentdropdown.dependentdropdown.entities.States;
import com.dependentdropdown.dependentdropdown.repository.CityRepository;
import com.dependentdropdown.dependentdropdown.repository.CountryRepository;
import com.dependentdropdown.dependentdropdown.repository.StateRepository;
import com.dependentdropdown.dependentdropdown.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GeoController {

    @Autowired
    private CountryRepository countryrepo;


    @Autowired
    private CityRepository cityrepo;



    @Autowired
    private StateRepository staterepo;

    @Autowired
    private UserRepository userrepo;


    @GetMapping("/countries")
    public List<Countries> countryFetch(){
        return countryrepo.findAll();
    }

    @GetMapping("/state/{country_id}")
    public List<States> stateFetch(@PathVariable int country_id){
        return staterepo.findByCountryId(country_id);
    }

    @GetMapping("/city/{state_id}")
    public List<Cities> cityFetch(@PathVariable int state_id){
        return cityrepo.findByStateId(state_id);
    }



}

