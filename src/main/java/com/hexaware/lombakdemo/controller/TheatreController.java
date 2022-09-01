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

import com.hexaware.lombakdemo.entity.Theatre;
import com.hexaware.lombakdemo.service.ITheatreService;

@RestController
@RequestMapping("/api/theatre")
public class TheatreController {
	
	@Autowired
	private ITheatreService TheatreService;
	
	@PostMapping("/addtheatre")
	public ResponseEntity<String> addTheatre(@RequestBody Theatre Theatre){
		Theatre rTheatre = TheatreService.addTheatre(Theatre);
		if(rTheatre!=null)
			return new ResponseEntity<>("Successfully added Theatre",HttpStatus.OK);
		else
			return new ResponseEntity<>("Successfully not added Theatre",HttpStatus.NOT_FOUND);	
	}
	
	@GetMapping("/getallTheatres")
	public List<Theatre> getAllTheatres(){
		return TheatreService.getAllTheatres();
	}
	
}
