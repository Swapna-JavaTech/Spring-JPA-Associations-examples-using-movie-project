package com.hexaware.lombakdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.lombakdemo.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	public Movie findByMovieName(String movieName);
	public List<Movie> findByLanguageAndGenres(String language,String genres);
	public List<Movie> findByLanguageOrGenres(String language,String genres);
}
