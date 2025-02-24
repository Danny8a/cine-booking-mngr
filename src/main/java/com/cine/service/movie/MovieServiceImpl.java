package com.cine.service.movie;

import com.cine.model.Movie;
import com.cine.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    @Transactional
    public List<Movie> getAllMovies() {
        return this.movieRepository.findAll();
    }

    @Override
    @Transactional
    public Movie saveMovie(Movie movie) {
        return this.movieRepository.save(movie);
    }
}
