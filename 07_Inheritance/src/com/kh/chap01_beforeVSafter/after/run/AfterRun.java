package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		/*
		 * - 상송의 장점
		 * 1) 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * 2) 중복된 코드를 별도로 관리하기 때문에 코드의 추가나 변경에 용이
		 * => 프로그램의 생산성과 유지보수에 효율적임
		 */
		
		//Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		
		Desktop d = new Desktop("삼성", "d-01", "ㅁㄹ데스크탑", 2000000, true);

		//Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("엘지", "t-01", "LGTv", 350000000, 85);
		
		//SmartPhone 객체 생성
		// brand, pCode, pName, price, mobilAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰", 13000000,  "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		s.setPrice(800000); //Product에 있는 메소드 호출
		s.setMobileagency("SKT"); //SmartPhone에 있는 메소드 호출
		
		/*
		 * - 상송의 특징
		 * 1) 자식 객체를 가지고 부모클래스에 있는 메소드를 마치 내 것처럼 호출 가능
		 * 2) 부모클래스에 있는 메소드를 오버라이딩을 통해 자식 클래스에서 재정 가능
		 * => 오버라이딩을 하는 순간 자식클래스에 있는 메소드가 우선권을 가짐
		 * 클래스간의 상속은 다중 상속이 불가능 하다. (단일 상속만 가능)
		 */
		
	}

}
