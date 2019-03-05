package com.pr.student.dal.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pr.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer > {

	Optional<Student> findByUserid(int i);

}
