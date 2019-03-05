package com.pr.student.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pr.student.dal.entities.Student;
import com.pr.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SudentdalApplicationTests {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@Test
//	public void testCreateStudent() {
//		Student student = new Student();
//		student.setUname("test");
//		student.setMobno(133);
//		studentRepository.save(student);
//		System.out.println(student);
//		}
	
	@Test
	public void selectTest() {
	System.out.print(studentRepository.findByUserid(2).get());
	}
	
//	@Test 
//	public void updateTest() {
//		Student student =studentRepository.findByUserid(2).get();
//		student.setUname("prabha");
//		studentRepository.save(student);
//	}
	
//	@Test
//	public void testCreateStudent() {
//		Student student = new Student();
//		student.setUserid(2);
//		studentRepository.delete(student);
//	}
}
