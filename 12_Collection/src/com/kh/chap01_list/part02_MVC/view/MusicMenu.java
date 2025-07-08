package com.kh.chap01_list.part02_MVC.view;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.kh.chap01_list.part02_MVC.controller.MusicController;
import com.kh.chap01_list.part02_MVC.model.vo.Music;

/**
 * @author pch
 * @since 2025.07.08
 * @version 1.0
 *
 */
public class MusicMenu {
	private Scanner sc = new Scanner(System.in); //필드에서는 접근 제한자 사용(private)
	private MusicController mc = new MusicController();
	
	// 메인화면 : 프로그램 실행시 처음 보여주는 화면
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n=== Welcome 별밤 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = 0;
			try {
				menu = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("숫자를 입력해주세요");
				return;
			}
			
			sc.nextLine(); // 개행문 때문에
			
			switch(menu){
			case 1 :
				insertMusic();
				break;
			case 2 : 
				selectMusic();
				break;
			case 3 :
				deleteMusic();
				break;
			case 4 :
				searchMusic();
				break;
			case 5 :
				updateMusic();
				break;
			case 0 :
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			
		}
	}
	
	/**
	 * 1. 새로운 곡 추가하는 서브화면(alt + shift + j)
	 */
	public void insertMusic() {
		System.out.println("\n=== 새로운 곡 추가 ===");
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		System.out.print("가수 입력 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		System.out.println("성공적으로 곡이 추가 됐습니다.");
			
	}
	
	/**
	 * 2. 전체 곡 조회용 서브화면
	 */
	public void selectMusic() {
		System.out.println("\n=== 전체 곡 리스트 ===");
		ArrayList<Music> list = mc.selectMusic();
		
		if(list.isEmpty()) {// list가 비어있을 경우
			System.out.println("현재 존재하는 곡이 없습니다.");
		}else {
			for(Music m: list) {//m=list.get(0) => mlist.get(1) => ...
				System.out.println(m);
			}
		}
	}
	
	/**
	 * 3. 특정 곡 삭제 서브화면
	 */
	public void deleteMusic() {
		System.out.println("\n=== 특정 곡 삭제 ===");
		System.out.print("삭제하고자하는 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result ==1) {
			System.out.println("성공적으로 삭제 됐습니다.");
		}else {
			System.out.println("삭제 할 곡을 찾지 못했습니다.");
		}
		
	}
	
	/**
	 * 4. 특정 곡 검색 서브화면
	 */
	public void searchMusic() {
		System.out.println("\n=== 특정 곡 검색 ===");
		/*
		System.out.print("검색할 곡 명(키워드만도 가능) : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(keyword);
		*/
		
		// 심화버전
		System.out.println("1) 제목으로 검색");
		System.out.println("2) 가수명으로 검색");
		System.out.print("메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		System.out.print("검색 키워드 : ");
		String keyword = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(menu, keyword);
		
		System.out.println("\n=== 검색 결과 ===");
		
		if(searchList.isEmpty()) {
			System.out.println("검색된 결과가 없습니다.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		
	}
	
	/**
	 * 5. 특정 곡 수정 서브화면
	 */
	public void updateMusic() {
		System.out.println("\n=== 특정 곡 수정 ===");
		System.out.print("수정 하고자 하는 곡 명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정 내용(가수) : ");
		String upArtist = sc.nextLine();
		System.out.print("수정 내용(곡명) : ");
		String upTitle = sc.nextLine();
		
		int result = mc.updateMusic(title, upArtist, upTitle);
		
		if(result>0) {
			System.out.println("성공적으로 수정됐습니다.");
		}else {
			System.out.println("수정할 곡을 찾지못했습니다.");
		}
			
		
	}
	
	
}
