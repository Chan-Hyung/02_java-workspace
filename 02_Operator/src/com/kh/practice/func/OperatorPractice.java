package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	Scanner scan = new Scanner(System.in);
	public void practice1() {
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		String result = (num > 0) ? "양수입니다." : "양수가 아닙니다.";
		
		System.out.println(result);
	}
	
	public void practice2() {
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		String result = (num >0) ? "양수다" : (num == 0) ? "0이다" : "음수다";
		
		System.out.println(result);
	}
	
	public void practice3() {
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}
	
	public void practice4() {
		System.out.print("인원 수 : ");
		int pp = scan.nextInt();
		System.out.print("사탕 수 : ");
		int cd = scan.nextInt();
		
		int people = cd / pp;
		int candie = cd % pp;
		
		System.out.println("1인당 사탕 개수 : " + people);
		System.out.println("남는 사탕 개수 : " + candie);
		
		
	}
	
	public void practice5() {
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("학년(숫자면) : ");
		int num1 = scan.nextInt();
		System.out.print("반(숫자면) : ");
		int num2 = scan.nextInt();
		System.out.print("번호(숫자면) : ");
		int num3 = scan.nextInt();
		scan.nextLine();
		System.out.print("성별(M/F) : ");
		char gd = scan.nextLine().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = scan.nextDouble();
		
		String gender = (gd == 'M' || gd == 'm') ? "남학생" : (gd == 'F' || gd == 'f') ? "여학생" : "잘못입력했습니다.";
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", num1, num2, num3, name, gender, score);
	}
	
	public void practice6() {
		System.out.print("나이 입력 : ");
		int num1 = scan.nextInt();
		String result;
		
		if(num1 <= 13) {
			result = "어린이";
		}else if(num1 <= 19) {
			result = "청소년";
		}else {
			result = "성인";
		}
		System.out.println(result);
	}
	
	public void practice7() {
		System.out.print("국어 : ");
		int num1 = scan.nextInt();
		System.out.print("영어 : ");
		int num2 = scan.nextInt();
		System.out.print("수학 : ");
		int num3 = scan.nextInt();
		
		int sum = num1 + num2 + num3;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
		if(num1 >= 40 && num2 >= 40 && num3 >= 40 && avg >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}
	
	public void practice8() {
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String num = scan.nextLine();
		char gender = num.charAt(7);
		
		String result;
		if(gender == '1' || gender == '3') {
			result = "남자";
		}else if(gender == '2' || gender == '4') {
			result = "여자";
		}else {
			result = "잘못입력했습니다.";
		}
		
		System.out.println(result);
	}
	
	public void practice9() {
		System.out.print("정수1 입력 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = scan.nextInt();
		
		if(num1 >= num2) {
			System.out.println("조건 오류");
			return;
		}
		
		System.out.print("정수 : ");
		int num3 = scan.nextInt();
		boolean result = (num3 <= num1) || (num3 > num2);
		
		System.out.println(result);
	
	}
	
	public void practice10() {
		System.out.print("입력1 : ");
		int num1 = scan.nextInt();
		System.out.print("입력2 : ");
		int num2 = scan.nextInt();
		System.out.print("입력3 : ");
		int num3 = scan.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
		
		System.out.println(result);
		
		
	}
	
	public void practice11() {
		System.out.print("A사원의 연복 : ");
		int num1 = scan.nextInt();
		System.out.print("B사원의 연복 : ");
		int num2 = scan.nextInt();
		System.out.print("C사원의 연복 : ");
		int num3 = scan.nextInt();
		
		double bouns1 = 0.4;
		double bouns2 = 0.0;
		double bouns3 = 0.15;
		
		double sum1 = num1 + (num1 * bouns1);
		double sum2 = num2 + (num2 * bouns2);
		double sum3 = num3 + (num3 * bouns3);
		
		System.out.printf("A사원 연봉/연봉 : %d/%.1f\n", num1, sum1);
		System.out.println(sum1 >= 3000 ? "3000 이상" : "3000미만");
		
		System.out.printf("B사원 연봉/연봉 : %d/%.1f\n", num2, sum2);
		System.out.println(sum2 >= 3000 ? "3000 이상" : "3000미만");
		
		System.out.printf("C사원 연봉/연봉 : %d/%.1f\n", num3, sum3);
		System.out.println(sum3 >= 3000 ? "3000 이상" : "3000미만");
	
	
	}

}
