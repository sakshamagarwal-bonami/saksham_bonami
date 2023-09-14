package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entity.Rating;
import com.rating.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@Autowired
	RatingService service;
	
	@PostMapping("/create")
	public ResponseEntity<Rating> saveRating(@RequestBody Rating rating) {
		return new ResponseEntity<Rating>(service.createRating(rating),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<List<Rating>> getRatingByHotelId(@PathVariable Integer id){
		return new ResponseEntity<List<Rating>>(service.getRatingByHotelId(id),HttpStatus.OK);
	}
}
