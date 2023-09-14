package com.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HotelRatingGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelRatingGatewayApplication.class, args);
	}

}
