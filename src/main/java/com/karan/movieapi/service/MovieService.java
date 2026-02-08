package com.karan.movieapi.service;

import com.karan.movieapi.model.Movie;
import com.karan.movieapi.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    // ADD MOVIE
    public Movie addMovie(Movie movie) {
        return repository.save(movie);
    }

    // GET MOVIE BY ID
    public Optional<Movie> getMovie(Long id) {
        return repository.findById(id);
    }

    // GET ALL MOVIES
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
