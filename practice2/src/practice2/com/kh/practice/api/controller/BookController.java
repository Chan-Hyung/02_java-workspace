package practice2.com.kh.practice.api.controller;

import java.util.Date;

import practice2.com.kh.practice.api.model.vo.Book;

public class BookController {

	private Book[] b = new Book[6];
	
	{
		b[0] = new Book("자바의정석", "차은우", "나무", new Date(2023, 6-1, 14), 10000);
		b[1] = new Book("여러분 파이팅", "주지훈", "사과", new Date(2023, 5-1, 11), 20000);
		b[2] = new Book("API의 모든 것", "문동은", "오렌지", new Date(2020, 4-1, 25), 35000);
		b[3] = new Book("언어의 천재", "장원영", "키위", new Date(2015, 1-1, 1), 70000);
		b[4] = new Book("개발왕국", "시연쌤", "바나나",  new Date(2022, 12-1, 25), 80000);
	}
	
	
	public BookController() {
		
	}
	
	public void printAll() {
		/*
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		*/
		
		for(Book i: b) { // 다시 공부
			if(i != null)
				continue;
		}
		
	}
	
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		int price = Integer.parseInt(newDate);
	}
	
	public void printBookPublisherDate() {
		
	}
	
	public void searchBook() {
		
	}

}
