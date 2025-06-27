package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	Scanner scan = new Scanner(System.in);
	/*
	 * - while 문
	 * 
	 * [표현법]
	 * 
	 * 초기식;(생략가능)
	 * while(조건식){
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * }
	 * 
	 */
	
	public void method1() {
		// 1 2 3 4 5
		int i = 1;
		while(i < 6) {
			System.out.print(i + " ");
			i++;
		}
	}
	
	public void method2() {
		// 1에서부터 10까지 단, 홀수만
		int i = 1;
		while(i < 11) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
				
			}
			i++;
		}
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100)까지의 총합계
		int i = 1;
		int num = (int)(Math.random() * 100 + 1);
		
		int sum = 0;
		while(i <= num) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터" + num + "까지의 합 : " + sum);
	}
	
	public void method4() {
		System.out.print("문자열 : ");
		String str = scan.nextLine();
		
		System.out.printf("문자열 길이 : ", str.length());
		// apple
		// 01234
		int i = 0;
		while(i < str.length()) {
			System.out.print(str.charAt(i));
			i++;
		}
		
	}
	

}
