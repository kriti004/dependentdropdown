package com.dependentdropdown.dependentdropdown.repository;

import com.dependentdropdown.dependentdropdown.entities.Cities;
import com.dependentdropdown.dependentdropdown.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Countries,Integer> {

}
