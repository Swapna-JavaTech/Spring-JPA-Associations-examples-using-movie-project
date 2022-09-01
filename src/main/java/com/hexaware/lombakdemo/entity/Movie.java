package com.hexaware.lombakdemo.entity;


import java.util.ArrayList;
import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "movie_info")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	
	private String movieName;
	
	private String language;
	
	private String genres;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="movietheatre_fkid" ,referencedColumnName = "movieId")
	List<Theatre> theatres = new ArrayList<>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="movie_details_fkid")
	private MovieDetails movieDetails;
	
	public MovieDetails getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}

	public List<Theatre> getTheatres() {
		return theatres;
	}

	public void setTheatres(List<Theatre> theatres) {
		this.theatres = theatres;
	}

	public Movie(String movieName, String language, String genres, List<Theatre> theatres) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.genres = genres;
		this.theatres = theatres;
	}

	
	public Movie(String movieName, String language, String genres) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.genres = genres;
	}
	
	

	public Movie(String movieName, String language, String genres, List<Theatre> theatres, MovieDetails movieDetails) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.genres = genres;
		this.theatres = theatres;
		this.movieDetails = movieDetails;
	}

	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Movie(Long movieId, String movieName, String language) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.language = language;
	}

	public Movie(String movieName, String language) {
		super();
		this.movieName = movieName;
		this.language = language;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	
	
}
