package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	public void InputTest1() {
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner를 사용
		 * 즉 java.util.Scanner 클래스를 이용
		 * Scanner 클래스 내부의 메소드를 호출하여 입력 받을 것
		 */
		
		// 스캐너 클래스의 객체 생성
		// 클래스명 별치 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		// System.in은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		// System.out => 출력 시
		
		System.out.print("아무거나 : ");
		String message = sc.nextLine();
		
		System.out.println("입력받은 내용 : " + message);
		
		sc.close();
		
		
	}
	
	public void InputTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (next(공백 포함x), nextLine(공백 포함o))
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.println(name);
		
		System.out.print("당신의 나이는? : ");
		int age = sc.nextInt();  // 사용자가 입력한 값을 정수로 받음
		
		System.out.print("당신의 키는?(소수점까지) : ");
		double height = sc.nextDouble();
		
	}
}
