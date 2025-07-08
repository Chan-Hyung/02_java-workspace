package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		
		try {
			// 5. load(InputStream is) : 외부 파일을 읽어들여서 prop 객체에 key, 값을 채워넣어주는 메소드
			//prop.load(new FileInputStream("test.properties"));
			
			// 6. loadFromXML(InputStream is)
			prop.loadFromXML(new FileInputStream("test.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
		/*
		 * ~~.properties 를 사용하는 경우
		 * 프로그램상에 필요한 기본 환경설정 관련한 문구를 기술하는 경우
		 * => 모두 문자열 이기 때문에 개발자가 아닌 일발인 관리자가 해당 문서를 파악해서 수정하기 쉽다.
		 * 
		 * ~~.xml 파일의 특징
		 * 프로그래밍 언어들간에 있어서 호환이 쉽다.
		 * 
		 */
		
	}

}
