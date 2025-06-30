package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	Scanner scan = new Scanner(System.in);
	/*
	 * continue; : 반복문 안에 기술되는 구문
	 * 			   continue; 구문 실행시 그 뒤의 구문은 실행하지 않고 현재 속해있는 반복문 위로 올라감
	 */
	public void method1() {
		//for문으로 1~10 까지의 홀수 출력
		
		for(int i = 1; i<11; i++) {
			if(i % 2 == 0) {
				continue; //건너뛰기
			}
			System.out.print(i + " ");
		}
	}
	
	public void method2() {
	    // 2 ~ 9단 까지 출력, 단 3의 배수 단은 제외
	    for (int dan = 2; dan < 10; dan++) {
	        if (dan % 3 == 0) {
	            continue;
	        }
	        for (int i = 1; i < 10; i++) {
	            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
	        }
	        System.out.println(); 
	    }
	}

}
