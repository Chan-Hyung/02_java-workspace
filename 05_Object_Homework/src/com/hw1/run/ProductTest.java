package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		//Product p1 = new Product();
		
		
		Product p1 = new Product("ssgnote9", "갤럭시노트", "경기도 수원", 960000, 10.0);
		

		Product p2 = new Product();
		p2.setproductId("lgxnote5");
		p2.setProductName("LG스마트폰5");
		p2.setProductArea("경기도 평택");
		p2.setprice(780000);
		p2.setTex(0.7);
		
		Product p3 = new Product();
		p3.setproductId("ktsnote3");
		p3.setProductName("KT스마트폰3");
		p3.setProductArea("서울시 강남");
		p3.setprice(250000);
		p3.setTex(0.3);
		
		System.out.println("============================");
		
		p1.setprice(1200000);
		p1.getPrice();
		
		
		
		
		
	}

}
