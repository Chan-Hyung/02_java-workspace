package com.kh.chap02.loop;

import java.util.Scanner;

public class C_Dowhile {
	Scanner scan = new Scanner(System.in);
	/*
	 * - do while문
	 * 
	 * do {
	 * 		반복적으로 실행할 코드(무조건 실행)
	 * }while(조건식);
	 * 
	 * -기존 for / while문과의 차이점
	 * for / while문 같은 경우에는 조건 검사 후에 true여야만 수행
	 * 근데 do-while문은 조건 검사 없이 무조건 한번은 수행
	 */
	
	public void method1() {
		int num = 1;
		
		do {
			System.out.println("num : " + num);
		}while(false);
	}
	
	public void method2() {
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i<=5);
	}
	public void method3() {
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(i <= num);
		
		System.out.println("총합계 : " + sum);
		
	}
}
