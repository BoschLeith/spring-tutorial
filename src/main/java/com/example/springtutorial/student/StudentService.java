package com.example.springtutorial.student;

import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
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
