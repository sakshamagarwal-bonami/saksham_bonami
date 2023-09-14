package com.postgresconn.dao;

import javax.sound.midi.VoiceStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//create
	public void createTable() {
		var query="create table student(id serial primary key,name varchar(10) not null)";
		int update=this.jdbcTemplate.update(query);
		System.out.println(update);
	}
	
	//inserting data
	public void insertData(String name) {
		String q="insert into student(name) values(?)";
		int update=this.jdbcTemplate.update(q,name);
		System.out.println(update+"rows address");
	}
	

}
