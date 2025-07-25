package com.kh.chap03_override.model.vo;

public class Book /*extends object -> 원래 있는데 생략한 거임*/{
	private String title;
	private String author;
	private int price;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return title + ", " + author + ", " + price;
	}
	
}
