package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
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
		
		System.out.println("정수 입력 : ");
		int num = scan.nextInt();
		
		String result = (num>0) ? "양수입니다." : "양수가 아닙니다.";
		
	}
	
}
