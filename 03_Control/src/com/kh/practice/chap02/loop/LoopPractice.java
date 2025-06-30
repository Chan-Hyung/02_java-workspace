package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner scan = new Scanner(System.in);
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num1 = scan.nextInt();
		
		if(num1 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		
		for(int i = 1; i<=num1; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice2() {
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num1 = scan.nextInt();
		
		if(num1 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		
		for(int i = num1; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요. : ");
		int num1 = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num1; i++) {
			sum += i;
			if(i < num1) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = scan.nextInt();
		
		if( num1 < 1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		
		int s = Math.min(num1, num2); //**
	    int e = Math.max(num1, num2); //**

	    for (int i = s; i <= e; i++) {
	        System.out.print(i + " ");
	    }
		
	}
	
	public void practice8() {
		System.out.print(" 숫자 : ");
		int num = scan.nextInt();
		System.out.println("=====" + num + "단=====");
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
	
	public void practice9() { // 단마다 ====단===???
		System.out.print(" 숫자 : ");
		int num = scan.nextInt();

		
		if (num < 1 || num > 9) {
	        System.out.println("9 이하 숫자만 입력해주세요.");
	        return;
	    }
		
		for(int i = num; i<10; i++) {
			System.out.println("=====" + num + "단=====");
			for(int j = 1; j<10; j++) {
			System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
		System.out.println();
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("공차 : ");
		int num2 = scan.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(num1 + (i * num2) + " ");
		}
		System.out.println();
	}
	
	public void practice13() {
	    System.out.print("정수 입력 : ");
	    int num = scan.nextInt();

	    for (int i = 1; i <= num; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public void practice14() {
	    System.out.print("정수 입력 : ");
	    int num = scan.nextInt();

	    for (int i = num; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}




}
