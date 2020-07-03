package com.jk.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Books {

	private Integer bookId;
	private String bookName;
	private Integer bookPrice;
	private String bookAuthor;
	
	public Books(Integer bookId, String bookName, Integer bookPrice, String bookAuthor) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookAuthor = bookAuthor;
	}
	
}
