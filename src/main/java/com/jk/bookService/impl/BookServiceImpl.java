package com.jk.bookService.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jk.bookService.BookService;
import com.jk.model.Books;

@Service
public class BookServiceImpl implements BookService {

	/*
	 * getting all book object form the db and return the list of books
	 */
	@Override
	public List<Books> findAllBooks() {

		List<Books> booksList = new ArrayList<Books>();
		booksList.add(new Books(1, "Math", 200, "Auther-1"));
		booksList.add(new Books(2, "English", 200, "Auther-2"));
		booksList.add(new Books(3, "Hindi/Sanskrit", 200, "Auther-3"));
		booksList.add(new Books(4, "Resional Language", 200, "Auther-4"));
		return booksList;

	}

}
