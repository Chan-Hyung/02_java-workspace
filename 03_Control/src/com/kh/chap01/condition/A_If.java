package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	Scanner scan = new Scanner(System.in);
	
	
	public void method1() {
		/*
		 * 단독 if문
		 * 
		 * [표현법]
		 * if(조건식) {
		 * 		.. 실행시키고자 하는 코드 ..
		 * }
		 * 
		 * => 조건식이 참(true)일 경우 => 중괄호 블럭 안의 코드 실행
		 * => 조건식이 거짓(false)일 경우 => 중괄호 블럭 안의 코드 무시하고 넘어감
		 * 
		 */
		
		System.out.print("정수 : ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		}
		
		if(num <= 0) {
			System.out.println("양수가 아니다");
		}
		
	}
	
	public void method2() {
		/*
		 * if - else 문
		 * 
		 * [표현법]
		 * if(조건식) {
		 * 		.. 실행코드1 ..
		 * }else {
		 * 		.. 실행코드2 ..
		 * }
		 * 
		 * 조건식의 결과가 참(true)일 경우 실행코드1 수행 후 if -else문을 빠져나감
		 * 단, 결과 거짓(false)일 경우 무조건 실행코드2 수행
		 * 
		 */
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		}else {
			System.out.println("양수가 아니다");
		}
		
	}
	
	public void method3() {
		/*
		 * if - else if - else 문
		 * 같은 비교대상으로 여러 개의 조건을 처리해야 될 경우
		 * 
		 * [표현식]
		 * if(조건식) {
		 * 		.. 실행코드1 ..
		 * }else if(조건식) {
		 * 		.. 실행코드2 ..
		 * }else if(조건식) {
		 * 		.. 실행코드3 ..
		 * }else(생략가능) {
		 * 		.. 실행코드4 ..
		 * 		위의 조건들이 다 false일 경우 실행할 코드
		 * }
		 */
		
		System.out.print("정수 : ");
		int num = scan.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		}else if(num == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
	}
	
	public void method4() {
		// 나이 입력
		// 13세 이하: 어린이
		// 13세 초과 19세 이하 : 청소년
		// 19세 초과 : 성인
		
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		
		String result;
		
		if(age <= 13) {
			result = "어린이";
		}else if(/*age >13 && */ age < 20) {
			result = "청소년";
		}else {
			result = "성인";
		}
		
		System.out.println(result);
		
	}
	
	public void method5() {
		// 이름
		// 성별(M/F)
		// 차은우님은 남학생입니다.
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = scan.nextLine().charAt(0);
		
		String result = "";
		
		if( gender == 'M' || gender == 'm') {
			result = "남학생";
		}else if (gender == 'F' || gender == 'f') {
			result = "여학생";
		}else {
			System.out.println("다시 입력하세요");
			return; // 해당 이 메소드 자체를 빠져나가는 구문
		}
		
		System.out.println(name + "님은 " + result + "입니다.");
	} 
	
	public void method6( ) {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		/*
		if(name == "차은우") {
			System.out.println("차은우님 반갑습니다.");
		}else {
			System.out.println("안녕히가세요.");
		}
		*/
		
		/*
		 *              1byte   1      2     4    8      4      8      2
		 * 기본자료형 : boolean, byte, short, int, long, float, double, char
		 * 참조자료형 : String
		 * 
		 * 기본자료형을 끼리 동등 비교시 ==, != 사용시 정상적으로 비교 O
		 * 단, 참조자료형은 동등 비교시 ==, != 사용시 정상적으로 비교 X
		 * 		=> equals() 메소드를 이용해서 비교
		 * 		문자열.equals(문자열)
		 */
		
		if(name.equals("차은우")) {
			System.out.println("차은우님 반갑습니다.");
		}else {
			System.out.println("안녕히가세요.");
		}
		
	}
	
	public void method7() { // 조건문 중첩 사용
		System.out.print("정수(양수만) : ");
		int num = scan.nextInt();
		
		if(num > 0) {
			 if(num % 2 == 0) {
				 System.out.println("양수이고 짝수일때");
			 }else {
				 System.out.println("양수는 맞고 홀수일 경우");
			 }
		}else {
			System.out.println("양수 아님");
		}
	}
}
