package com.kh.chap03_class.model.vo;

public class Person {
	// 필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// setter 만들기
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	// getter 7개
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String information() {
		return "id : " + id + ", pwd : " + pwd + ", name : " + name + ", age : " + age + ", gender : " + gender + ", phone : " + phone + ", email : " + email;
	}
	
	
	
}
