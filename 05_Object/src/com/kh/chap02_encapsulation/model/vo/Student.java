package com.kh.chap02_encapsulation.model.vo;

public class Student {
	
	// 필드부
	private String name;
	private int age;
	private double height;
	private int korScore;
	private int mathScore;
	
	// 생성자부
	
	// 메소드부
	
	/*
	 * - 메소드
	 * [표현법]
	 * 접근제한자 반환형 메소드명(매개변수){
	 * 		... 실행할 코드
	 * }
	 */
	
	// - setter 메소드
	// 해당 필드에 대입시키고자 하는 값 전달 받아 해당 필드에 대입시켜주는 기능을 하는 메소드
	
	public void setName(String name) {//매개변수 : 작성법
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
	// - getter 메소드
	// 해당 필드에 담긴 값을 반환해주는 역할 수행
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}

	public int getKorScore() {
		return korScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}
	
}
