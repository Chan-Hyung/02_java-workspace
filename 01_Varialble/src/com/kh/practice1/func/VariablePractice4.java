package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void test4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String fruit = sc.nextLine();
		
		System.out.println("첫 번째 문자 : " + fruit.charAt(0));
		System.out.println("두 번째 문자 : " + fruit.charAt(1));
		System.out.println("세 번째 문자 : " + fruit.charAt(2));
	}
}
// null 넣어서 적는대로 하는법?