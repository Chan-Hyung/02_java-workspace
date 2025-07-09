package com.kh.library.controller;

import java.util.ArrayList;

import com.kh.library.model.vo.Book;
import com.kh.library.model.vo.Magazine;

//BookManager 인터페이스 구현
public class BookController implements BookManager  {
	private ArrayList<Book> bList = new ArrayList<Book>();
	@Override
	public void addBook(Book nBook) {
		bList.add(nBook);
		
	}

	@Override
	public ArrayList<Book> getAllBook() {
		return bList;
	}

	
	@Override
	public Book searchBookBybNo(String bNo) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		for(int i=0; i<bList.size(); i++) {
			if(bList.get(i).getbNo().equals(bNo)) {
				searchList.add(bList.get(i));
			}
		}
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) {
		return null;
	}

	@Override
	public ArrayList<Book> onlySearchBook() {
		ArrayList<Book> list = new ArrayList<Book>();
		for(int i=0; i<bList.size(); i++) {
			Book b = bList.get(i);
			if(!(b instanceof Magazine)) {
				list.add(b);
			}
			
		}
		return list;
	}

	@Override
	public ArrayList<Book> onlySearchMagazine() {
		ArrayList<Book> list = new ArrayList<Book>();
		for(int i=0; i<bList.size(); i++) {
			Book b = bList.get(i);
			if(b instanceof Magazine) {
				list.add(b);
			}
			
		}
		return list;
	}

	@Override
	public ArrayList<Book> magazineOfThisYearInfo(int year) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPublisher(String publisher) {
		return null;
	}

	@Override
	public ArrayList<Book> searchBookByPrice(int price) {
		return null;
	}

	@Override
	public int getTotalPrice() {
		return 0;
	}

	@Override
	public int getAvgPrice() {
		return 0;
	}


	

}
