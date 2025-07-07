package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnckeckedException {
	/*
	 * - RuntimeException
	 * 1) 프로그램 실행시 발생되는 예외
	 * 
	 * - RuntimeException
	 * 1) IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외
	 * 2) NullPointerException : 참조변수가 null로 초기화된 상황에서 null에 접근했을때 발생되는 예외
	 * 3) ArithmeticEception : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
	 * 4) ClassCastException : 허용할 수 없는 형변환이 진행될 때 발생되는 예외
	 * 5) NegativeArraySizeException : 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * 
	 * => RuntimeException 관련된 예외는 충분히 예측가능한 상황이 있다.
	 * 		애초에 예외자체가 발생이 안되게끔 if문 조건 처리 가능 (예외처리를 방지하는 거지 예외처리 방법은 아님)
	 *  
	 *  +) RuntimeException 같은 것들도 예외클래스라고하는 클래스인데 얘네도 상속이 가능하여 RuntimeException이 부모이고 그 아래있는것들은 자식들이다.
	 *  
	 */
	private Scanner sc = new Scanner(System.in);
	
	public void method1() { // ArithmeticEception : 나누기 연산시 0으로 나누려 할 때 발생되는 예외
		System.out.print("첫 번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		// int result = num1 / num2; => 사용자가 두번째 정수를 0으로 입력한 순간 예외 발생 -> 비정상적으로 프로그램 종료
		/*
		int result = 0;
		if(num2 != 0) { // 예외가 나오기 전에 if문으로 방지했기 때문에 예외처리가 아니고 예외방지를 한거 
			result = num1 / num2;
		}
		
		System.out.println("계산 결과");
		System.out.println("result : " + result);
		*/
		
		// 예외처리 : 예외가 "발생했을 때" 실행할 내용을 미리 작성해놓는 방법
		
		/*
		 * - try catch 
		 * try {
		 * 		예외가 발생될 수 있는 구문
		 * }catch(발생될 예외클래스 매개변수){
		 * 		해당 예외가 발생됐을 경우 실행할 구문
		 * }
		 * 
		 */
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 강제로 오류난 이력을 보고자 할 때 실행하는 구문
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() { // (Array -> 배열이라 붙은거)IndexOutOfBoundsException : 부적절한 인덱스를 가지고 접근시 발생되는 예외
		System.out.print("배열 크기 : ");
		int size = sc.nextInt();
		
		/* if 문으로 예외자체가 발생이 안되도롥 먼저 막음
		if(size>=101) {
			int[] arr = new int[size];
			System.out.print("100번 인덱스의 값 : " + arr[100]);
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.print("100번 인덱스의 값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기를 음수로 제시할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스 접근");
		} // 다중 catch블럭
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method3() {
		System.out.print("배열의 크기 : ");
		
		/*
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스값 : " + arr[100]);
		}catch(NegativeArraySizeException e) {//음수 예외
			System.out.println("배열의 크기를 음수로 제시 X");
		}catch(ArrayIndexOutOfBoundsException e) {// 배열 크기 안 맞음
			System.out.println("부적절한 인덱스로 접근");
		}catch(InputMismatchException e) {// 잘못 입력
			System.out.println("정수로만 입력");
		}
		*/
		
		// 다중 catch 블럭 작성 가능
		// 각각의 예외 발생시 실행할 내용이 별개인 경우 세분화해서 catch 블럭으로 기술하는게 적절
		
		
		try {
			int size = sc.nextInt();
			int[] arr = new int[size];
			System.out.println("100번 인덱스값 : " + arr[100]);
		}catch(InputMismatchException e) { // 자식 클래스는 무조건 부모보다 위에 있어야함
			System.out.println("정수 아님");
		}catch(RuntimeException e) { // 다형성 적용해서 부모타입예외클래스 작성 가능
			System.out.println("예외 발생 -> 배열의 크기 잘못입력, 부적절한 인덱스 제시");
		}
		//catch(InputMismatchException e) {
//			
//		}
		
		// -> 부모예외 클래스와 자식예외클래스를 가지고 catch를 기술하고자 할 때는 자식예외클래스 catch가 위에 있어야함.
		
		/*
		 * RuntimeException 관련 애들은 UncheckedException (예외처리 구문이 필수는 아님)
		 * if문 : 애초에 예외자체가 발생되기 전에 소스코드로 핸들링 하는거(예외처리 구문은 아님)
		 * try-catch문 : 예외가 "발생했을 경우" 처리해주는 구문을 작성해주는 것(예외처리 구문)
		 * 
		 * 예측 가능한 상황은 if문 조건 검사로 해결하는게 권장 상항
		 * 부득이하게 조건문으로 핸들링 안되는 구문 예외처리 구문으로 작성
		 */
		
		System.out.println("프로그램 종료");
	}
	
}
