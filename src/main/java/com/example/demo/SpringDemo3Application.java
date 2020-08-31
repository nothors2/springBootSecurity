package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo3Application.class, args);
	}
	static {
		System.setProperty("spring.config.location","classpath:/application.yml,classpath:/application_env.yml");
	}
}
