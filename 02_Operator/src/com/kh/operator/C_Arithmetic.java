package com.kh.operator;

public class C_Arithmetic {
	/*
	 * - 산술 연산자
	 * => +, -, *, /(몫), %(나머지)
	 * 
	 * = (*) -> (/) -> (%) -> (>) -> (+) -> (-)
	 */
	
	public void method1() {
		int num1 = 10;
		int num2 = 3;
		
		System.out.println("num1 + num2 : " + (num1 + num2));
		System.out.println("num1 - num2 : " + (num1 - num2));
		System.out.println("num1 * num2 : " + (num1 * num2));
		System.out.println("num1 / num2 : " + (num1 / num2));
		System.out.println("num1 % num2 : " + (num1 % num2));
		
		// 값 % 2 == 0 라는건 짝수
		// 값 % 2 == 1 라는건 홀수
		
		// 값 % 5 == 0 5의 배수
		// 값 % 3 == 0 3의 배수
		
		
	}

}
