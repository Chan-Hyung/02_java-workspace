package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice2 {
	public void test2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		int diff = num1 - num2;
		int pro = num1 * num2;
		double divi = (double)num1 / num2;
		
		System.out.println("더하기s 결과 : " + sum);
		System.out.println("빼기 결과 : " + diff);
		System.out.println("곱하기 결과 : " + pro);
		System.out.println("나누기 결과 : " + (int)divi);
	}

}
