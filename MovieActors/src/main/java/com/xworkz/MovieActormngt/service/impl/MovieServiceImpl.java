package com.xworkz.MovieActormngt.service.impl;

import com.xworkz.MovieActormngt.dto.MovieDTO;
import com.xworkz.MovieActormngt.repository.MovieRepository;
import com.xworkz.MovieActormngt.service.MovieService;

public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void addMovie(MovieDTO movie) {
        movieRepository.addMovie(movie);
    }
}
