package com.example.demo;

import com.example.demo.userInterface.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringDemo3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo3Application.class, args);
	}
	static {
		System.setProperty("spring.config.location","classpath:/application.yml,classpath:/application_env.yml");
	}
}
