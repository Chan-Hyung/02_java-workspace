package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {

	public static void main(String[] args) {
		// 방법 1. 기본 생성자로 생성한 후 setter 메소드 호출해서 값 초기화
		/*
		Book bk = new Book();
		bk.setTitel("자바의 정석");
		bk.setAuthor("차은우");
		bk.setPrice(10000);
		bk.setPublisher("kh 출판사");
		*/
		
		// 방법 2. 매개변수 생성자를 통해서 생성과 동시에 값을 초기화
		//Book bk = new Book("자바의 정성", "차은우", 10000, "kh출판사");
		
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.println("도서명 : ");
		String title = scan.nextLine();
		System.out.println("저자명 : ");
		String author = scan.nextLine();
		System.out.println("가격 : ");
		int price = scan.nextInt();
		scan.nextLine();
		System.out.println("출판사 : ");
		String publisher = scan.nextLine();

		
		Book bk = new Book(title, author, price, publisher);
		
		System.out.println(bk.information());
		*/
		
		// 3권
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + "번째 도서 정보 입력");
			System.out.print("도서명 : ");
			String title = scan.nextLine();
			System.out.print("저자명 : ");
			String author = scan.nextLine();
			System.out.print("가격 : ");
			int price = scan.nextInt();
			scan.nextLine();
			System.out.print("출판사 : ");
			String publisher = scan.nextLine();
			
			if(i == 0) {
				bk1 = new Book(title, author, price, publisher);
			}else if(i == 1) {
				bk2 = new Book(title, author, price, publisher);
			}else {
				bk3 = new Book(title, author, price, publisher);
			}
		}
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		
		System.out.print("검색할 책제목 : ");
		String search = scan.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.information());
		}
		
		if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.information());
		}
		
		if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.information());
		}
	
	
	}

}
