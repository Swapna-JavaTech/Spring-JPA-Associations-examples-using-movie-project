package com.hexaware.lombakdemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "moviedetails_info")
public class MovieDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieDetailsId;
	
	
	private String movieActress;
	
	private String movieActor;
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
	}

	public Long getMovieDetailsId() {
		return movieDetailsId;
	}

	public void setMovieDetailsId(Long movieDetailsId) {
		this.movieDetailsId = movieDetailsId;
	}

	public String getMovieActress() {
		return movieActress;
	}

	public void setMovieActress(String movieActress) {
		this.movieActress = movieActress;
	}

	public String getMovieActor() {
		return movieActor;
	}

	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}

	public MovieDetails(String movieActress, String movieActor) {
		super();
		this.movieActress = movieActress;
		this.movieActor = movieActor;
	}
	
	

}
