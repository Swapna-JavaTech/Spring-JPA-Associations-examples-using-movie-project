package com.hexaware.lombakdemo.service;

import java.util.List;

import com.hexaware.lombakdemo.entity.Theatre;

public interface ITheatreService  {

	Theatre addTheatre(Theatre theatre);

	List<Theatre> getAllTheatres();

}
