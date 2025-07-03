package com.kh.chap02_objectArray.run;

import com.kh.chap02_objectArray.model.vo.Phone;

public class WrongSample {

	public static void main(String[] args) {
		Phone[] arr  = new Phone[3];
		
		arr[0] = new Phone();
		arr[1] = new Phone();
		arr[2] = new Phone();
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		
		// 잘못된 부분
		// 1. NullPointerException : 객체배열의 각 인덱스값이 null인 상태에서 메소드를 호출하려고 했기 때문
		// 				   조치 내용 : 객체배열을 만든 후 각 인덱스 별로 객체 생성해야함
		
		// 2. ArrayIndexOutOfBoundsException : 배열의 적절한 인덱스 범위를 벗어남
		// 									   조건식으로 i<= 배열의 길이 라고 제시 돼있음. 배열의 마지막 인덱스보다 많음
		// 							 조치 내용 : 생성한 인덱스 길이만큼 맞춰줌
	}

}
