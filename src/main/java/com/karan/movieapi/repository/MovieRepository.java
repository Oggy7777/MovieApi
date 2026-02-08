package com.karan.movieapi.repository;

import com.karan.movieapi.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {

    private final List<Movie> movieList = new ArrayList<>();

    public Movie save(Movie movie) {
        movieList.add(movie);
        return movie;
    }

    public Optional<Movie> findById(Long id) {
        return movieList.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }

    public List<Movie> findAll() {
        return movieList;
    }
}
