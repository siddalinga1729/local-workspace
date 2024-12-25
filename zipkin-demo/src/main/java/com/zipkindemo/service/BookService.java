package com.zipkindemo.service;

import java.util.List;

import com.zipkindemo.entity.Book;

public interface BookService {
 public void saveBook(Book book);
 public List<Book> getAllBook();
 
}
