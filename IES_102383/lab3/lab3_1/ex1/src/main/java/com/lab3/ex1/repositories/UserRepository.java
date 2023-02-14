package com.lab3.ex1.repositories;

import com.lab3.ex1.entities.User;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String name);
} 
