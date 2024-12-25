package com.demoswagger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoswagger.entity.Book;
import com.demoswagger.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookRepo;

	@Override
	public void saveBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		return bookRepo.findAll();
	}

}
