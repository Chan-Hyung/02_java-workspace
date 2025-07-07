package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		/*
		 * 
		 * 메모리는 휘발성
		 * 간단하게 파일(file) 만들어지는 과정
		 * java.io.File 클래스 예외처리 필수
		 *  
		 * File f1 = new File(); -> 객체생성(기본생성자가 없고 매개변수 생성자만 있음)
		 */
			
		try {
			// 1. 경로 지정을 하지 않은 상태는 파일을 생성해줌 => 현재 project 폴더에 파일 생성
			File f1 = new File("test.txt");
			f1.createNewFile(); // 메소드까지 실행해야만 실제 파일이 만들어짐
			
			// 2. 존재하는 폴더에 파일 생성
			File f2 = new File("D:\\test.txt");
			f2.createNewFile();
			
			// 3. 폴더 먼저 만들고 파일까지 만들기
			
			// 폴더 만들기
			File tempFolder = new File("D:\\temp");
			tempFolder.mkdir();
			
			// 파일 만들기
			File f3 = new File("D:\\temp\\test.txt");
			f3.createNewFile();
			
			System.out.println(f1.exists()/*f1파일이 있는지 유무*/);
			System.out.println(new File("ttt.text").exists());
			
			File folder = new File("parent");
			folder.mkdir();
			
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName()); //파일의 이름
			System.out.println("절대경로 : " + file.getAbsolutePath()); //절대경로
			System.out.println("파일용량 : " + file.length()); //파일 용량
			System.out.println("상위폴더 : " + file.getParent()); // 파일이 들어있는 폴더의 이름을 알 수 있음	
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/*
		 * 프로그램 상에 데이터를 외부매체로 출력을 한다거나 외부매체로부터 입력을 받아옴
		 * 반드시 그 외부매체와 통하는 통로를 만들어야함. -> 그 통로가 스티림이라고함.
		 * 
		 * - 스트림(통로)의 특징
		 * 1) 스트림 : 한방향으로 흐름
		 * 2) 단방향 : 입력이면 입력 / 출력이면 출력
		 * 			=> 입력과 출력을 동시다발적으로 하고자하면, 입력용스트림 & 출력용스트림을 따로 만들어야함
		 * 3) 선입선출(FIFO) : 먼저 들어간 데이터가 먼저 나옴.(배운거) => First In first Out - 시간지연(delay)이 될수 있음
		 * 
		 * - 스트림 구분
		 * -> 통로의 사이즈(1byte짜리 통로 / 2byte짜리 통로)
		 * 1) 바이트 스트림 : 1byte짜리만 왔다갔다 할 수 있을 정도의 사이즈(좁은통로) => 입력(InputStream) / 출력(OutputStream)
		 * 2) 문자 스트림 : 2byte 짜리도 왔다갔다 할 수 있을 정도의 사이즈(넓은 통로) => 입력(~~~~Reader , 문자를 출력하는건 배우) / 출력(Witer)
		 * 
		 * - 외부매체 직접 연결하는 유무
		 * 1) 기반스트림 : 외부매체와 직접적으로 연결되는 통로
		 * 2) 보조스트림 : 보조역할만 하는 통로(속도를 빠르게한다거나, 성능을 향상) -> 보조스트림 단독으로 사용 불가, 기반스트림은 반드시 기본적으로 있어야함
		 * 
		 * => 첨푸파일 기능 구현할 때 꼭 필요한 개념
		 * (외부매체를 파일로 함.)
		 * 
		 */
		
		
		
	}

}
