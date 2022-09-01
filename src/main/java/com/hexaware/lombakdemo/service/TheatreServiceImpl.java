package com.hexaware.lombakdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.lombakdemo.entity.Theatre;
import com.hexaware.lombakdemo.repository.TheatreRepository;

@Service
public class TheatreServiceImpl implements ITheatreService {
	
	@Autowired
	private TheatreRepository theatreRepository;

	@Override
	public Theatre addTheatre(Theatre theatre) {
		return theatreRepository.save(theatre);
	}

	@Override
	public List<Theatre> getAllTheatres() {
		return theatreRepository.findAll();
	}

}
