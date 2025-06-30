package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class B_ArrayCopy {
	Scanner scan = new Scanner(System.in);
	
	public void method1() {//얕은 복사 : 주고값을 복사
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("===== 원본 배열======");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		
		int[] copy = origin;
		System.out.println("====복사본 배열=====");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		copy[2] = 99;
		
		System.out.println("===복사본 배열 값 변경 후===");
		
		System.out.println("===== 원본 배열======");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		

		
		System.out.println("====복사본 배열=====");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		//copy만을 바꿨는데 왜 원본도 바껴있냐면
		// -> origin이랑 copy가 같은 곳을 참조하고 있기 때문(즉, 주소값이 같음)
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	
	public void method2() {
		//1. for문 이용
		int[] origin = {1,2,3,4,5};
		
		int[] copy = new int[5];
		/*
		 * copy[0] = origin[0];
		 * copy[1] = origin[1];
		 * ...
		 */
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("===== 원본 배열======");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		

		
		System.out.println("====복사본 배열=====");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		// copy 배열 수정
		copy[2] = 99;
		System.out.println("===== 원본 배열======");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println();
		

		
		System.out.println("====복사본 배열=====");
		for(int i = 0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	
	public void method3() {
		// System이라는 클래스에서 제공하는 arraycopy() 메소드
		int[] origin = {1,2,3};
		int[] copy = new int[10];
		
		// System.arraycopy(원본배열명, 복사할 시작인데스, 복사본배열명, 복사본배열의 복사 될 시작인덱스, 복사할 갯수
		
		//System.arraycopy(origin, 0, copy, 0, 3);
		//System.arraycopy(origin, 0, copy, 2, 3);
		System.arraycopy(origin, 1, copy, 3, 2);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
		//깊은복사
		
	}
	
	public void method4() {
		// 3. Arrays 클래스 제공하는 copyOf() 메소드 사용
		
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할 길이);
		int[] copy = Arrays.copyOf(origin, 10);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
		
	}
	/*
	 * [참고]
	 * java.lang.Math
	 * java.lang.String
	 * java.lang.System
	 * => java.lang 패키지에 있는 클래스들은 import 하지 않아도 사용 가능
	 * 
	 * java.util.Scanner
	 * java.util.Arrays
	 * => java.lang 이외의 패키지에 있는 클래스들을 쓸 대는 무조건 import
	 */
	
	public void method5() {
		// 4. clone() 메소드 이용
		// 완전똑같이 복사할때만 사용
		
		int[] origin = {1,2,3,4,5};
		// 복사본 배열 = 원본배열.clone();
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin 주소값 : " + origin.hashCode());
		System.out.println("copy 주소값 : " + copy.hashCode());
	}
	
	
}
