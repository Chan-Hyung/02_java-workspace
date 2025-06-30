package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner scan = new Scanner(System.in);
	
	public void practice1() {
		System.out.print("1. 입력\n" + "2. 수정\n" + "3. 조회\n" + "4. 삭제\n" + "7. 종료\n" + "메뉴 번호를 입력하세요 : ");
		int num1 = scan.nextInt();
		String result;
		
		if(num1 == 1) {
			result = "입력 메뉴입니다.";
		}else if(num1 == 2) {
			result = "수정 메뉴입니다.";
		}else if(num1 == 3) {
			result = "조회 메뉴입니다.";
		}else if(num1 == 4) {
			result = "삭제 메뉴입니다.";
		}else if(num1 == 7) {
			result = "종료 메뉴입니다.";
		}else {
			result = "잘못 입력하셨습니다.";
		}
		
		System.out.println(result);
		
	}
	
	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요(양수만) : ");
		int num1 = scan.nextInt();
		
		String result;
		
		if(num1 <= 0) {
			result = "양수만 입력해주세요";
		}else if(num1 % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		
		System.out.println(result);
		
	}
	
	public void practice3() {
		System.out.print("국어점수 : ");
		int num1 = scan.nextInt();
		System.out.print("영어점수 : ");
		int num2 = scan.nextInt();
		System.out.print("수학점수 : ");
		int num3 = scan.nextInt();
		
		int sum = num1 + num2 + num3;
		double avg = sum / 3;
		
		if(num1 >= 40 && num2 >= 40 && num3 >= 40 && avg >= 60) {
			System.out.println("국어 : " + num1);
			System.out.println("영어 : " + num2);
			System.out.println("수학 : " + num3);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		System.out.print("월(정수로) 입력 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 12 :
		case 1 :
		case 2 : System.out.println(month + "월은 겨울입니다.");
			break;
		case 3 :
		case 4 :
		case 5 : System.out.println(month + "월은 봄입니다.");
			break;
		case 6 :
		case 7 :
		case 8 : System.out.println(month + "월은 여름입니다.");
			break;
		case 9 :
		case 10 :
		case 11 : System.out.println(month + "월은 가을입니다.");
			break;
		default : System.out.println(month + "월은 잘못 입력된 달입니다.");
		}
		
	}
	
	public void practice5() {// ***
		System.out.print("아이디 : ");
		String Id = scan.nextLine();
		System.out.print("비밀번호 : ");
		String Pwd = scan.nextLine();
		
		if(Id.equals("myId")) {
			System.out.println("로그인성공");
			if(Pwd.equals("myPassword12")) {
				System.out.println("로그인성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}			
		}else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
	
	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String member = scan.nextLine();
		
		switch(member) {
		case "관리자" : System.out.print("회원관리, 게시글 관리,");
		case "회원" : System.out.print(" 게시글 작성, 게시글 조회, 댓글 작성,");
		case "비회원" : System.out.print(" 게시글 조회");
		}
	
	}
	
	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double num1 = scan.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double num2 = scan.nextDouble();
		
		double BMI = num2 / (num1 * num1);
		
		//저체중 : 18.5 > BMI
		//정상체중 : 18.5 <= BMI <23
		//과체중 : 23 <= BMI < 25
		//비만 : 25 <= BMI < 30
		//고도 비만 : 30 <= BMI 
		
		if(BMI < 18.5) {
			System.out.println("BMI 지수 : " + BMI + "\n저체중");
		}else if(BMI < 23) {
			System.out.println("BMI 지수 : " + BMI + "\n정상체중");
		}else if(BMI < 25) {
			System.out.println("BMI 지수 : " + BMI + "\n과체중");
		}else if(BMI <30) {
			System.out.println("BMI 지수 : " + BMI + "\n비만");
		}else {
			System.out.println("BMI 지수 : " + BMI + "\n고도 비만");
		}
	}
	
	public void practice8() {
	    System.out.print("피연산자1 입력 : ");
	    double num1 = scan.nextDouble();

	    System.out.print("피연산자2 입력 : ");
	    double num2 = scan.nextDouble();

	    System.out.print("연산자를 입력(+,-,*,/,%) : ");
	    String math = scan.next();

	    double result;

	    if (num1 <= 0 || num2 <= 0) {
	        System.out.println("잘못 입력하였습니다.");
	        return;
	    }

	    switch (math) {
	        case "+":
	            result = num1 + num2;
	            System.out.printf("%.0f + %.0f = %.6f\n", num1, num2, result);
	            break;
	        case "-":
	            result = num1 - num2;
	            System.out.printf("%.0f - %.0f = %.6f\n", num1, num2, result);
	            break;
	        case "*":
	            result = num1 * num2;
	            System.out.printf("%.0f * %.0f = %.6f\n", num1, num2, result);
	            break;
	        case "/":
	            result = num1 / num2;
	            System.out.printf("%.0f / %.0f = %.6f\n", num1, num2, result);
	            break;
	        case "%":
	            result = num1 % num2;
	            System.out.printf("%.0f % %.0f = %.6f\n", num1, num2, result);  // %% 로 출력
	            break;
	        default:
	            System.out.println("잘못 입력하셨습니다.");
	    }
	}

	
	public void practice9() {
		System.out.print("중간 고사 점수 : ");
		double num1 = scan.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double num2 = scan.nextDouble();
		System.out.print("과제 점수 : ");
		double num3 = scan.nextDouble();
		System.out.print("출석 횟수 입력 : ");
		int num4 = scan.nextInt();
		
		System.out.println("========== 결과 ==========");
		
		double score1 = num1 * 0.2;
		double score2 = num2 * 0.3;
		double score3 = num3 * 0.3;
		double score4 = (num4 / 20.0) * 20;
		
		double total = score1 + score2 + score3 + score4;
		
		System.out.printf("중간 고사 점수(20): %.1f\n", score1);
		System.out.printf("기말 고사 점수(30): %.1f\n", score2);
		System.out.printf("과제 점수(30): %.1f\n", score3);
		System.out.printf("출석 점수(20): %.1f\n", score4);
		System.out.printf("총점: %.1f\n", total);
		
		if(num4 < 14) {
			System.out.printf("Fail [출석회수 부족 (%d/20)]\n", num4);
		}else if(total < 70) {
			System.out.println("Fail [점수 미달]");
		}else {
			System.out.println("Pass");
		}
		
	}
	
	public void practice10() {
		while (true) {
            System.out.println("\n=== 실행할 기능을 선택하세요 ===");
            System.out.println("1. 메뉴 출력");
            System.out.println("2. 짝수/홀수");
            System.out.println("3. 합격/불합격");
            System.out.println("4. 계산");
            System.out.println("5. 로그인");
            System.out.println("6. 권한 확인");
            System.out.println("7. BMI");
            System.out.println("8. 계산기");
            System.out.println("9. P/F");
            System.out.println("0. 종료");
            System.out.print("선택 : ");
            int choose = scan.nextInt();

        }
	}

}
