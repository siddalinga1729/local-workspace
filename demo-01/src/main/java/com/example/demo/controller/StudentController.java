package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;

	@GetMapping("{name}")
	public String getMsg(@PathVariable String name) {
		return "Hello " + name + " Welcome...!";
	}
	@GetMapping("")
	public List<Student> getAll() {
		return studentService.getAll();
	}
	@PostMapping("")
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

}
