package com.demoswagger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoswagger.entity.Book;
import com.demoswagger.service.BookServiceImpl;

@RestController
public class BookController {
	@Autowired
	private BookServiceImpl bookServiceImpl;

	@PostMapping("/addBook")
	public String addNewBook(@RequestBody Book book) {
		bookServiceImpl.saveBook(book);
		return "added successfully";
	}
	
	@GetMapping("/get-all")
	public List<Book> getAllBooks() {
		
		return bookServiceImpl.getAllBook();
	}
}
