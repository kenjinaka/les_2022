package com.kenji.les;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class LesApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LesApplication.class, args);
	}

}
