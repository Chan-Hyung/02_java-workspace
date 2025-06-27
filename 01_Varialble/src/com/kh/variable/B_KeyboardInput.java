package com.kh.variable;

import java.util.Scanner;

// 사용자가 키보드로 입력한 값을 받아들이는 Scanner 실습
public class B_KeyboardInput {
	public void InputTest1() {
		/*
		 * 키보드로 값을 입력하는 방법
		 * Scanner를 사용
		 * 즉 java.util.Scanner 클래스를 이용
		 * Scanner 클래스 내부의 메소드를 호출하여 입력 받을 것
		 * 즉, 사용자가 직접입력할 때 그 값을 받기 위해 쓰임**
		 */
		
		// 스캐너 클래스의 객체 생성
		// 클래스명 별치 = new 클래스명();
		Scanner sc = new Scanner(System.in);
		// System.in은 입력받은 값을 바이트 단위로 받아들이겠다는 의미
		// System.out => 출력 시
		
		System.out.print("아무거나 : ");
		String message = sc.nextLine();
		
		System.out.println("입력받은 내용 : " + message);
		
		sc.close();
		
		
	}
	
	public void InputTest2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? : ");
		
		// 사용자가 입력한 값을 문자열로 받아오는 메소드 (next(공백 포함x), nextLine(공백 포함o))
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.println(name);
		
		System.out.print("당신의 나이는? : ");
		int age = sc.nextInt();  // 사용자가 입력한 값을 정수로 받음
		
		System.out.print("당신의 키는?(소수점까지) : ");
		double height = sc.nextDouble();
		
	}
	
	// 키보드로 값을 입력 받을 때 종종 발생되는 문제
	public void InputTest3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 주소를 입력할 때 주소와 키가 같이 나옴
		// -> 버퍼에 남아있는 엔터 제거
		sc.nextLine();
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		
		System.out.print(" 키 : ");
		double height = sc.nextDouble();
		
//		System.out.println(name + "님은" + age + "살이며, 사는 곳은" + address + "이고, 키는" + height + "cm 입니다.");
		System.out.printf("%s님은 %d살이며, 사는 곳은 %s이고, 키는 %.1fcm 입니다.", name, age, address, height);
		
		
	}
	
	public void InputTest4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0)
		// 문자열, charAt(인덱스) : 해당 문자열로부터 해당 인덱스의 문자를 추출해주는 메소드
		// * 인덱스 : 순번 같은 존재. 단, 0부터 시작
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print(" 키 : ");
		double height = sc.nextDouble();
		
		System.out.println(name + "의 개인정보");
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
	}
	
	public void CharAtTest5() {
		String str = "Hello";
		
		// System.out.println(str.charAt(9));
		// StringIndexOutOfBoundsException 발생 : 인덱스 범위 벗어남
	}
	
	/*
	 * --정리--
	 * 1. 콘솔창에 출력하기 위해 : System.out.print/println() 이용
	 * 2. 콘솔창에 입력하기 위해 : Scanner 이용해서 (nextLine(), nextInt() ...)
	 * 
	 * 		> 주의사항
	 * 		1) sc.nextXXX() 메소드 뒤에 sc.nextLine() 메소드가 와야 될 경우
	 * 		   sc.nextXXX() 써서 버퍼에 남아있는 엔터 제거
	 */
}
