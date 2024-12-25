package com.demoswagger.service;

import java.util.List;

import com.demoswagger.entity.Book;

public interface BookService {
 public void saveBook(Book book);
 public List<Book> getAllBook();
 
}
