package com.lab3.ex3.repository;

import java.util.List;

import com.lab3.ex3.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
  public List<Movie> findByName(String name);
}
