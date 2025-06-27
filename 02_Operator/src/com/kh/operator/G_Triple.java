package com.kh.operator;

import java.util.Scanner;

public class G_Triple { // 조건 ? 참 : 거짓
	/*
	 * - 삼한연산자 (항이 3개)
	 * 
	 * [표현법]
	 * (조건식) ? 조건식이 참일 경우 돌려줄 결과값 : 조건식이 거짓일 경우 돌려줄 결과값
	 * 
	 * 조건식은 반드시 true, false가 나오도록 작성
	 * 주로 비교연산자, 논리연산자를 통해 작성
	 * 
	 */
	
	public void method1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		String result = (num>0) ? "양수입니다." : "양수가 아닙니다.";
		
		System.out.println(num + "은 " + result);
		
	}
	
	public void method2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = scan.nextInt();
		
		String result = (num % 2 == 0) ? "짝수입니다." : "홀수입니다.";
		
		System.out.println(num + "은 " + result);
	}
	
	public void method3() { // 삼항연산자 중첩 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = scan.nextInt();
		
		String result = (num>0) ? "양수입니다." : (num == 0) ? "0입니다." : "음수입니다.";
		System.out.println(num + "은(는) " + result);	
			
	}
	
	public void method6() { // 조건식 ? 참 : 거짓
										   // 조건식 ? 참 : 거짓
		// 사용자에게 두 개의 정수를 입력 받고
		// 연산자입력(+ 또는 -) 입력받아 그에 맞는 연산결과를 출력
		// 단, + 또는 - 외의 다른 문자를 입력했을 경우 "잘못입력했습니다." 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수입력 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 정수입력 : ");
		int num2 = scan.nextInt();
		
		scan.nextLine();
		
		System.out.print("연산자입력(+ 또는 -) : ");
		char ch = scan.nextLine().charAt(0);	
		
		String result = (ch == '+') ? (num1 + num2 + "") : (ch == '-') ? (num1 - num2 + "") : "잘못입력했습니다.";			
		System.out.println("결과 : " + result);
	
	}
	
}
