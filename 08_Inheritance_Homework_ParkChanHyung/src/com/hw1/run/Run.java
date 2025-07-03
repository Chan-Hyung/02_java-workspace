package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		Person[] p = new Person[3];
		
		p[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		p[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		p[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(int i = 0; i<p.length; i++) {
			System.out.println(p[i].toString());
		}
		
		System.out.println("=====================================================");
		
		Employee[] e = new Employee[9];
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
		int a = 0;
		while(true) {
			
			System.out.print("사원 이름 입력 : ");
			String nam = sc.nextLine();
			System.out.print("사원 나이 입력 : ");
			int ag = sc.nextInt();
			System.out.print("사원 신장 입력 : ");
			double hei = sc.nextDouble();
			System.out.print("사원 몸무게 입력 : ");
			double wei = sc.nextDouble();
			System.out.print("사원 급여 입력 : ");
			int sal = sc.nextInt();
			sc.nextLine();
			System.out.print("사원 부서 입력 : ");
			String dep = sc.nextLine();
			
			e[a] = new Employee(nam, ag, hei, wei, sal, dep);
			a++;
			
			System.out.print("계속 입력하시겠습니까?(y/n) : ");
			String answer = sc.nextLine();
			if(answer.equals("n")) {				
				break;
			}else if(answer.equals("N")) {
				break;
			}else if(answer.equals("Y")) {
				
			}else if(answer.equals("y")) {
				
			}else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
			System.out.println((a+1) + "번째");
			
		}
		for(int i=0; i<a; i++) {
			System.out.println(e[i].toString());
		}

	}
}

	
