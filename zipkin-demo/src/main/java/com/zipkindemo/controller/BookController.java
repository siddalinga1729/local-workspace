package com.zipkindemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zipkindemo.entity.Book;
import com.zipkindemo.service.BookServiceImpl;

@RestController

public class BookController {
	@Autowired
	private BookServiceImpl bookServiceImpl;

//	@PostMapping("/addBook")
//	public String addNewBook(@RequestBody Book book) {
//		bookServiceImpl.saveBook(book);
//		return "added successfully";
//	}

	@RequestMapping(value = "/get",method = RequestMethod.GET)
	public String getAllBooks() {

		return "ZIPKIN";
	}
}
