package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public interface Basic {
	// 추상클래스 : 일반필드 + 일반메소드 [+ 추상메소드](생략해도 추상클래스가 될수있음)
	// 인터페이스 : only 상수필드 + 추상메소드
	
	//private int num; X
	
	//인터페이스에서 필드는 무조건 상수 필드만 가능
	/* public static final int NUM = 10; == */ int NUM = 10;
	
	//인터페이스에서 메소드는 무조건 추상메소드만 가능
	/* public abstract void eat(); == */ void eat();
	public abstract void sleep();
	
}
