package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] phones = new Phone[3];
		//phones[0].setName("아이폰"); 아직 인덱스 0번 값에 phone 값이 안들어간것
		
		//기본생성자
		phones[0] = new Phone();
		
		phones[0].setName("폰");
		phones[0].setBrand("엘지");
		phones[0].setPrice(10000);
		phones[0].setSeries("1");
		
		// 매개변수 생성자로 객체 생성 및 초기화
		phones [1] = new Phone("아이폰", "애플", 2000000, "16PRO");
		phones [2] = new Phone("갤럭시", "삼성", 1500000, "s25");
		for(int i=0; i<phones.length; i++) {
			System.out.println(phones[i].information());
		}
		
		
	}

}
