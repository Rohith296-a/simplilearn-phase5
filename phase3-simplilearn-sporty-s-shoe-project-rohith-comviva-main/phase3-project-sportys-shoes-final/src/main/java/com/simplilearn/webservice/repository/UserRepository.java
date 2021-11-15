package com.simplilearn.webservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simplilearn.webservice.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
