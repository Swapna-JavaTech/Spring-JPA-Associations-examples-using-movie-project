package com.hexaware.lombakdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.lombakdemo.entity.Movie;
import com.hexaware.lombakdemo.service.IMovieService;

@RestController
@RequestMapping("/api/movie")
public class MovieController {
	
	@Autowired
	private IMovieService movieService;
	
	@PostMapping("/addmovie")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie){
		Movie rmovie = movieService.addMovie(movie);
		if(rmovie!=null)
			return new ResponseEntity<>("Successfully added Movie",HttpStatus.OK);
		else
			return new ResponseEntity<>("Successfully not added Movie",HttpStatus.NOT_FOUND);	
	}
	
	@GetMapping("/getallmovies")
	public List<Movie> getAllMovies(){
		return movieService.getAllMovies();
	}
	
	@PostMapping("/addmovie1/{moviename}/{language}/{genre}")
	public ResponseEntity<String> addMovie1(@PathVariable("moviename") String movieName,
			@PathVariable("language") String language,@PathVariable("genre") String genre){
		//Movie movie = new Movie(movieName, language,genre);
		//Movie rmovie = movieService.addMovie(movie);
		Movie rmovie = movieService.addMovie1(movieName, language,genre);
		if(rmovie!=null)
			return new ResponseEntity<>("Successfully added Movie",HttpStatus.OK);
		else
			return new ResponseEntity<>("Successfully not added Movie",HttpStatus.NOT_FOUND);	
	}
	
	@GetMapping("/getmoviebyname/{moviename}")
	public Movie getMovieByName(@PathVariable("moviename") String movieName){
		return movieService.getMovieByName(movieName);
	}
	
	@GetMapping("/findbylanguageandgenres/{language}/{genres}")
	public List<Movie> findByLanguageAndGenres(@PathVariable("language") String language,
			@PathVariable("genres") String genres){
		return movieService.findByLanguageAndGenres(language,genres);
	}
	
	@GetMapping("/findbylanguageorgenres/{language}/{genres}")
	public List<Movie> findByLanguageOrGenres(@PathVariable("language") String language,
			@PathVariable("genres") String genres){
		return movieService.findByLanguageOrGenres(language,genres);
	}

}
