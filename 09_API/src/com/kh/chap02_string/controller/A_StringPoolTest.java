package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	public void method1() {
		
		/*
		int a = 10; // 기본자료형
		String s = "ㅁㅇ"; // 참조자료형
		*/
		
		// 1. 생성자를 통해 문자열 생성
		String str1 = new String("hello"); // 매개변수 생성자
		String str2 = new String("hello"); // 매개변수 생성자
		
		System.out.println(str1.toString());
		System.out.println(str2);
		// String 클래스에 toString() 메소드가 이미 오버라이딩 돼있음
		
		// 동등비교
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		// String 클래스에 equals() 메소드가 이미 오버라이딩 돼있음
		// Object 클래스 확인해보면 원래는 주소값을 동등비교하는 메소드
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// String 클래스에 hashCode 메소드 이미 오버라이딩 돼있음
		// 주소값이 아닌 실제 담겨있는 문자열을 가지고 해쉬코드 만듦
		
		// 주소값을 알고 싶을 때
		// System.identityHashCode(객체);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
	
	public void method2() {
		
		String str = new String("hello");
		
		// 2. 문자열값을 리터럴 값으로 생성하는 것
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(str1 == str2); // true 값 출력(주소값 일치)
		
		System.out.println("str1의 주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 주소값 : " + System.identityHashCode(str2));
		
		System.out.println("str의 주소값 : " + System.identityHashCode(str));
		
		String str3 = "hi";
		System.out.println(str1 == str3);
		System.out.println("str3의 주소값 : " + System.identityHashCode(str3));
		
		// String 클래스 == 불변클래스 (변하지 않는 클래스)
		// 값을 못바꾸나? -> X
		// 변경이 가능하긴 하나 그 자리에서 수정되는 개념은 아님
		
		str3 = "bye";
		System.out.println("str3의 주소값 : " + System.identityHashCode(str3));
		
		str3 = "hello";
		System.out.println("str3의 주소값 : " + System.identityHashCode(str3));
	
	}
}
