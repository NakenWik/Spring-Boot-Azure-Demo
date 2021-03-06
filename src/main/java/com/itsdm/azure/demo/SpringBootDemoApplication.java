package com.itsdm.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

	@RequestMapping
	public String WelcomePage() {
		System.out.println("Hi..");
		return "Hello WellcomePage..";
	}
	@GetMapping("/message")
	public String message() {
		System.out.println("Hi..");
		return "Hello World..";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
