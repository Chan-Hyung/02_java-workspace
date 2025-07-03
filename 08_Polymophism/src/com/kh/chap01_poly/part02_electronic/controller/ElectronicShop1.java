package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicShop1 {
	// 용산 전자상가에 있는 가게
	// 3개 제품(데땁, 노트북, 테블렛)을 진열할 자리부터 만들기
	
	//private int price; => 기본자료형
	
	private Desktop desk; // 내가 만든 자료형
	private NoteBook note;
	private Tablet tab;
	
	// 이건 실제로 자리만 만든거지 객체 생성돼있는건 아님 => 한마디로 자리는 만들었는데 그 안에 값이 없음
	
	/*
	 * public void insert(자료형 변수명){
	 * 		
	 * }
	 */
	
	
	// Desktop 객체를 받아줄 수 있는 메소드
	public void insert(Desktop d) {
		desk = d;
	}
	
	// Note 객체를 받아줄 수 있는 메소드
	public void insert(NoteBook n) {
		note = n;
	}
	
	// Tablet 객체를 받아줄 수 있는 메소드
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 동일한 클래스의 동일한 메소드명으로 여러 개 만들어져 있는 것 => 오버로딩
	// 단, 매개변수는 달라야함.
	// 매개변수 종류, 개수, 순서 이런게 달라야한다.
	
	// 조회할 수 있는 메소드
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
	
}
