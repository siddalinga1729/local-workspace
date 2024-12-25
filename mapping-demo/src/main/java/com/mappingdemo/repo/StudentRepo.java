package com.mappingdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mappingdemo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
