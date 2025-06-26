package com.kh.variable;

public class C_Printf {
	// System.out.print(출력하고자 하는 값); 	// 출력만 하고 줄바꿈 발생x
	// System.out.println(출력하고자 하는 값);	// 출력 후 줄바꿈 발생 o
	
	// Systeml.out.printf("출력을하고자하는 형식(포펫)", 출력하고자 하는 값);
	// 출력하고자 하는 값을 제시한 형식에 맞춰서 출력만 진행 (줄바꿈x)
	/*
	 * 포펫 안에서 쓰일 수 있는 키워드
	 * %d : 정수
	 * %c : 문자
	 * %s : 문자열(문자)
	 * %f : 실수
	 */
	
	public void printfTest() {
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 10 20
		System.out.println(iNum1 + " " + iNum2);
		System.out.printf("%d %d", iNum1, iNum2);
		System.out.println();
		
		// 10 20%
		System.out.printf("%d %d%%", iNum1, iNum2);
		System.out.println();
		System.out.printf("%d %d", iNum1, iNum2, 30);
		System.out.println();
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%.2f %.2f\n", dNum1, dNum2);
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s %s\n", ch, str, ch);
		System.out.printf("%C %S %S\n", ch, str, ch);
	}
	
}
