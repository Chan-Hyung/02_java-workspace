package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap06_method.controller.NonStaticMethod;
import com.kh.chap06_method.controller.OverlodingTest;
import com.kh.chap06_method.controller.StaticMethod;

public class MethodRun {

	public static void main(String[] args) {
		NonStaticMethod n = new NonStaticMethod();
		//n.method1();
		//String str = n.method2();
		//System.out.println(str);
		//n.method3(20, 0);
		//char ch = n.method4("lemon", 1);
		//System.out.println(ch);
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		
		System.out.print("인덱스 값 입력 : ");
		int index = scan.nextInt();
		
		char ch = n.method4(str, index);
		System.out.println(ch);
		*/
		
		// staticMethod : 생성 없이 호출 가능
		/*
		StaticMethod.method1();
		int num = StaticMethod.method2();
		//System.out.println(num);
		StaticMethod.method3("차은우");
		System.out.println(StaticMethod.method4("apple", "apple"));
		*/
		
		OverlodingTest ot = new OverlodingTest();
		ot.test();
		ot.test(10);
		ot.test(10, "차은우");
		ot.test("박보검", 20);
		ot.test("장원영");
		
		// 오버로딩 = print() -> 정의 정리
		System.out.println();
		
	}

}
