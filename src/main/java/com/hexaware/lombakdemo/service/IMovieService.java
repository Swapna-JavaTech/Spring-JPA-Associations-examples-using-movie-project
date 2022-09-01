package com.hexaware.lombakdemo.service;

import java.util.List;



import com.hexaware.lombakdemo.entity.Movie;

public interface IMovieService {

	Movie addMovie(Movie movie);

	List<Movie> getAllMovies();

	Movie addMovie1(String movieName, String language, String genre);

	Movie getMovieByName(String movieName);

	List<Movie> findByLanguageAndGenres(String language, String genres);

	List<Movie> findByLanguageOrGenres(String language, String genres);

}
