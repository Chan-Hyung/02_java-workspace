package com.kh.array;

import java.util.Scanner;

public class A_Array {
	Scanner scan = new Scanner(System.in);
	// 변수 : 하나의 공간에 하나의 값만 담을 수 있음
	// int a = 10,20,30;
	
	// 배열 : 하나의 공간에 여러 개의 값을 담을 수 있는 개념
	//		 "같은 자료형의 값"으로만 담을 수 있다.
	//		 배열의 각 인덱스 자리에 실제 값이 담김 (인덱스는 0부터 시작)
	
	public void method1() {
		/*
		 * 1. 배열 선언
		 * [표현법]
		 * 자료형 배열명 [];
		 * 자료형[] 벼열명;
		 */
		
		int a;
		// int arr[];
		//int[] arr;
		
		/*
		 * 2. 배열 할당(크기지정)
		 * 	  배열명 = new 자료형[배열크기]
		 */
		//arr = new int[5];
		
		int[] arr = new int[5];
		
		/*
		 * 3. 값 대입
		 * 	  배열명[인덱스] = 값;
		 */
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		for(int i=0; i<5; i++) {
			arr[i] = i;
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 실제 arr이라는 박스에는 "주소값"이 담겨짐
		
	}
	
	public void method2() {
		int[] iArr = new int[5];
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 리터럴 값을 곧바로 담을 수 있는 변수는 일반변수
		 * 주소값을 담고 있는 변수는 참조변수(레퍼런스 변수)라고 한다.
		 */
		
	}
	
	public void method3() {
		int[] iArr = new int[3]; // 인덱스 0번 ~ 2번
		double[] dArr = new double[4]; // 인덱스 0번 ~ 3번
		
		for(int i= 0; i<4; i++) {
			System.out.println(dArr[i]);
		}
		
		// 내가 각 인덱스에 초기화를 하지 않아도 값들이 담겨있음
		// Heap이라는 공간에는 절대 빈공간이 존재할 수 없음
		// 따라서 공간이 만들어질 때 JVM이 기본적으로 초기화를 진행
		
	}
	
	public void method4() {
		int[] arr = new int[10];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
		
		System.out.println(arr); // 배열의 자료형 + @ + 주소값 16진수
		System.out.println(arr.hashCode()); // 주소값을 10진수 형태
		System.out.println(arr.length); // 배열의 길이
		
	}
	
	public void method5() {
		// 배열쓰면서 볼 수 있는 오류
		//int[] arr; => 크기지정(할당)을 안해준 경우
		int[] arr = null; // 아무것도 참조하고 있지 않다.
		
		//System.out.println(arr);
		
		//null을 가지고 메소드를 호출한다거나 특정 어딘가에 접근하면
		//항상 오류 발생 NullPointerException
		// System.out.println(arr.hashCode());
		//System.out.println(arr.length);
		//System.out.println(arr[0]);
	}
	
	public void method6() {
		int [] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = i;
		}
		
		// arr[5] = 5;
		// ArrayIndexOutOfBoundsException : 배열에 부적적한 인덱스
		
		// *배열의 가장 큰 단점
		// - 한번 지정된 배열의 크기는 변경이 불가
		// => 배열의 크기를 변경하고자 한다면 다시 만들어야됨
		arr = new int[7];
		
		/*
		 * 연결이 끊어진 기존 배열은 Heap영역에 남아있음...(어디에도 참조되어있지 않음으로 필요없는 존재)
		 * 일정시간이 지나면 => "가비지컬렉터(GC)"가 알아서 지워줌
		 * => 자바에서의 "자동 메모리 관리" 특징
		 */
		
		// 배열을 강제로 삭제하고자하면?
		arr = null; 
		
		System.out.println(arr);
		
	}
	
	public void method7() {
		// 배열 선언, 할당, 초기화를 동시에 하는 법
		// 표현법 1
		int[] arr1 = new int[] {1,2,3,4};
		
		// 표현법 2 **
		int[] arr2 = {1,2,3,4};
		
		System.out.println(arr1 == arr2);
		// 각각의 변수에 담겨있는 주소값 비교하기 때문
		
	}
	
	public void method8() {
		// 1. 크기 10인 정수 배열
		int[] arr = new int[10];
		
		// 2. 반복문 활용해서 값을 대입 1~100 사이에 발생되는 랜덤값
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 3. 반복문 활용해서 출력
		// arr[x] : xx
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr [" + i + "] : " + arr[i]);
		}
		
	}
	
	public void method9() {
		System.out.print("배열의 길이 : ");
		int size = scan.nextInt();
		
		scan.nextLine();
		
		String[] arr = new String[size];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("종아하는 과일 입력 : ");
			arr[i] = scan.nextLine();
		}
		
		// arr[1] : 바나나
		for(int i = 0; i<arr.length; i++) {
			System.out.println("arr [" + i + "] : " + arr[i]);
		}
		
		
		
	}
	
	public void method10() {
		// 사용자에게 문자열 입력
		System.out.print("문자열 입력 : ");
		String str = scan.nextLine();
		System.out.print("찾는 문자 : ");
		char ch = scan.nextLine().charAt(0);
		
		// 2. char 배열 만들기
		char[] arr = new char [str.length()];
		
		// 3. 반복문 활용해서 값대입
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] _ str.charAt(1);
		 * ...
		 */
		for(int i = 0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		// 4. 출력
		// arr[i] : k
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr [" + i+ "] : " + arr[i]);
			
			if(arr[i] == ch) {
				count++;
			}
			
		}	
		
		System.out.print("찾은 문자 개수 : " + count);
		
	}
	
	public void method11() {
		// 1. 사용자에게 배열의 길이 입력받은 후 해당 크기만큼의 정수배열 만듦
		System.out.print("배열의 길이 : ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		// 2. 반복문 활용 0~마지막인덱스까지 매번 1~100사이의 랜덤값 발생시켜 대입
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		// 3. 반복문 출력 + 해당 그 인덱스에 담긴 값이 짝수인 값들의 총합 출력
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("해당 배열의 짝수의 합 : " + sum);
		
	}
	
	
}
