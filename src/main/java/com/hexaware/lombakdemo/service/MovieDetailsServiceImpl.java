package com.hexaware.lombakdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lombakdemo.entity.MovieDetails;
import com.hexaware.lombakdemo.repository.MovieDetailsRepository;

@Service
public class MovieDetailsServiceImpl implements IMovieDetailsService {
	
	@Autowired
	private MovieDetailsRepository movieDetailsRepository;

	@Override
	public MovieDetails addMovieDetails(MovieDetails movieDetails) {
		return movieDetailsRepository.save(movieDetails);
	}

	@Override
	public List<MovieDetails> getAllMovieDetails() {
		return movieDetailsRepository.findAll();
	}

}
