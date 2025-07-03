package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner scan = new Scanner(System.in);
	public void practice1() {
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num1 = scan.nextInt();
		
		if(num1 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		
		for(int i = 1; i<=num1; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void practice2() {
	    int num;

	    do {
	        System.out.print("1 이상의 숫자를 입력하세요 : ");
	        num = scan.nextInt();

	        if (num < 1) {
	            System.out.println("1 이상의 숫자를 입력해주세요.");
	        }
	    } while (num < 1);

	    for (int i = 1; i <= num; i++) {
	        System.out.print(i + " ");
	    }
	}

	
	
	public void practice3() {
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num1 = scan.nextInt();
		
		if(num1 < 0) {
			System.out.println("1 이상의 숫자를 입력해주세요");
			return;
		}
		
		for(int i = num1; i>=1; i--) {
			System.out.print(i + " ");
		}
	}
	
	public void practice4() {
	    int num;

	    do {
	        System.out.print("1 이상의 숫자를 입력하세요 : ");
	        num = scan.nextInt();

	        if (num < 1) {
	            System.out.println("1 이상의 숫자를 입력해주세요.");
	        }
	    } while (num < 1);

	    for (int i = num; i >= 1; i--) {
	        System.out.print(i + " ");
	    }
	}

	
	public void practice5() {
		System.out.print("정수를 하나 입력하세요. : ");
		int num1 = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num1; i++) {
			sum += i;
			if(i < num1) {
				System.out.print(i + " + ");
			}else {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
	}
	
	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = scan.nextInt();
		
		if( num1 < 1 || num2 <1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
		
		int s = Math.min(num1, num2); //**
	    int e = Math.max(num1, num2); //**

	    for (int i = s; i <= e; i++) {
	        System.out.print(i + " ");
	    }
		
	}
	
	public void practice7() {
		System.out.print("첫 번째 숫자 : ");
		int start;
	    start = scan.nextInt();
		System.out.print("두 번째 숫자 : ");
	    int end;
	    end = scan.nextInt();

	    do {
	        if (start < 1 || end < 1) {
	            System.out.println("1 이상의 숫자를 입력해주세요.");
	        }
	    } while (start < 1 || end < 1);

	    if (start > end) {
	        int temp = start;
	        start = end;
	        end = temp;
	    }

	    for (int i = start; i <= end; i++) {
	        System.out.print(i + " ");
	    }
	}

	
	public void practice8() {
		System.out.print(" 숫자 : ");
		int num = scan.nextInt();
		System.out.println("=====" + num + "단=====");
		
		for(int i = 1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num * i);
		}
	}
	
	public void practice9() { // 단마다 ====단===???
		System.out.print(" 숫자 : ");
		int num = scan.nextInt();

		
		if (num < 1 || num > 9) {
	        System.out.println("9 이하 숫자만 입력해주세요.");
	        return;
	    }
		
		for(int i = num; i<10; i++) {
			System.out.println("=====" + num + "단=====");
			for(int j = 1; j<10; j++) {
			System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
		}
		System.out.println();
	}
	
	public void practice10() {
		System.out.print("9 이하의 숫자를 입력해주세요 : ");
        int num;
        num = scan.nextInt();

	    do {
	        if (num > 9) {
	            System.out.println("9 이하의 숫자만 입력해주세요.");
	        }
	    } while (num > 9);

	    for (int i = num; i <= 9; i++) {
	        System.out.println("===== " + i + "단 =====");
	        for (int j = 1; j <= 9; j++) {
	            System.out.println(i + " * " + j + " = " + (i * j));
	        }
	    }
	}
	
	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("공차 : ");
		int num2 = scan.nextInt();
		
		for(int i = 0; i < 10; i++) {
			System.out.print(num1 + (i * num2) + " ");
		}
		System.out.println();
	}
	
	public void practice12() {
	    while (true) {
	        System.out.print("연산자(+,-,*,/,%) : ");
	        String op = scan.next();

	        if (op.equals("exit")) {
	            System.out.println("프로그램을 종료합니다.");
	            break;
	        }

	        if (!(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("%"))) {
	            System.out.println("없는 연산자입니다. 다시 입력해주세요.");
	            continue;
	        }

	        System.out.print("정수1 : ");
	        int num1 = scan.nextInt();

	        System.out.print("정수2 : ");
	        int num2 = scan.nextInt();

	        if ((op.equals("/") || op.equals("%")) && num2 == 0) {
	            System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
	            continue;
	        }

	        switch (op) {
	            case "+":
	                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	                break;
	            case "-":
	                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
	                break;
	            case "*":
	                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
	                break;
	            case "/":
	                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
	                break;
	            case "%":
	                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
	                break;
	        }
	    }
	}

	
	public void practice13() {
	    System.out.print("정수 입력 : ");
	    int num = scan.nextInt();

	    for (int i = 1; i <= num; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}
	
	public void practice14() {
	    System.out.print("정수 입력 : ");
	    int num = scan.nextInt();

	    for (int i = num; i >= 1; i--) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print("*");
	        }
	        System.out.println();
	    }
	}




}
