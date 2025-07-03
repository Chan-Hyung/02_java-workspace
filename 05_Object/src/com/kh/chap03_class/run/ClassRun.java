package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {

	public static void main(String[] args) {
		// 객체 생서 => new
		Person p = new Person();
		System.out.println(p.getId());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		// 생성 후에 필드에 담긴 값을 곧바로 알아보면
		// JVM이 초기화까지 진행해줬음
		
		p.setId("user01");
		p.setPwd("pwd01");
		p.setName("chan");
		p.setAge(25);
		p.setGender('M');
		p.setPhone("01012341234");
		p.setEmail("dkfj@naver.com");
		
		System.out.println("아이디 : " + p.getId());
		System.out.println("나이 : " + p.getAge());
		System.out.println("전번 : " + p.getPhone());
		
		System.out.println("============================");
		System.out.println(p.information());
		
		System.out.println();
		
		
		// 첫번째 방법 : 기본생성자로 객체 생성 후 setter 메소드로 값 설정
		
		Product p1 = new Product();
		p1.setName("갤럭시");
		p1.setPrice(12000);
		p1.setBrand("삼성");
		
		// 두번째 방법 : 매개변수 생성자로 생성과 동시에 값 초기화
		Product p2 = new Product("갤럭시", 12000, "삼성");
		System.out.println(p2.getpName());
		
		
		System.out.println("p2.infor");
	}

}
