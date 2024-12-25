package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public String addStudent(Student student) {
		try {
			studentRepo.save(student);
			return "Saved Successfully";
		}catch (Exception e) {
			return "Not Saved...!";

		}
		
	}

	@Override
	public List<Student> getAll() {

		return studentRepo.findAll();
	}

}
