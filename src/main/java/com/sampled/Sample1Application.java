package com.sampled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Sample1Application {
	
	@GetMapping
	public Student getStudent() {
		return new Student(1,"srikanth");
		
	}

	public static void main(String[] args) {
		SpringApplication.run(Sample1Application.class, args);
	}

}
