package com.dependentdropdown.dependentdropdown.repository;

import com.dependentdropdown.dependentdropdown.entities.Countries;
import com.dependentdropdown.dependentdropdown.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

}
