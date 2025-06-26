package com.kh.variable;

public class A_Variable {
	// 시급과 근무시간과 근문일수를 곱해서 월급을 계산해 출력하는 메소드
	public void printVariable() {
		System.out.println("===== 변수 사용 전 =====");
		
		System.out.println("시급 : 9450원");
		System.out.println("근무시간 : 6시간");
		System.out.println("근무일수 : 8일");
		
		// 월급 = 시급 x 근무 시간 x 근무일수
		// 몰라모 : 0000원
		
		//sysout + 컨트롤 + 스페이스
		System.out.println("몰라모 : " + (10000 * 6 * 8) + "원");
		System.out.println("모라몰 : " + (10000 * 6 * 8) + "원");
		System.out.println("라모몰 : " + (10000 * 6 * 8) + "원");
		
		// 변수 사용 후
		System.out.println("===== 변수 사용 후 =====");
		
		int pay = 10000;
		int time = 6;
		int day = 8;
		
		System.out.println("몰라모 : " + (pay * time * day) + "원");
		System.out.println("모라몰 : " + (pay * time * day) + "원");
		System.out.println("라모몰 : " + (pay * time * day) + "원");
		
		/*
		 *  * 변수를 사용하는 이ㅠ
		 *  1. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다.
		 *  2. 변수는 우선적으로 값에 의미를 부여할 목적으로 쓴다. (가독성이 높아진다.)
		 *  3. 유지보수를 보다 쉽게 할 수 있다.
		 */
		
		
	}
	
	public void declareVariable() {
		/*
		 * 변수 선언
		 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다. => 즉, 값을 보관할 상자를 만들겠다.
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
		 * 변수이름 : 변수의 이름을 설정해주는 부분 (관련된 의미를 부여하면 가독성 좋아지고 코딩하기 쉬워짐)
		 * 
		 * 변수 선언시 주의할 점
		 * 1. 변수 이름은 소문자로 시작 / 단, 낙타봉 표기법을 지킬 것 + 예약어는 불가
		 * 2. 같은 영역안에서는 동일한 변수명 선언 불가
		 * 3. 해당 영역 안에서 선언한 변수는 그 영역 안에서만 사용 가능 => 다른 메소드에서는 못 씀
		 * 
		 */
		
		// --------------- 자료형에 대한 개념----------------
		//1. 논리형 {논리값 = true / false}
		boolean isTrue;
		boolean isFalse = false;
		System.out.println("isFalse의 값 ; " + isFalse);
		
		isTrue = 1 + 3 > 1;
		System.out.println("isFalse의 값 ; " + isTrue);
		
	}
	
}
