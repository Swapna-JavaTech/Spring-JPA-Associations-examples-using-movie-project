package com.hexaware.lombakdemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "show_info")
public class Show {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long showId;
	
	private Date showStartDate;
	
	public Show() {
		// TODO Auto-generated constructor stub
	}

	public Show(Long showId, Date showStartDate) {
		super();
		this.showId = showId;
		this.showStartDate = showStartDate;
	}

	public Show(Date showStartDate) {
		super();
		this.showStartDate = showStartDate;
	}

	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public Date getShowStartDate() {
		return showStartDate;
	}

	public void setShowStartDate(Date showStartDate) {
		this.showStartDate = showStartDate;
	}
	
	

}
