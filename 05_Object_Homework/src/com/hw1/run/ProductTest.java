package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		//Product p1 = new Product();
		
		
		Product p1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		
		Product p2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		
		Product p3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(p1.information());
		System.out.println(p2.information());
		System.out.println(p3.information());
		
		System.out.println("=====================================================");
		
		p1.setPrice(1200000);
		p1.setTex(0.05);
		System.out.println(p1.information());
		p2.setPrice(1200000);
		p2.setTex(0.05);
		System.out.println(p2.information());
		p3.setPrice(1200000);
		p3.setTex(0.05);
		System.out.println(p3.information());
		
		System.out.println("=====================================================");
		
		int a = (int)(p1.getPrice() + (p1.getPrice() * p1.getTex()));
		int b = (int)(p2.getPrice() + (p2.getPrice() * p2.getTex()));
		int c = (int)(p3.getPrice() + (p3.getPrice() * p3.getTex()));
		
		System.out.print("상품명 : " + p1.getProductName());
		System.out.println();
		System.out.println("부가세 포함 가격 : " + a );
		System.out.print("상품명 : " + p2.getProductName());
		System.out.println();
		System.out.println("부가세 포함 가격 : " + b );
		System.out.print("상품명 : " + p3.getProductName());
		System.out.println();
		System.out.println("부가세 포함 가격 : " + c );
		
		System.out.println("박찬형");
		
		
	}

}
