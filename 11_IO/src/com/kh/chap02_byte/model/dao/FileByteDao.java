package com.kh.chap02_byte.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//dao(Data Access Object
public class FileByteDao {
	/*
	 *  "바이트 기반 스트림" 가지고 데이터 입출력
	 *  
	 *  - 바이트 스트림 : 데이터를 1byte 단위로 전송하는 통로 (좁은 통로, 한글은 깨지)
	 *  - 기반 스트림 : 외부매체와 직접적으로 연결되는 통로
	 *  
	 *   xxxInputStream : xxx매체로부터 데이터를 입력받는 통로(외부매체로부터 데이터를 읽어오겠다.)
	 *   xxxOutputStream : xxx 매체로부터 데이터를 출력하는 통로 (외부매체로부터 데이터를 내보내겠다.)
	 *   
	 */
	
	// 프로그램 --------> 외부매체(파일) (출력 : 프로그램 상의 데이터를 파일로 내보내기, 즉 파일로 저장)
	public void fileSave() {
		// FileOutputStream : 파일과 직접적으로 연결해서 1바이트 단위로 출력하는 스트림
		
		// 1. 스트림 생성( 통로 만들기)
		// 2. 스트림 데이터를 출력(메소드 활용)
		// 3. 다 사용한 후 스트림 반납(필수)
		
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("a_byte.txt");// 객체생성은 무조건 new 붙이기
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
