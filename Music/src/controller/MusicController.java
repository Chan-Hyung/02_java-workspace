package controller;

import java.util.ArrayList;

import model.vo.Music;

public class MusicController {
	private ArrayList<Music> list = new ArrayList<Music>();
	
	{
		list.add(new Music("attention", "뉴진스"));
		list.add(new Music("새삥", "지코"));
		list.add(new Music("새삥 말고 헌삥", "지코바"));
	}
	
	public void insertMusic(String title, String artist) {
		list.add(new Music("title", "artist"));
		
	}
	
	public ArrayList<Music> seeMusic() {
		return list;
	}
	
	public int removeMusic(String title) {
		int result = 0;
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals("title")) {
				list.remove(i);
				result = 1;
				break;
			}
		}
		return result;
	}
	
	public ArrayList<Music> searchMusic(String search) {
		ArrayList<Music> searchList = new ArrayList<Music>();
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(search)) {
				searchList.add(list.get(i));
			}
		}
		return searchList;
		
	}
	
	public int remakeMusic(String title, String upartist, String uptitle) {
		int result = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title))
				list.get(i).setTitle(uptitle);
				list.get(i).setArtist(upartist);
				result = 1;
				break;
		}
		return result;
		
	}

}
