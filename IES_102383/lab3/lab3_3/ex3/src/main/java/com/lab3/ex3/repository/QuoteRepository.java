package com.lab3.ex3.repository;

import java.util.List;

import com.lab3.ex3.model.Quote;
import com.lab3.ex3.model.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepository extends JpaRepository<Quote, Integer> {
  public List<Quote> findByMovie(Movie movie);
}