package com.kh.chap02_ingerit.run;

import com.kh.chap02_ingerit.model.vo.Airplane;
import com.kh.chap02_ingerit.model.vo.Car;
import com.kh.chap02_ingerit.model.vo.Ship;

public class InheritRun {

	public static void main(String[] args) {
		Car c = new Car("벤틀리", 12.5, "세단", 4);
		Ship s = new Ship("낚시배", 3, "어선", 1);
		Airplane a = new Airplane("종이비행기", 0.01, "제트기", 10, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		
		System.out.println("=================================================");
		
		/*
		 * - 상속의 장점
		 * 1) 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * 2) 코드를 공통적으로 관리하기 때문에 코드의 추가나 변경에 용이 (유지보수, 생산성 up)
		 * 
		 * - 상송의 특징
		 * 1) 클래스간의 상속에 잇어서는 다중 상송이 안됨.(단일상속만 가능)
		 * 2) 부모클래스에 정의돼있는 protected 필드는 자식 클래스에서 직접 접근 가능
		 * 3) 자식 객체는 부모클래스에 있는 메소드를 마치 내 것처럼 호출 가능
		 * 		+ 부모 클래스에 있는 메소드가 맘에 안들면 자식 클래스에서 오버라이딩(다시 적어 출력) 가능
		 * 4) 명시되어 있지는 않지만 모든 클래스(사용자가 만든 클래스, 자바에서 제공하는 클래스)는 object 클래스의 후손
		 * => 즉, object 클래스에 있는 메소드를 마음대로 호출 가능 
		 * => 뿐만 아니라 오버라이딩 통해서 재정의도 가능
		 * 
		 */
		
		System.out.println(c.hashCode());
		System.out.println(c.equals(s));
		System.out.println(c/*.toString()*/);
		System.out.println(s);
		System.out.println(a);
		
		
	}

}
