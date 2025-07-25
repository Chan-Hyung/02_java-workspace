package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{
	public static final String CPU = "intel"; //클래스 변수 찾아보기
	private String graphic;
	
	public Desktop() {
		
	}
	
	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	public String getGraphic() {
		return graphic;
	}
	
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + graphic;
	}
	
	
}
