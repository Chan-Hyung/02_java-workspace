package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		// Object hashCode() => 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어서 반환
		// Object equals() 	 => 두 객체의 "주소값"을 비교해서 일치하면 true / 일치하지 않으면 false 반환
		
		// String hashCode 	 => "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환
		// String equals() 	 => "실제 담긴 문자열"을 가지고 비교해서 일칠하고 equals()로 비교해서 일치하면 true / 아니면 false 반환
		
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
		
		System.out.println(hs2); // 저장 순서 유지 안됨(인덱스가 없어서) / 중복 제거 안됨 => 동일객체로 판단하고 있어서
		
		// HashSet 이라는 공간에 객체가 추가가 될 때 마다 동일객체 비교
		// 동일객체 판단 기준 : 각 객체마다 hashCode() 호출 결과가 일치하고, equals() 비교시 true일 경우
		
		System.out.println(new Student("공유", 43, 100).hashCode());
		System.out.println(new Student("공유", 43, 100).hashCode());
		
		System.out.println(new Student("공유", 43, 100).equals(new Student("공유", 43, 100)));
	
		// hs2.get(0);  => 인덱스의 개녀도 없고, get메소드 자체가 정의돼있지 않음(한 객체만 뽑아올 수 있음)
		
		// HashSet에 담긴 모든 객체들에 순차적으로 접근
		// 1. for문 사용 가능(단, 향상된 for문 가능)
		for(Student s : hs2) {
			System.out.println(s);
		}
		
		System.out.println("==============================");
		
		// 2. ArrayList에 담아준 당ㅁ에 반복문 돌려가며 접근
		ArrayList<Student> list = new ArrayList<Student>();
		list.addAll(hs2); // .addAll로 넣는방법
		
		ArrayList<Student> list2 = new ArrayList<Student>(hs2);//객체에 아예넣어서 하는거
		for(int i=0; i<list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		// 중복된 데이터가 들어오면 절대 안되는 경우 => set은 거의 안쓰임
		
		// 3. Iterator 반복자를 이용해서 순차적으로 접근
		Iterator<Student> it = hs2.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println(s);
		}
		
	}

}
