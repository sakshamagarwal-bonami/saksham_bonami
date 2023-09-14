package com.ims.entity;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer rollNo;
	
	private String name;
	
	private String branch;
	
	private String city;
	
	

}
