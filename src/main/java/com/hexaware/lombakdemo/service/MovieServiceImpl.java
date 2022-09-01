package com.hexaware.lombakdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lombakdemo.entity.Movie;
import com.hexaware.lombakdemo.repository.MovieRepository;

@Service
public class MovieServiceImpl implements IMovieService{
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public Movie addMovie(Movie movie) {
		
		return movieRepository.save(movie);
	}

	@Override
	public List<Movie> getAllMovies() {
		return movieRepository.findAll();
	}

	@Override
	public Movie addMovie1(String movieName, String language, String genre) {
		Movie movie = new Movie(movieName, language,genre);
		return movieRepository.save(movie);
	}

	@Override
	public Movie getMovieByName(String movieName) {
		return movieRepository.findByMovieName(movieName);
	}

	@Override
	public List<Movie> findByLanguageAndGenres(String language, String genres) {
		
		return movieRepository.findByLanguageAndGenres(language, genres);
	}

	@Override
	public List<Movie> findByLanguageOrGenres(String language, String genres) {
		return movieRepository.findByLanguageOrGenres(language, genres);
	}

}
