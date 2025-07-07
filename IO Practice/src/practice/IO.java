package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IO {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {
		int[] num = new int[5];
		
		
		
		
		try {
			System.out.print("숫자 5개를 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("숫자 5개를 입력 : ");
			int num2 = sc.nextInt();
			System.out.print("숫자 5개를 입력 : ");
			int num3 = sc.nextInt();
			System.out.print("숫자 5개를 입력 : ");
			int num4 = sc.nextInt();
			System.out.print("숫자 5개를 입력 : ");
			int num5 = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자로 다시 입력해수제요");
		}catch(RuntimeException e) {
			System.out.println("숫자를 다시 입력해주세요");
		}
			
		}
	
	
	
	
	
}
