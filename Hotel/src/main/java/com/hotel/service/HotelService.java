package com.hotel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hotel.entity.Hotel;
import com.hotel.entity.Rating;
import com.hotel.repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	private HotelRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//get
	public Hotel getHotelById(Integer id) {
		Hotel hotel=repo.findById(id).orElseThrow();
		List<Rating> ratings=this.restTemplate.getForObject("http://rating-service/rating/"+id,List.class);
				hotel.setRatings(ratings);
		return hotel;
	}
	
	//post
	public Hotel createHotel(Hotel hotel) {
		return repo.save(hotel);
		
	}
	
	
}
