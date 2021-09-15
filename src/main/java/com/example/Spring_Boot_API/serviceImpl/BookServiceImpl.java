package com.example.Spring_Boot_API.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_Boot_API.entity.Book;
import com.example.Spring_Boot_API.repository.BookRepsitory;
import com.example.Spring_Boot_API.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepsitory bookRepsitory;

	@Override
	public void addBook(Book book) {
		bookRepsitory.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		// TODO Auto-generated method stub
		bookRepsitory.delete(book);
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		bookRepsitory.save(book);
	}

	@Override
	public List<Book> getAllBook() {
		// TODO Auto-generated method stub
		return bookRepsitory.findAll();
	}

	@Override
	public Book getBookById(Long id) {
		// TODO Auto-generated method stub
		return bookRepsitory.getById(id);
	}
}
