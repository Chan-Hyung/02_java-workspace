package com.kh.chap05_constructor.model.vo;

public class User {
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/*
	 * - 생성자
	 * [표현법]
	 * public 클래스명(매개변수){
	 * 		
	 * }
	 * 
	 * - 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 유의사항)
	 * 1) 반드시 생성자명은 해당 클래스명과 동일해야한다. (대소문자 안맞추면 오류남)
	 * 2) 반환형이 존재하지 않음
	 * 3) 매개변수 생성자를 명시적으로 작성하게 되면, 기본생성자를 JVM이 자동으로 안 만들어줌.(이런 오류가 발생할 수 있기때문에 만들기)
	 * 
	 */
	
	// 기본 생성자
	public User() {
		// 기본생성자 (매개변수가 없는 생성자)
		System.out.println("asdf");
	}
	
	// 매개변수 생성자
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName; 
		*/
		this(userId, userPwd, userName); // this 생성자
		
		/*
		 * 위와 같이 중복되는 동일한 내용의 생성자가 있을 겨우
		 * this() 생성자 활용 가능
		 * => 같은 클래스 내에 생성자에서 또 다른 생성자 호출 가능
		 * 유의사항) 반드시 첫 줄에 작성
		 */
		
		this.age = age;
		this.gender = gender;
	
	}
	// getter setter
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getGender(){
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " + userName + ", age : " + age + ", gender : " + gender;
	}

}
