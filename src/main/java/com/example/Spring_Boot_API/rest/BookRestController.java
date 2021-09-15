package com.example.Spring_Boot_API.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_API.entity.Book;
import com.example.Spring_Boot_API.service.BookService;

@RestController
@RequestMapping("/api")
public class BookRestController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public List<Book> findAllBook() {
		return bookService.getAllBook();
	}
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return book;
	}
	@DeleteMapping("/book/{id}")
	public String deleteBook(@PathVariable("id") Long id) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			throw new RuntimeException("book id not found - "+id);
		}else {
			bookService.deleteBook(book);
			return "delete sucessfull id "+id;
		}
	}
	@PutMapping("/book/{id}")
	public Book update(@RequestBody Book book, @PathVariable("id") Long id) {
		if (book == null) {
			throw new RuntimeException("book null");
		}else {
			book.setId(id);
			bookService.updateBook(book);
			return book;
		}
	}
}
