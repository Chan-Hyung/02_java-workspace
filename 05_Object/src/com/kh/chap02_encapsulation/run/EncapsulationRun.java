package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class EncapsulationRun {
	/* 
	 * 7. 캡슐화 과정까지 적용해서 완벽한 클래스
	 * 
	 * - 캡슐화 : 추상화를 통해 정의된 속성들과 기능들을 하나로 묶어 관리하는 기법중 하나
	 * 			클래스에서 가장 중요한 목적은 " 데이터의 접근 제한"을 원칙으로 
	 * 			외부로부터 "데이터의 직접 접근을 막고"
	 * 			대신에 "데이터를 간접적으로나마 처리"할 메소드를 클래스 내부에 작성해서 관리
	 * 
	 * 1) 정보은닉 : private
	 * 				직접 접근을 막기 위해, private 접근제한자를 사용
	 * 
	 */

	public static void main(String[] args) {
		Student cha = new Student();
		
		/*
		cha.name = "차은우";
		cha.age = 20;
		cha.height = 187.5;
		cha.korScore = 100;
		cha.mathScore = 90;
		*/
		
		cha.setName("차은우");
		cha.setAge(20);
		cha.setHeight(187.5);
		cha.setKorScore(100);
		cha.setMathScore(90);
		
		System.out.println(cha.getName());
		System.out.println(cha.getAge());
		System.out.println(cha.getHeight());
		System.out.println(cha.getKorScore());
		System.out.println(cha.getMathScore());
		
		// 수정사항이 생겼을 때
		
		cha.setHeight(190);
		System.out.println(cha.getHeight());
		
	}

}
