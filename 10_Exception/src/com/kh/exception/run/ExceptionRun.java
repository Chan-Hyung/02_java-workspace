package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.A_UnckeckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) throws IOException {
		/*
		 * - 에러종류
		 * 1) 시스템 에러 : 컴퓨터의 오작동으로인한 오류 => 스스로 해결 X
		 * 2) 컴파일 에러 : 소스코드 문법상 오류 => 빨간줄로 애초에 오류로 알려줌(개발자의 실수)
		 * 3) 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행 중에 발생하는 에러(개발자의 실수 & 사용자의 실수) => 예외처리
		 * 4) 논리 에러 : 문법적으로도 문제 없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것
		 * 
		 * -> 시스템 에러를 제외한 컴파일 에러, 런타임 에러, 논리 에러와 같은 비교적 덜 심각한 것들, 이런 것들을 "예외" 라고 함 => Exception
		 * 
		 * => 이런 "예외"가 발생했을 경우에 대해서 "처리"하는 방법을 "예외처리" 라고 함.
		 * 
		 * - 예외 처리 목적
		 * 1) 예외처리를 하지 않고 그대로 예외가 발생되는 경우 프로그램이 비정상적으로 종료될 수 있음.
		 * 
		 * - 예외처리 방법
		 * 1) try ~ catch문을 이용 (try ~ with ~ resource)
		 * 
		 * 2) throws를 이용(떠넘기는 방식 == 위임)
		 * 
		 */
		A_UnckeckedException a = new A_UnckeckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		
		B_CheckedException b = new B_CheckedException();
		b.method1(); // 끝까지 떠넘기면 JVM이 알아서 처리 : 권장 X(개발자가 원하는 처리가 아닐 수 있음)

	}

}
