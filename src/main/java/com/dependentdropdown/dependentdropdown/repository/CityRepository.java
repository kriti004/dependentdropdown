package com.dependentdropdown.dependentdropdown.repository;

import com.dependentdropdown.dependentdropdown.entities.Cities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<Cities,Integer> {
    List<Cities> findByStateId(int state_id);
}

