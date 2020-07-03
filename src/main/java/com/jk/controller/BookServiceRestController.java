package com.jk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jk.bookService.BookService;
import com.jk.model.Books;

@RestController
@RequestMapping("/books/controller")
@CrossOrigin(origins = "*")
public class BookServiceRestController {
		
	
	@Autowired
	private BookService bookService;
	
	
	//@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE, path = "/getBooks")
	public ResponseEntity<List<Books>> getAllBooks(){
		
		List<Books> booksList =  bookService.findAllBooks();
		return new ResponseEntity<List<Books>>(booksList, HttpStatus.OK);
	}
	
}
