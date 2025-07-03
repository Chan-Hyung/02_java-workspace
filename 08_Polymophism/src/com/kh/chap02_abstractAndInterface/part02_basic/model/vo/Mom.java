package com.kh.chap02_abstractAndInterface.part02_basic.model.vo;

public class Mom extends Person {
	private String babyBirth;
	
	public Mom() {
		
	}
	
	public Mom(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + babyBirth; 
	}

	@Override
	public void eat() {
		// 밥먹으면 몸무게 10 증가
		super.setWeight(super.getWeight() + 10);
		// 밥먹으면 건강점수가 10감소
		//super.setWeight(getHealth(10))
		super.setHealth(super.getHealth() + 10);
		
	}

	@Override
	public void sleep() {
		// 잠자면 건강점수 20증가
		super.setHealth(super.getHealth() + 20);
		
	}

}
