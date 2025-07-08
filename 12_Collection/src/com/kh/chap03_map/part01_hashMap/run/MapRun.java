package com.kh.chap03_map.part01_hashMap.run;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.kh.chap03_map.part01_hashMap.medel.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		/*
		 * 계층 구조
		 * List계열, Set 계열의 클래스들은 Collection을 구현한 클래스
		 * => 객체를 추가하고자 한다면 공통적으로 add 메소드 이용
		 * 
		 * Map 계열은 Collection을 구현한 클래스가 아님
		 * => 객체를 추가하고자 한다면 put 메소드 이용(이때, 키 + 벨류 세트로 담아야함)
		 */
		
		// 1. put(K key, V value) : 컬렉션에 키 벨류 세트로 추가시켜주는 메소드
		hm.put("다이제", new Snack("초코맛", 1500));
		hm.put("칸초", new Snack("단맛", 600));
		hm.put("새우깡", new Snack("짠맛", 500));
		
		hm.put("포테이토칩", new Snack("짠맛", 500));
		
		System.out.println(hm); // 출력 => {키=벨류, 키=벨류, ...}
		// 저장되는 순서 유지 안됨 value 값이 중복되더라도 key값이 중복안되면 상관없음
		
		hm.put("새우깡", new Snack("매운맛", 700));
		// 동일한 키값으로 다시 추가하는 경우 value값이 덮어 씌워짐 => 동일한 키값이 있으면 그냥 바꿈
		
		System.out.println(hm);
		
		// 2. get(Object key) : V => 컬렉션에서 해당 키값을 가지는 value 값을 반환시켜주는 메소드
		Snack s = (Snack)hm.get("다이제");
		System.out.println(s);
		
		// 3. size() : 컬렉션에 담겨있는 객체들의 개수 반환
		System.out.println("몇개 있나? : " + hm.size());
		
		// 4. replace(K key, V value) => 컬렉션에서 해당 키값을 찾아서 다시 전달한 value 값으로 수정시켜주는 메소드
		hm.replace("포테이토칩", new Snack("겁나짠맛", 1000)); // => 포테이토칩안에 있는 값만 바꿈
		System.out.println(hm);
		
		System.out.println("===================================================");
		
		// ArrayList는 안됨
		//ArrayList list = new ArrayList(hm);
		
		// Iterator 반복자
		//Iterator it = hm.iterator();
		
		// => 곧바로 호출이 안됨, map계열에는 해당 메소드 없음
		
		// Map계열 => Set 계열
		
		// 1. keySet() 이용하는 방법
		
		// 1) hm에 있는 key들만 뽑아서 Set에 담기(키들의 집합 형태)
		Set keySet = hm.keySet();
		
		// 2) 1번 과정에서 작업한 keySet을 Iterator에 담기
		Iterator itKey = keySet.iterator();
		
		// 3)반복문 통해서 뽑기
		while(itKey.hasNext()) {
			String key = (String)itKey.next();
			Snack value = (Snack)hm.get(key);
			System.out.println(key + "=" + value);
		}
		
	}

}
