package com.example.Spring_Boot_API.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String author;
	private int yearOfPublish;
	private Long countOfPage;
	public Book() {
		super();
	}
	public Book(String name, String author, int yearOfPublish, Long countOfPage) {
		super();
		this.name = name;
		this.author = author;
		this.yearOfPublish = yearOfPublish;
		this.countOfPage = countOfPage;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearOfPublish() {
		return yearOfPublish;
	}
	public void setYearOfPublish(int yearOfPublish) {
		this.yearOfPublish = yearOfPublish;
	}
	public Long getCountOfPage() {
		return countOfPage;
	}
	public void setCountOfPage(Long countOfPage) {
		this.countOfPage = countOfPage;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", yearOfPublish=" + yearOfPublish
				+ ", countOfPage=" + countOfPage + "]";
	}
	
	
	
	
	
 
}
