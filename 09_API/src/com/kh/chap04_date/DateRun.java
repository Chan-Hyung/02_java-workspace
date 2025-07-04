package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		/*
		 * java.uti.DateRun;
		 * 
		 *
		 *
		 *
		 */
		
		// 기본생성자를 통해 생성 => 현재 날짜 및 시간을 담고있음
		Date date1 = new Date();
		System.out.println(date1);
		
		
		// 재가 원하는 날짜 (2025년 6월 9일)로 셋팅
		
		// 1) 매개변수 생성자를 통해서 생성
		Date date2 = new Date(20025, 6-1, 9);
		System.out.println(date2);
		// 옛날에 만들어진거라 좀 이상함...
		
		// 2) 기본생성자로 생성 후 setter 메소드로 값 변경
		date1.setMonth(6-1);
		date1.setDate(9);
		System.out.println(date1);
		
		// 2025년 6월 9일 10시 40분 12초
		
		// 작성가가 포맷을 적용해서 출력하게 해주는 클래스 이용
		// java.text.SimpleDateFormat 클래스
		
		// 1. sdf라는 객체를 생성(사용자가 원하는 포맷을 매개변수로 넘겨줘야함
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// 2. sdf의 메소드 호출
		String formatDate = sdf.format(date1);
		System.out.println(formatDate);
		
		
		
		
		
	}

}
