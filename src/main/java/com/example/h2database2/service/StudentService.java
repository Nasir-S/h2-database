package com.example.h2database2.service;

import com.example.h2database2.Student;
import com.example.h2database2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private final StudentRepo studentRepo;

	@Autowired
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}

	public Student save(String name){
		Student student = new Student();
		student.setName(name);
		return studentRepo.save(student);
	}
}
