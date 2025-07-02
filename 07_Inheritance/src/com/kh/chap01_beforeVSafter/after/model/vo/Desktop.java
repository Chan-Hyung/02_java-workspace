package com.kh.chap01_beforeVSafter.after.model.vo;

//            자식  -> 상속  -> 부모
//            하위     --->    상위
//            후손     --->    조상
//            this    --->    super
public class Desktop extends Product {
	
	private boolean allInOne;
	
	public Desktop() {
	
	}
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand ~ price 주소값이 Product(부모)에 있으니깐 안됨
		// super. 으로 부모에 접근
		
		// 해결 방법 1. 부모클래스에 있는 필드를 protected 접근 제한자로 수정 (잘 안쓰는 방법이라 추천하지 아님)
		/* -> 부모에 있는 private을 protected로 바꿔줌
		super.brand= brand;
		super.pCode= pCode;
		super.pName= pName;
		super.price= price;
		*/
		
		// 해결 방법 2. 부모클래스에 있는 setter 메소드를 활용하기 (private에서 값을 public으로 빼왔기때문에 가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		// 해결 방법 3. 부모 생성자 호출하기
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
		
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 오버라이딩 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	public String information() {
		return super.information() + "allInOne : " + allInOne;
	}
	
}
