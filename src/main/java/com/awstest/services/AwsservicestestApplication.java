package com.awstest.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
//@EnableWebSecurity
public class AwsservicestestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsservicestestApplication.class, args);
	}

}