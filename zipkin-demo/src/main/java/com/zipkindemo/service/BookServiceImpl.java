package com.zipkindemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.zipkindemo.entity.Book;
import com.zipkindemo.repo.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepo bookRepo;
@Autowired
private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	@Override
	public void saveBook(Book book) {
		bookRepo.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		MapSqlParameterSource parameters=new MapSqlParameterSource();
		parameters.addValue("id",1);
		String query="select * from book where id=:id";
		List<Book> query2 = namedParameterJdbcTemplate.query(query,parameters, new BeanPropertyRowMapper<Book>());
		return bookRepo.findAll();
	}

}
