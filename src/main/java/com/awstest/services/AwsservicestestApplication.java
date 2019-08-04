package com.awstest.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication
//@EnableWebSecurity
public class AwsservicestestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsservicestestApplication.class, args);
	}

}