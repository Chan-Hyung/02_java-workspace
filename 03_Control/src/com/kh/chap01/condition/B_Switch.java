package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	/*
	 * - switch문도 if문과 동일하게 조건문
	 * if문과 차이점 : if문은 조건식을 자류롭게 기술 가능하지만 switch문은 동등비교로 밖에 안됨
	 * 
	 * [표현법]
	 * switch(동등비교할대상) 
	 * case 값1 : 실행코드;
	 * case 값2 : 실행코드;
	 * ...
	 * default : 위의 값들과 모두 일치하지 않을 경우 실행 코드 => if문에서 else와 같은 존재
	 * 
	 */
	
	Scanner scan = new Scanner(System.in );

	public void method1() {
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("파란색");
			break;
		case 3:
			System.out.println("초록색");
			break;
		default:
			System.out.println("잘못 입력");	
		}
	}
	
	public void method2() {
		System.out.print("과일 입력(사과, 바나나, 복숭아) : ");
		String fruit = scan.nextLine();
		int price = 0;
		
		switch(fruit) {
		case "사과" : price = 1000; 
			break;
		case "바나나" : price = 2000; 
			break;
		case "복숭아" : price = 3000; 
			break;
		default : System.out.println("해당과일은 없습니다.");
		return;
		}
		System.out.println("가격 : " + price + "원");
	}
	
	public void method3() {
		// 등급별 권한
		// 1. 관리권한, 글쓰기 권한, 읽기 권한
		// 2. 글쓰기 권한, 읽기 권한
		// 3. 읽기 권한
		System.out.print("등급별 권한 : ");
		int level = scan.nextInt();
		
		switch(level) {
		case 1 : System.out.println("관리권한");
		case 2 : System.out.println("글쓰기 권한");
		case 3 : System.out.println("읽기 권한");
		
		}
	}
	
	public void method4() {
		System.out.print("1월~12월까지 중 하나를 입력(정수로) : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 : System.out.println("입력하신 월은 31일 까지 ");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 : System.out.println("입력하신 월은 30일 까지");
			break;
		case 2 : System.out.println("입력하신 월은 28일, 29일까지");
			break;
		default : System.out.println("잘못 입력");
		}
	}

}
