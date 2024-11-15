package com.dependentdropdown.dependentdropdown.controller;

import com.dependentdropdown.dependentdropdown.entities.*;
import com.dependentdropdown.dependentdropdown.repository.CityRepository;
import com.dependentdropdown.dependentdropdown.repository.CountryRepository;
import com.dependentdropdown.dependentdropdown.repository.StateRepository;
import com.dependentdropdown.dependentdropdown.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class GeoController2 {

    @Autowired
    private CountryRepository countryrepo;


    @Autowired
    private CityRepository cityrepo;



    @Autowired
    private StateRepository staterepo;

    @Autowired
    private UserRepository userrepo;



//    @RequestMapping(path = "/confirmed", method = RequestMethod.POST)
//    public String fetch(@RequestParam("country") String country,
//                        @RequestParam("state") String state,
//                        @RequestParam("city") String city, Model model) {
//
//        model.addAttribute("country", country);
//        model.addAttribute("state", state);
//        model.addAttribute("city", city);
//
//        return "confirm";
//    }

        @PostMapping("/confirmed")
        public String confirmSelection(@ModelAttribute("form") FormData formData, Model model) {
           String user = formData.getUsername();
           int countryID = formData.getCountryId();
            int stateID = formData.getStateId();
            int cityID = formData.getCityId();

            Optional<Countries> countriesOptional = countryrepo.findById(formData.getCountryId());
            Optional<States> statesOptional = staterepo.findById(formData.getStateId());
            Optional<Cities> citiesOptional = cityrepo.findById(formData.getCityId());
            String name = formData.getUsername();

            String countryNameName = null;
            if (countriesOptional.isPresent()) {
                Countries countryName = countriesOptional.get();
                countryNameName = countryName.getName();
            }
            else{
                Countries countryName = null;
            }

            String stateNameName = null;
            if (statesOptional.isPresent()) {
                States stateName = statesOptional.get();
                stateNameName = stateName.getName();
            }
            else{
                States statesName = null;
            }

            String cityNameName = null;
            if (citiesOptional.isPresent()) {
                Cities citiesName = citiesOptional.get();
                cityNameName = citiesName.getName();
            }
            else{
                Cities citiesName = null;
            }
            User user1 = new User(user,countryNameName,cityNameName,stateNameName);
            userrepo.save(user1);
            Finalform finalform = new Finalform(formData.getUsername(),countryNameName, stateNameName, cityNameName);
//            Country countryObj = new Country(count);


           model.addAttribute("finalform", finalform);
            System.out.println(finalform);
            return "confirm";
        }


}

