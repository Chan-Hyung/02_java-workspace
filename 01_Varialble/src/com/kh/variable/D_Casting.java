package com.kh.variable;

import java.util.Scanner;

public class D_Casting {
	/*
	 *  형변환 : 값의 자료형을 바꾸는 것
	 *   - 컴퓨터에서의 값 처리 규칙알 것
	 *   1. 대입연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형 이여야 한다
	 *   => 즉, 같은 자료형에 해당하는 값만 대입 가능
	 *   => 다른 자료형의 값을 대입하고자 한다면 형변환이 필수
	 *   
	 *   자료형 변수명 = (자료형)값;
	 *   
	 *   2. 같은 자료형 끼리만 연산이 가능
	 *   
	 *   값 + 값 => 계산 결과도 같은 자료형으로 나옴
	 *   
	 *   - 형변환 종류
	 *   1. 자동 형변환 => 자동으로 형변환이 이뤄져서 우리가 형변환을 할 필요 없음
	 *   2. 강제(명시적) 형변환 => 자동 형변환이 안돼서 직접 해야함
	 *   
	 *   [표현법] 자료형 변수명 = (자료형)값;
	 *   
	 *   -boolean은 형변환이 불가능
	 *   
	 */
	
	public void autoCasting() {
		/*
		 * 자동형변환 (기본값 double)
		 * -> 값의 범위가 작은 자료형과 큰 자료형 간의 연산 시 
		 * 	  자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리
		 */
		
		//1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = i1;
		
		System.out.println("d1 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		System.out.println("result : " + result);
		
		//2. int(4byte) => long(8byte)
		
		int i3 = 1000;
		long l3 = i3;
		
		//3. float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = f4;
		
		//===== 특이케이스 =====
		//4. long(8byte) => float(4byte)
		//float 실수형 이기 때문에 long보다 표현 가능한 수의 범위가 더 넓어서...
		
		long l5 = 1000000;
		float f5 = 15;
		
		//5. char(2byte) <= test
		
		int nNum = 'D';
		System.out.println("nNum : " + nNum);	
		char ch = 53153;
		System.out.println("ch : " + ch);
				

		
		/*
		 * 각 문자들 마다 고유한 숫자가 지정되어 있기 때문에
		 * 쌍방향으로 형변환 가능
		 * char 변수는 음수값 저장 불가
		 * 0~6555 값의 범위
		 */
				
		// 6. byte간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte b3 = b1 + b2; byte는 연산결과가 무조건 int형으로 저장
			
	}
	
	public void forcecasting() {
		//강제형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		
		// double(8byte) => float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1; //(float)강제현변환한 것
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum;
		//해결 방법1 : 연산 결과를 int형으로 강제 형변환
		int iSum1 = (int)(iNum + dNum);	
		System.out.println("iSum1 : " + iSum1);
		
		//해결 방법2 : double형 값만을 int형으로 강제 형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		
		//즉, 큰 값을 작은 값에 못 넣으니깐, 큰 값을 작은 값으로 강제로 변환하고 출력
		
	}
	
	public void calScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		System.out.print("총점 : " + (int)(kor + eng + math));
		System.out.print("평균 : " + (int)((kor + eng + math)/3));
		
		
	}
}
