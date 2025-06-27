package com.kh.operator;

public class F_Compound {
	/*
	 *  - 복합 대입 연산자
	 * 	  산술연산자와 대입연산자가 결합돼있는 형태 (산술연산 먼저쓰고 대입연산 나중에)
	 * 	  연산 처리 속도가 빨라지므로 사용하는걸 권장
	 * 
	 *    += -= *= /= %=
	 *    
	 *    a = a + 3;  => a += 3; **
	 *    a = a - 3;  => a -= 3;
	 *    a = a * 3;  => a *= 3;
	 *    a = a / 3;  => a /= 3;
	 *    a = a % 3;  => a %= 3;
	 *    
	 */
	
	public void method1() {
		int num = 12;
		
		System.out.println("최초 num : " + num);
		num = num + 3;
		System.out.println("3증가 num : " + num);
		
		num += 3;
		System.out.println("3증가 num : " + num);
		
		num -= 5;
		System.out.println("5를 뺀 num : " + num);
		
		num *= 6;
		System.out.println("6을 곱한 num : " + num);
		
		num /= 2;
		System.out.println("2를 나눈 num : " + num);
		
		num %= 4;
		System.out.println("4를 나눈 나머지 num : " + num);
		
		String str = "Hello";
		//str = str + " World";
		str += " World";
		System.out.println(str);
	}
}
