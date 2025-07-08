package com.kh.chap02_set.part01_hashSet.run;

import java.util.HashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<String>();
		
		hs1.add("반갑습니다.");
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
		System.out.println(hs1); // 저장 순서 유지 안됨(인덱스 개념이 없어서), 중복된 데이터(동일객체) 보관 불가
		
		HashSet<Student> hs2 = new HashSet<Student>();
		
		hs2.add(new Student("공유", 43, 100));
		hs2.add(new Student("차은우", 26, 85));
		hs2.add(new Student("박보검", 30, 20));
		hs2.add(new Student("공유", 43, 100));
		
		System.out.println(hs2);
		
		
		
	}

}
