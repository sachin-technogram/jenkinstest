package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinstestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinstestApplication.class, args);
		System.out.println("Jenkins application started");
		//Just a single line comment
	}

}

