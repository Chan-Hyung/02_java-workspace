package com.kh.chap03_map.part02_properties.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesRun1 {

	public static void main(String[] args) {
		// Properties : Map 계열의 컬렉션 중 하나 => key + value 세트로 저장
		// HashMap과의 차이점 : Properties는 key 값도 String, value 값도 String 이여야만 한다.
		
		Properties prop = new Properties();
		
		/*
		prop.put("다이제", new Snack("초코맛", 1500));
		prop.put("새우깡", new Snack("짠맛", 500));
		
		System.out.println(prop);
		System.out.println(prop.get("다이제"));
		*/
		
		// Properties 사용하는 경우 주로 Properties에 담긴 것들을 파일로 출력 또는 입력 받아 올떄 사용함. ***
		// 즉, properties 에서 제공하는 store(), load() 메소드를 사용하기 위해서
		
		/*
		try {
			prop.store(new FileOutputStream("test.properties"), "properties Test");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		=> ClassCastException 내부적으로 store() 실행시 Properties에 담겨있는 key + value 세트로 String으로 형변환해서 출력함.
		=> value -> 객체타입으로 적었기 때문에 형변환 불가
		*/
		
		// 파일 입출력 하고 싶으면 put이 아닌 다른 메소드를 사용해야한다.
		// 1. setProperty(String key, String value);
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		
		System.out.println(prop); // 저장 순서 유지안되고, key 값 중복시 덮어 씌워짐
		
		// 2. getProperty(String key) : String
		System.out.println(prop.getProperty("List"));
		System.out.println(prop.getProperty("새우깡")); // 존재하지 않는 key값 제시하면 null로 반환
		
		try {
			// 3.store(OutputStream os, String comments) : Properties에 담겨있는 key-value 값들을 파일로 출력
			prop.store(new FileOutputStream("test.properties"), "properties Test");
			
			// 4. storeToXML(OutputStream os, String comments) : Properties에 담겨있는 key-value 값들을 가독성있는 파일로 출력
			prop.storeToXML(new FileOutputStream("test.xml"), "properties Test");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
