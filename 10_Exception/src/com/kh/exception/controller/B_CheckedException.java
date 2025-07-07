package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	/*
	 * CheckedException은 반드시 예외처리를 해야하는 예외
	 * => 조건문 미리 제시할 수 없음(예측이 불가능한 곳에서 문제가 발생하기 때문에 미리 예외처리 구문을 작성해놓아야함)
	 * => 외부 매개체외 입출력이 일어날 때 발생(I(nput)O(utput)Exception)
	 */
	public void method1() throws IOException {
		method2();
	}
	
	public void method2() throws IOException {
		// Scanner와 같이 키보드로 값을 입력받을 수 있느 객체
		// 스캐너 이전의 방식 => 정수, 실수 입력 X -> 문자만 받을 수 있다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("입력 : ");
		
		// 1. try~catch문 : 여기서 이 자리에서 곧바로 에러를 처리
		// try[] : 예외가 발생할 가능성이 있는 코드를 작성
		// catch(발생될예외클래스 매개변수){} : try 구문 내에서 예외가 발생했을 경우 어떻게 처리할껀지에 대한 내용 작성
		
		// String str = br.readLine();
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {
			System.out.println("예외 발생");
		}
		*/
		
		// 2. throws : 지금 이 자리에서 예외를 처리하지 않고, 현재 이 메소드를 호출하는 곳으로 예외처리 넘김.(위임)
		String str = br.readLine();
		
	}
	
}
