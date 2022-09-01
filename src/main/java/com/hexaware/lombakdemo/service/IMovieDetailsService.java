package com.hexaware.lombakdemo.service;

import java.util.List;

import com.hexaware.lombakdemo.entity.MovieDetails;

public interface IMovieDetailsService {

	MovieDetails addMovieDetails(MovieDetails movieDetails);

	List<MovieDetails> getAllMovieDetails();

}
