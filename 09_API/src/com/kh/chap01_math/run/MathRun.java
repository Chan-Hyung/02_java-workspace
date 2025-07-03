package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		// java.lang.Math (string, Object) => 굳이 import 하지 않아도 사용할 수 있음
		
		
		// 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 때 : abs()
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 : ceil = 크거나 같은 정수값
		double num2 = 4.349; //5
		double num3 = -10.594; // -10
		System.out.println("올림 : " + Math.ceil(num2));
		System.out.println("올림 : " + Math.ceil(num3));
		
		// 버림 : floor = 적거나 같은 정수값
		System.out.println("버림 : " + Math.floor(num2));
		
		// 반올림 : round
		System.out.println("반올림 : " + Math.round(num3));
		
		// 제곱근(루트) : sqrt
		System.out.println("4의 제곱근 : " + Math.sqrt(4));
		
		// 제곱 : pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		
		/*
		 * - Math 특징
		 * 1) 모든필드 상수필드, 모든 메소드 static 메소드 (생성자가 private이라 생성 불가)
		 * 2) 한번에 메모리영역에 올려놓고 재상용 하는 개념 => 싱글톤패턴
		 * 
		 */
		
		
		
	}

}
