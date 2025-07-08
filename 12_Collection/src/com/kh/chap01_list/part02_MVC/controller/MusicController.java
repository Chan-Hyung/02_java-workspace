package com.kh.chap01_list.part02_MVC.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_MVC.model.vo.Music;

// 사용장의 요청 처리해주는 클래스
public class MusicController {
	private ArrayList<Music> list = new ArrayList<Music>(); 
	
	{//초기화 블럭
		list.add(new Music("attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "지야코"));
	}
	
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
	}
	
	public ArrayList<Music> selectMusic() {
		return list;
	}
	
	public int deleteMusic(String title) {
		int result = 0;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result = 1;
				break; // 반복문 빠져나옴
			}
			
		}
		// result == 0 (삭제할 곡을 못 참음) || 1(성공적으로 삭제)
		return result;
		
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		ArrayList<Music> searchList = new ArrayList<Music>();
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
		
	}
	
	//심화버전
	public ArrayList<Music> searchMusic(int menu, String keyword){
		ArrayList<Music> searchList = new ArrayList<Music>();
		if(menu == 1) {
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}else {
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					searchList.add(list.get(i));
				}
			}
		}
		return searchList;
		
	}
	
	public int updateMusic(String title, String upArtist, String upTitle) {
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(upTitle);
				list.get(i).setArtist(upArtist);
				result = 1;
				break;
				
			}
			
		}
		return result;
		
	}
	
}	
