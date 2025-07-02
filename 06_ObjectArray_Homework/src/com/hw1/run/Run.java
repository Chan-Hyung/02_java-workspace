package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee[] e = new Employee[3];
		
		e[0] = new Employee();
		e[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		e[2] = new Employee(2, "강말숙", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i<e.length; i++) {
			System.out.println(e[i].information());
		}
		
		System.out.println("===================================================================");
		
		e[0].setEmpName("김말똥");
		e[0].setDept("영업부");
		e[0].setJob("팀장");
		e[0].setAge(30);
		e[0].setGender('M');
		e[0].setSalary(3000000);
		e[0].setBonusPoint(0.2);
		e[0].setPhone("01055559999");
		e[0].setAddress("전라도 광주");
		
		e[1].setDept("기획부");
		e[1].setJob("부장");
		e[1].setSalary(4000000);
		e[1].setBonusPoint(0.3);
		
		for(int i = 0; i+1<e.length; i++) {
			System.out.println(e[i].information());
		}
		
		System.out.println("===================================================================");
		
		int a = (int)((e[0].getSalary() + (e[0].getSalary() * e[0].getBonusPoint())) * 12);
		int b = (int)((e[1].getSalary() + (e[1].getSalary() * e[1].getBonusPoint())) * 12);
		int c = (int)((e[2].getSalary() + (e[2].getSalary() * e[2].getBonusPoint())) * 12);
		
		System.out.println("김말똥의 연봉 : " + a);
		System.out.println("홍길동의 연봉 : " + b);
		System.out.println("강말순의 연봉 : " + c);
		
		System.out.println("===================================================================");
		
		int total = 0;
		for(int i = 0; i<e.length; i++) {
			total = (a + b + c) / 3;
		}
		
		System.out.println("직원들의 연봉의 평균 : " + total);
		
		System.out.println("박찬형__");
		

	}

}
