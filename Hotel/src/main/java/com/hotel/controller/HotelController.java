package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	@Autowired
	private HotelService service;
	
	@PostMapping("/create")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel){
		return new ResponseEntity<Hotel>(service.createHotel(hotel),HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Hotel> getById(@PathVariable Integer id){
		
		return new ResponseEntity<Hotel>(service.getHotelById(id),HttpStatus.OK);
	}
	
}
