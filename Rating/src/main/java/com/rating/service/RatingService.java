package com.rating.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rating.entity.Rating;
import com.rating.repository.RatingRepository;

@Service
public class RatingService {
	@Autowired
	RatingRepository repo;
	
	@Autowired
	RestTemplate restTemplate;
	
	//post
	public Rating createRating(Rating rating) {
		Integer hotelId=rating.getHotelId();
		
		this.restTemplate.getForObject("http://hotel-service/"+hotelId,hotelId.class)
		this.restTemplate.
		return repo.save(rating);
	}
	
	//get
	public List<Rating> getRatingByHotelId(Integer hotelId) {
		return repo.findAll().stream().filter(rating->rating.getHotelId().equals(hotelId)).collect(Collectors.toList());
	}
	
	
}
