package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] phones = new Phone[3];
		//phones[0].setName("아이폰"); 아직 인덱스 0번 값에 phone 값이 안들어간것
		
		//기본생성자
		phones[0] = new Phone();
		
		phones[0].setName("폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(10000);
		phones[0].setSeries("1");
		
		// 매개변수 생성자로 객체 생성 및 초기화
		phones [1] = new Phone("아이폰", "애플", 2000000, "16PRO");
		phones [2] = new Phone("갤럭시", "삼성", 1500000, "s25");
		
		
		// 총가격과 평균가격
		int total = 0;
		for(int i=0; i<phones.length; i++) {
			total += phones[i].getPrice();
			System.out.println(phones[i].information());
		}
		
		System.out.println("총가격 : " + total + "원");
		System.out.println("평균가 : " + total / phones.length + "원");
		
		// 사용자에게 구매하고자 하는 핸드폰명을 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		for(int i=0; i<phones.length; i++) {
			if(phones[i].getName().equals(buy)) {
				System.out.println("당신이 구매하고자 하는 휴대폰의 가격은 " + phones[i].getPrice());
			}
		}
		
	}

}
