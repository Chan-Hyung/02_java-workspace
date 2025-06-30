package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	Scanner scan = new Scanner(System.in);
	/*
	 * - break; : 반복문 안에 사용되는 분기문
	 * 			  break;가 실행되는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 */
	public void method1() {
		// 랜덤값(1~100) 발생시키고 출력(무한반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우 반복문을 빠져나와보자
		
		while(true) { //while true 무한반복
			int random = (int)(Math.random() * 100 + 1);
			System.out.println("random : " + random);
			if(random % 3 == 0) {
				break;
			}
		}
		
	}
	
	public void method2() {
		// 사용자에게 문자열 입력 및 출력하고, exit하면 중단
		while(true) {
			System.out.println("문자열 : ");
			String str = scan.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("문자열 길이 : " + str.length());
			}
			
		}
	}

}
