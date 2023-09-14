package com.hotel.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

public class Rating {
	private Integer ratingId;
	private Integer ratingValue;
	
//	@Embedded
	private Integer hotelId;
}
