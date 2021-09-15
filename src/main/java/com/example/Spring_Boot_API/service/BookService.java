package com.example.Spring_Boot_API.service;

import java.util.List;

import com.example.Spring_Boot_API.entity.Book;

public interface BookService {	
	public void addBook(Book book);
	public void deleteBook(Book book);
	public void updateBook(Book book);
	public List<Book> getAllBook();
	public Book getBookById(Long id);
}
