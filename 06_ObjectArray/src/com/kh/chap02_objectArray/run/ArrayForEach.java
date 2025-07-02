package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ArrayForEach {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		
		/*
		 * for each문( 향상된 for문)
		 * 배열 또는 컬렉션과 함께 사용
		 * 배열 또는 컬렉션의 0번 인덱스부터 마지막 인덱스까지 순차적으로 모두 접근할 목적일 때
		 * 
		 * [표현식]
		 * for(순차적으로 접근할 값을 담을 변수 선언: 순차적으로 접근할 배열명 또는 컬렉션명){
		 * 
		 * }
		 */
		
		for(int a : arr) { // a = arr[0] => a = arr[1] => a = arr[2]인덱스 값들이 차례로 들거ㅏㅁ
			System.out.println(a);
		}
		Phone[] phones = new Phone[3];
		
		phones[0] = new Phone("폰", "엘지", 1000000, "1");
		phones[1] = new Phone("갤럭시", "삼성", 2000000, "s25");
		phones[2] = new Phone("아이폰", "애플", 3400000, "17pro");
		
		phones[1].setSeries("s25엣지");
		
		int total = 0;
		for(Phone p : phones) {
			total += p.getPrice();
			System.out.println(p.information());
		}
		System.out.println("총합계 : " + total);
		System.out.println("총합계 : " + total / phones.length);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구매하고자 하는 핸드폰 : ");
		String buy = sc.nextLine();
		
		for(Phone p : phones) {
			if(p.getName().equals(buy)) {
				System.out.println("가격 : " + p.getPrice());
			}
		}
	}
	
	

}
