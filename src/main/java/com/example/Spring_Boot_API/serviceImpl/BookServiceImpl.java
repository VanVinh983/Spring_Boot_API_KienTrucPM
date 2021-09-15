package com.example.Spring_Boot_API.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Spring_Boot_API.repository.BookRepsitory;
import com.example.Spring_Boot_API.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookRepsitory bookRepsitory;
}
