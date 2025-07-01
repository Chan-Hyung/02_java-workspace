package com.kh.chap06_method.controller;

public class OverlodingTest {
	
	// 오버로딩 : 한 클래스 내에 같은 메소드명으로 정의할 수 있는 것
	
	public void test() {
		System.out.println("asdf");
	}
	/*
	public void test() {
		System.out.println("fdsa");
	}
	*/
	
	public void test(int a) {
		
	}
	
	public void test(int a, String b) {
		
	}
	
	/*
	public void test(int c, String d) {
		
	}
	오버로딩이 가능하려면 매개변수명이 아니라, 매개변수의 개수와 순서가 다르게 작성돼야함
	*/
	
	public void test(String b, int a) {
	
	}
	
	public void test(String str) {
		
	}
	
	/*
	public int test(String str) {
	
	}
	반환형이랑도 상관 없음
	*/
	
	/*
	protected void test(String str) {
		
	}
	접근제한자랑도 상관 없음
	*/
	
}
