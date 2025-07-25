package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product{
	private String mobileAgency;
	
	public SmartPhone() {
		
	}
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileagency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	// 오버라이딩
	public String information() {
		return super.information() + "mobileagency : " + mobileAgency;
	}
	
}
