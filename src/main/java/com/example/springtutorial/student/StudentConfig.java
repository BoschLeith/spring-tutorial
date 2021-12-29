package com.example.springtutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository){
		return args -> {
			Student bosch = new Student(
					1L,
					"Bosch",
					"bosch@email.com",
					LocalDate.of(1993, MARCH, 18),
					28
			);

			Student brooke = new Student(
					"Brooke",
					"brooke@email.com",
					LocalDate.of(1992, DECEMBER, 17),
					29
			);

			repository.saveAll(
					List.of(bosch, brooke)
			);
		};
	}
}
