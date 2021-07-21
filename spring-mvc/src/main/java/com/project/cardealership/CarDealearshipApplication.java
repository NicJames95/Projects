package com.project.cardealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "com.project" )
public class CarDealearshipApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder
	configure(SpringApplicationBuilder application) {
		return application.sources(CarDealearshipApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CarDealearshipApplication.class, args);
	}

}
