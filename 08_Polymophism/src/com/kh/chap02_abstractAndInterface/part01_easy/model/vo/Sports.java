package com.kh.chap02_abstractAndInterface.part01_easy.model.vo;

public abstract class Sports {
	private int people;
	
	public Sports() {
		
	}
	
	public Sports(int people) {// 머리부
		this.people = people; // 몸통부 => 이게 없다면 완벽한 메소드 X
	}
	
	public int getPeople() {
		return people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public String toString() {
		return " " + people;
	}
	
	// 미완성 된 메소드 => 추상메소드(abstract)
	//public void rule(); => 머리부만 있고 몸통부가 없어서 에러 발생
	public abstract void rule();
	// 미완성된 메소드가 있다는 소리는 이 클래스도 아직 미완성 이라는 이야기
	
	// 언제 완성? => 해당 추상클래스를 상속 받는 자식에서
	
}
