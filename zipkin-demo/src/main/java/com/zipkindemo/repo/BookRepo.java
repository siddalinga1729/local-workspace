package com.zipkindemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zipkindemo.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
