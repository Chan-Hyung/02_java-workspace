package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 개념을 적용해서
public class ElectronicShop2 {
	//3개의 제품을 전시할 자리를 마련
	
	// 다형성 : 부모타입 레퍼런스로 다양한 자식 객체를 만들 수 있다
	
	// 부모 : Electronic
	// 자식 : Desktop, NoteBook, Tablet
	
	// parent[] arr = new Parent[4];
	// arr[0] = new Child1();
	// arr[1] = new Child2();
	
	Electronic[] elec = new Electronic[3];
	int count = 0;
	
	// insert 함수 구현
	public void insert(Electronic any) {
		elec[count++] = any;
		// elec[0] = 데땁 => 끝나고 count : 1됨
		// elec[1] = 노트북 => 끝나고 count : 2됨
		// elec[2] = 테블릿 => 끝나고 count : 3됨
		
	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	
}
