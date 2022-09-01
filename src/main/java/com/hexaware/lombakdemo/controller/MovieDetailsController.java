package com.hexaware.lombakdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.lombakdemo.entity.MovieDetails;
import com.hexaware.lombakdemo.service.IMovieDetailsService;



@RestController
@RequestMapping("/api/moviedetails")
public class MovieDetailsController {
	@Autowired
	private IMovieDetailsService movieDetailsService;
	
	@PostMapping("/addmoviedetails")
	public ResponseEntity<String> addMovieDetails(@RequestBody MovieDetails movieDetails){
		MovieDetails rmovieDetails = movieDetailsService.addMovieDetails(movieDetails);
		if(rmovieDetails!=null)
			return new ResponseEntity<>("Successfully added MovieDetails",HttpStatus.OK);
		else
			return new ResponseEntity<>("Successfully not added MovieDetails",HttpStatus.NOT_FOUND);	
	}
	
	@GetMapping("/getallmoviedetails")
	public List<MovieDetails> getAllMovieDetails(){
		return movieDetailsService.getAllMovieDetails();
	}
	
}
