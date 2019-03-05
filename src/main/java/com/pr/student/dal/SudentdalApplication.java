package com.pr.student.dal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pr.student.dal.entities.Student;
import com.pr.student.dal.repos.StudentRepository;

@SpringBootApplication
public class SudentdalApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(SudentdalApplication.class, args);
		
	}

}
