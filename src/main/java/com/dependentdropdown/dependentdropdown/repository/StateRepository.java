package com.dependentdropdown.dependentdropdown.repository;

import com.dependentdropdown.dependentdropdown.entities.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<States,Integer> {
    List<States> findByCountryId(int country_id);
}
