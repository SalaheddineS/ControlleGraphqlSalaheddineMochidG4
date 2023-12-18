package com.example.demo;

import com.example.demo.dao.entities.User;
import com.example.demo.dao.repositories.UserRepository;
import com.example.demo.service.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class DemoApplication {
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
			User user1 = User.builder()
					.email("salaheddine@gmail.com")
					.password("123456")
					.date(new Date().toString())
					.name("salaheddine")
					.build();
			User user2 = User.builder()
					.email("dsfgsdfg@gmail.com")
					.password("123456")
					.date(new Date().toString())
					.name("saifeddine")
					.build();
			User user3 = User.builder()
					.email("azertyuiop@gmail.com")
					.password("965696")
					.date(new Date().toString())
					.name("toxa")
					.build();
			User user4 = User.builder()
					.email("kafka@gmail.com")
					.password("965sdfsd696")
					.date(new Date().toString())
					.name("lolz")
					.build();
			userRepository.save(user1);
			userRepository.save(user2);
			userRepository.save(user3);
			userRepository.save(user4);
			};

	}

}
