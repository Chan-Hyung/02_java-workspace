package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.MusicController;
import model.vo.Music;

public class MusicMenu {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		System.out.println("\n=== 곡 추가 프로그램 ===");
		System.out.println("1. 새로운 곡 추가");
		System.out.println("2. 곡 전체 조회");
		System.out.println("3. 특정 곡 삭제");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 수정");
		System.out.println("0. 프로그램 종료");
		
		System.out.print(">> 메뉴 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1 : 
			insertMusic();
			break;
		case 2 : 
			seeMusic();
			break;
		case 3 : 
			removeMusic();
			break;
		case 4 : 
			searchMusic();
			break;
		case 5 : 
			remakeMusic();
			break;
		case 0 : 
			System.out.println("프로그램을 종료합니다.");
			break;
			
		default:
			System.out.println("숫자를 다시 입력해주세요");
		}
		
		
	}
	
	public void insertMusic(){
		System.out.println("\n=== 새로운 곡 추가 ===");
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String artist = sc.nextLine();
		
		mc.insertMusic(title, artist);
		System.out.println("곡을 추가했습니다.");
	}
	
	public void seeMusic() {
		System.out.println("\n=== 곡 전체 보기 ===");
		ArrayList<Music> list = mc.seeMusic();
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public void removeMusic() {
		System.out.println("\n=== 곡 삭제 ===");
		System.out.print("삭제할 곡 명 : ");
		String title = sc.nextLine();
//		System.out.println("삭제할 가수 명 : ");
//		String artist = sc.nextLine();
		int result = mc.removeMusic(title);
		
		if(result == 1) {
			System.out.println("곡이 삭제됐습니다.");
		}else {
			System.out.println("곡을 찾지못했습니다.");
		}
		
		
		
	}
	
	public void searchMusic() {
		System.out.println("\n=== 곡 검색 ===");
		System.out.print("검색할 곡 : ");
		String search = sc.nextLine();
		
		ArrayList<Music> searchList = mc.searchMusic(search);
		
		System.out.println("검색결과");
		for(int i=0; i<searchList.size(); i++) {
			System.out.println(searchList.get(i));
		}
		
	}
	
	public void remakeMusic() {
		System.out.println("\n=== 곡 수정 ===");
		System.out.print("수정할 곡명 : ");
		String title = sc.nextLine();
		
		System.out.print("수정할 가수명 : ");
		String upartist = sc.nextLine();
		System.out.print("수정할 곡명 : ");
		String uptitle = sc.nextLine();
		
		int result = mc.remakeMusic(title, upartist, title);
		if(result>0) {
			System.out.println("성공적으로 변경하였습니다.");
		}else {
			System.out.println("찾지 못했습니다.");
		}
		
		
		
	}



}
