package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product p1 = new Product();
		String productId = scan.nextLine();
		String productName = scan.nextLine();
		String productArea = scan.nextLine();
		int price = scan.nextInt();
		double tax = scan.nextDouble();
		
		
		
		Product p2 = new Product();
		p2.setproductId("lgxnote5");
		p2.setProductName("LG스마트폰5");
		p2.setProductArea("경기도 평택");
		p2.setprice(780000);
		p2.setTex(0.7);
		
		
		Product p3 = new Product();
		
		
		
		
	}

}
