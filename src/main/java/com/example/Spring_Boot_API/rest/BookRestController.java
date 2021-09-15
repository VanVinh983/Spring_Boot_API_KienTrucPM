package com.example.Spring_Boot_API.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_Boot_API.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService bookService;
}
