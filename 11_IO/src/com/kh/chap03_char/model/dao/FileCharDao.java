package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	/*
	 * "문자 기반 스트림"을 가지고 입출력 해보기
	 * 
	 * - 문자스트림 : 데이터로 2바이트 단위로 전송하는 통로다. (넓은 통로)
	 * - 기반스트림 : 외부매체와 직접적으로 연결되는 통로
	 * 
	 * - xxxReader : 입력용 스트림
	 * - xxxWiter : 출력용 스트림
	 * 
	 */
	
	// 프로그램 -----> 파일(출력)
	public void FileSave() {
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력할 수 있는 스트림
		
		FileWriter fw = null;
		
		try {
			// 1.  FileWriter 객체 생성
			fw = new FileWriter("b_char.txt", true ); // 해당 파일이 있으면 연결말, 없으면 만들어주고 연결까지
			// 두번째 인자값이 true이면 파일을 이어서 쓰겠다. ★디폴트값★
			// 두번째 인자값이 false면 파일을 새로 쓰겠다.
			
			// 2. write 메소드 이용해서 데이터를 출력
			fw.write("와! IO 재밌다...ㅎ"); // 한글은 2byte씩이라 한 글자씩 넘어옴(와 / ! / IO / 재 / 밌 / 다 이런식으로)
			fw.write(" ");
			fw.write('a');
			fw.write("\n");
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 3. 스트림 반납
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	// 프로그램 <-------- 파일(입력)
	public void fileRead() {
		//FileReader : 파일로부터 데이터를 2바이트 단위로 입력 받을 수 있는 스트림
		FileReader fr = null;
		
		try {
			// 1. fileReader 객체 생성
			fr = new FileReader("b_char.txt");
			
			// 2. read 메소드 통해서 읽어들임(정수값)
			// 파일의 끝을 만나는 순간 -1 반환
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 3. 스트림 반납
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
