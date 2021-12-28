package com.example.springtutorial.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
	public List<Student> getStudents(){
		return List.of(
				new Student(
						1L,
						"Bosch",
						"bosch@email.com",
						LocalDate.of(1993, Month.MARCH, 18),
						28
				)
		);
	}
}
