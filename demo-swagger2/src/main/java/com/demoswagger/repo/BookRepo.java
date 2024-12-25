package com.demoswagger.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demoswagger.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
