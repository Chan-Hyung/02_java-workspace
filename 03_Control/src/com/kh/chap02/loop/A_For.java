package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	Scanner scan = new Scanner(System.in);
	/*
	 * 반복문
	 * - for문
	 * [표현법]
	 * for(초기식; 조건식; 증감식){ 반복 횟수 결정하기 위해서 제시
	 * 		반복적으로 실행시키고자 하는 구문
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될 때 "처음에 딱 한 번만 실행되는 구문"
	 * 			(보통 반복문안에서 사용될 변수를 선언 및 초기화 하는 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 부분
	 * 			조건식이 true일 경우 해당 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(보통 초기식에 제시된 변수를 가지고 조건식을 작성)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++, --)를 사용)
	 * 
	 * for문안에 초기식, 조건식, 증감식 생략  -> for(;;){} 무한반복
	 * 
	 */
	
	public void method1() {
		for(int i = 1; i<=20; i++) {
			System.out.println("ㅁㄴㅇㄹ");
		}
		
		for(int i = 1; i<=9; i+=2) {
			System.out.println("asdf");
		}
		
	}
	
	public void method2() {
		for(int i = 1; i<=5; i++) {
			System.out.print(i + " ");
		}
	}
	
	public void method3( ) {
		for(int i = 5; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void method4() {
		// 1부터 10까지의 홀수만을 출력
		/*for(int i = 1; i>=10; i+=2) {
			System.out.print(i + " ");
		} */
		for(int i=1; i<11; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
	
	public void method5() {
		// 1 2 3 4 ... 10까지 출력
		for(int i=0; i<=9; i++) {
				System.out.print((i + 1)  + " ");
		}
	}
	
	public void method6() {
		// 1에서 부터 10까지의 총합계
		
		// 방법1. int sum = 1 + 2 + 3 + ... + 10;
		
		// 방법2. 
		
		/*
		 * int sum = 0;
		 * sum += 1 => sum = sum + 1;
		 * sum += 2 => sum = sum + 2;
		 * ...
		 * sum += 9
		 * sum += 10
		 * 
		 * 규칙
		 * sum 변수에 누적해서 합산하는거 반복적으로 진행
		 * 단, 누적해서 더하고자 하는 값이 1에서부터 10까지 1씩 증가되는걸 파악할 수 있음
		 */
		
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum += i; // 누적합 공식
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
	
	public void method7() {
		// 사용자에게 값을 입력 받은 수까지의 합계 출력
		System.out.print("숫자 입력 : ");
		int box = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=box; i++) {
			sum += i;
		}
		
		System.out.print("합계 : " + sum);
	}
	
	public void method8() {
		// 1에서부터 랜덤값(1~10 사이의 랜덤값) 까지의 총합계 **
		
		//자바에서 제공하고 있는 클래스 (Math)
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random() 메소드를 호출해서 매번 다른 랜덤값을 얻을 수 있음
		 * Math.random(); 호출식 => 0.0 ~ 0.9999... 사이의 랜덤값 발생 (double)
		 * 						  (0.0 <= 랜덤값 < 1.0)
		 */
		//int num = Math.random();
		//int num = Math.random() * 10;
		//				0.0 ~ 9.999999...
		//int num = Math.random() * 10 + 1;
		//			1.0 ~ 10.9999...
		int num = (int)(Math.random() * 10 + 1);
		//			1 <= 랜덤값 < 11
		System.out.println("1~10 랜덤값 : " + num);
		
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
			
		}
		System.out.println("1부터 " + num + "까지의 합계 : " + sum);
	}
	
	public void method9() {
		String str = "Hello";
		
		//각 인덱스별 문자를 뽑아서 출력
		/*
		 * H => str.charAt(0)
		 * e => str.charAt(1)
		 *...
		 * o => str.charAt(4)
		 */
		for(int i=0; i<5; i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	public void method10() {
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		
		//apple의 길이 : 5글자
		//01234
		
		//kiwi의 길이 : 4글자
		//0123
		
		System.out.println("문자열의 길이 : " + str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	public void method11() {

		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", 2, i, 2 * i);
			
		}
	}
	
	public void method12() {
		// 2~9 까지의 랜덤수 발생시켜서 랜덤단 출력
		int num = (int)(Math.random() * 8 + 2);
		System.out.println("===" + num + "단===");
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d X %d = %d\n", num, i, num * i);
		}
		
	}
	
	public void method13() { // 중첩 for문
		for(int j=1; j<4; j++) {
			for(int i=1; i<6; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
			
		
	}
	
	public void method14() {
		for(int j=2; j<10; j++) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d x %d = %d\n", j, i, j * i);
			}
			System.out.println();
		}
		
		
	}
	
	
}
