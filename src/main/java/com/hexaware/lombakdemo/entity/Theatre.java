package com.hexaware.lombakdemo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "theatre_info")
public class Theatre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "theatre_info")
	private Long theatreId;
	
	@Column(name = "theatre_name")
	private String theatreName;
	
	@Column(name = "theatre_loc")
	private String theatreLocation;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	(
		name="theatre_shows",
		joinColumns = {
		@JoinColumn(name = "theatre_id")
		},
		inverseJoinColumns = {
		@JoinColumn(name = "show_id")
		}
	)
	Set<Show> shows = new HashSet<Show>();
	
	public Set<Show> getShows() {
		return shows;
	}

	public void setShows(Set<Show> shows) {
		this.shows = shows;
	}

	public Theatre() {
		// TODO Auto-generated constructor stub
	}

	public Theatre(Long theatreId, String theatreName, String theatreLocation) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
	}

	public Theatre(String theatreName, String theatreLocation) {
		super();
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
	}

	
	public Theatre(String theatreName, String theatreLocation, Set<Show> shows) {
		super();
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
		this.shows = shows;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreLocation() {
		return theatreLocation;
	}

	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}
	
	

}
