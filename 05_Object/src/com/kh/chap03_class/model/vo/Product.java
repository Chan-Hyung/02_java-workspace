package com.kh.chap03_class.model.vo;

public class Product {
	/*
	 * - 필드 == 멤버변수 == 인스턴스 변수
	 * 
	 * [표현법]
	 * 접근제한자 자료형 변수명;
	 * - 객체를 생성하기 위한 일종의 메소드
	 * 
	 * [표현법]
	 * 접근제한자 클래스명(매개변수){
	 * 
	 * }
	 */
	
	// 기본 생성자
	public Product() {
		
	}
	
	// 매개변수 생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	/*
	 * 메소드부
	 * - 기능을 처리하는 담당
	 * 
	 * [표현법]
	 * 접근제한자 반환형 메소드명(매개변수){
	 * 
	 * }
	 */
	
	
	private String pName;
	private int price;
	private String brand;
	
	public void setName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getpName() {
		return pName;
	}
	
	public int price() {
		return price;
	}
	
	public String brand() {
		return brand;
	}
	
	public String infor() {
		return "pname : " + pName + ", price : " + price + ", brand : " + brand;
	}
	
	
}
