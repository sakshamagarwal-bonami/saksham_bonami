package com.valid.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Student {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Must contain alphabets only")
	private String firstName;
	
	@NotEmpty
	
	@Pattern(regexp = "^[a-zA-Z]+$",message = "Must contain alphabets only")
	private String lastName;
	
	@Email(message = "invalid email!!")
	private String emailId;
	
	@Pattern(regexp = "^[0-9]{10}$",message = "Must be a 10 digit number")
//	@Size(max = 10,min = 10)
	private String mobile;
	
	
	
}
