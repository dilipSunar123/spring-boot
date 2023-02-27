package com.example.JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

}
