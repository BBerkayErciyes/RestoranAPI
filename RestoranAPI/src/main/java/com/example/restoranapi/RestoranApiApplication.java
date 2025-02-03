package com.example.restoranapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.restoranapi", "com.interview"})
@EnableJpaRepositories(basePackages = "com.interview.repository")
@EntityScan(basePackages = "com.interview.domain")
public class RestoranApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestoranApiApplication.class, args);
	}

}
