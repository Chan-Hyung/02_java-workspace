package com.hw1.model.vo;

public class Product {
	
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	public Product() {
		System.out.println();
	}
	
	public Product(String productId, String productName, String productArea, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	
	public String getProductId() {
		return productId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public String getProductArea() {
		return productArea;
	}
	
	public int getPrice() {
		return price;
				 
	}
	
	public double getTex() {
		return tax;
	}
	
	public void setproductId(String productId) {
		this.productId = productId;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	public void setTex(double tax) {
		this.tax = tax;
	}
	
	public String information() {
		return  productId + " " + productName + " " + productArea + " " + price + " " + tax;
	}
	
}
