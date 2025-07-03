package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Baby extends Person{
	public Baby() {
		
	}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	

	@Override
	public void eat() {
		// 밥 먹으면 몸무게가 3증가
		super.setWeight(super.getWeight() + 3);
		// 밥 먹으면 건강점수 1 증가
		super.setHealth(super.getHealth() + 1);
		
	}

	@Override
	public void sleep() {
		// 잠자면 건강점수 3증가
		super.setHealth(super.getHealth() + 3);
		
	}

}
