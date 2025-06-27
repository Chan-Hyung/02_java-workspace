package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	/*
	 * - 논리연산자 (이항연산자)
	 * 	 두 개의 논리값을 연산해주는 연산자
	 * 	 
	 * 	 논리값 &&(and) 논리값 : 왼쪽과 오른쪽이 모두 true일 경우 결과값이 true(f && f = f)
	 * 	 논리값 ||(or) 논리값 : 왼쪽과 오른쪽이 하나라도 true일 경우 결과값은 true(f && f = f)
	 */
	
	public void method1() {
		// 사용자가 입력한 정수 값이 1부터 100사이의 값인지 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		//boolean result = (1 <= 100 <= 100); -> X
		boolean result = (num1 >= 1) && (num1 <= 100);
		
		System.out.println("사용자가 입력한 값이 1~100 사이 입니까? : " + result);
		
//		&& : 두개 조건 모두가 true여야 결과값이 최종적으로 true
//			 둘 중 하나라도 false가 있을 경우 && 연산의 결과값은 false
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영어 대문자인지 확인
		// 'A' ~ 'Z' 65~90 -> 아스킷코드(자료구조? 영식교수님 수업 중 책)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 하나를 입력 : ");
		char ch = scan.nextLine().charAt(0);
		
		//boolean result = (ch >= 65) && (ch <= 90);
		boolean result = (ch >= 'A') && (ch <= 'Z');
		
		System.out.println("대문자? : " + result);
	}
	
	public void method3() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성별 입력 (M/F): ");
		char gender = scan.nextLine().charAt(0);
		
		boolean result1 = (gender == 'F') || (gender == 'f');
		//boolean result2 = (gender == 'M') || (gender == 'm'); if else로 쓸 수 있음
		
		System.out.println("사용자의 성별 : " + result1);
		
		// || : 두개의 조건 중 하나라도 true가 있다면 연산의 결과값은 true
		// 	  : 두개의 조건 모두 false일 경우 연산의 결과값은 false
			
	}
	
	public void method4() {
		/*
		 *  && : 두 개의 조건이 모두 true여야 결과값이 true. (AND == ~이고, 그리고, ~이면서)
		 *  
		 *  true && true => true
		 *  true && false => false
		 *  false && false => false
		 *  false && true => false
		 *  true && false => false
		 *  -> && 연산자를 기준으로 앞의 결과가 false일 경우 뒤의 조건은 굳이 실행 X
		 *  
		 *  
		 *  || : 두 개의 조건 중 하나라도 true라면 결과값이 true. (OR == 또는, ~이거나)
		 *  
		 *  true || true => true
		 *  true || false => true
		 *  false || true => true
		 *  false || false => false
		 *  -> || 연산자 기준으로 앞의 결과가 true일 경우 뒤의 조건은 굳이 실행 X
		 *  
		 */
		
		int num = 10;
		boolean result1 = (num > 5) && (++num < 0);
		
		System.out.println("result1 : " + result1);
		System.out.println("num : " + num);
		
		int num2 = 10;
		boolean result2 = true || (++num2 > 0); // Dead code : 절대 실행 X
		
		System.out.println("result2 : " + result2);
		System.out.println("num2 : " + num2);
	}
}
