package com.example.demo.Entity;

import java.io.Serializable;

//import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EmpId implements Serializable{
	
	private Integer companyId;

	//@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;

}
