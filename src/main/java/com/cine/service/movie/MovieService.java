package com.cine.service.movie;

import com.cine.model.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> getAllMovies();
    Movie saveMovie(Movie movie);
}
