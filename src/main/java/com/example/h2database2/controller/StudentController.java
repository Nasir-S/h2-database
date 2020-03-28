package com.example.h2database2.controller;

import com.example.h2database2.Student;
import com.example.h2database2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	private final StudentService studentService;

	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	//use post instead of GET
	@GetMapping("/{name}")
	public Student save(@PathVariable String name) {
		return studentService.save(name);
	}
}
