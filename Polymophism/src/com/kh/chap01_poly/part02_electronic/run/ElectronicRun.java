package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicShop2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		// 실행용 클래스는 납품업체라고 생각
		
		// 1. 다형성을 적용 안했을 경우
		/*
		ElectronicShop1 es = new ElectronicShop1();
		
		es.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070"));
		es.insert(new NoteBook("LG", "그램", 2000000, 4));
		es.insert(new Tablet("애플", "아이패드", 800000, false));
		
		Desktop d = es.selectDesktop();
		NoteBook n = es.selectNoteBook();
		Tablet t = es.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 2. 다형성을 적용했을 경우
		ElectronicShop2 se = new ElectronicShop2();
		
		se.insert(new Desktop("Samsung", "데땁", 1200000, "gtx1070"));
		se.insert(new NoteBook("LG", "그램", 2000000, 4));
		se.insert(new Tablet("애플", "아이패드", 800000, false));
		
		Electronic d = se.select(0);
		Electronic n = se.select(1);
		Electronic t = se.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		
		//toString() 할때 부모에 있는 toString()을 실행할 것처럼 보이지만
		// 실제로는 자식객체의 toString()이 실행됨
		// 이유는 동적바인딩
		
	}

}
