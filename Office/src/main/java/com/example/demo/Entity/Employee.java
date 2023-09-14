package com.example.demo.Entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@IdClass(EmpId.class)
public class Employee {

	@EmbeddedId
	private EmpId id;

	private String name;
	private Integer age;
}
