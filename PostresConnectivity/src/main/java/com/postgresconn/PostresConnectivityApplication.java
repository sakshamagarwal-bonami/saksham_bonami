package com.postgresconn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.postgresconn.dao.StudentDao;

@SpringBootApplication
public class PostresConnectivityApplication implements CommandLineRunner{
	
	@Autowired
	private StudentDao studentDao;
	public static void main(String[] args) {
		SpringApplication.run(PostresConnectivityApplication.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception{
//		this.studentDao.createTable();
		this.studentDao.insertData("Saksham Agarwal");
	}
	
	

}
