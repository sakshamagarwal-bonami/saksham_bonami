package com.rating.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ratingId;
	private Integer ratingValue;
	
	private Integer hotelId;
}
