package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Book[] books = new Book[3];
		for(int i=0; i<books.length; i++) {
			System.out.println(i+1 + "번째 도서정보 입력");
			System.out.print("도서명 : ");
			String title = scan.nextLine();
			System.out.print("저자명 : ");
			String author = scan.nextLine();
			System.out.print("가격 : ");
			int price = scan.nextInt();
			scan.nextLine();
			System.out.print("출판사 : ");
			String publisher = scan.nextLine();
			
			books[i] = new Book(title, author, price, publisher);
			
		}
		
		// 전체 도서 조회
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].information());
		}
		
		System.out.print("검색할 책 제목 : ");
		String search = scan.nextLine();
		
		for(int i=0; i<books.length; i++) {
			if(books[i].getTitle().equals(search)) {
				System.out.println(books[i].information());
			}
		}
		
	}

}
