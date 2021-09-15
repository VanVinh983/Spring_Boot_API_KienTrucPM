package com.example.Spring_Boot_API.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring_Boot_API.entity.Book;

public interface BookRepsitory extends JpaRepository<Book, Long>{

}
