package com.springbootsc.springsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.springbootsc.springsc.repositories")
public class SpringscApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringscApplication.class, args);
	}
}
