package com.vkakarla.springboot.restdemo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.vkakarla.springboot.restdemo")
public class GSpringRestDemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GSpringRestDemoAppApplication.class, args);
	}

}
