package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructionRun {

	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.information());
		
		// 각 필드에 JVM의 초기값이 담겨 있음
		
		// 2. 매개변수 생성자로 객체 생성
		User u2 = new User("user02", "pwd02", "박보검");
		System.out.println(u2.information());
		
		// 3. 매개변수 전체 필드 넣어서 생성자로 객체 생성
		User u3 = new User("user03", "pwd03", "장원영", 20, 'F');
		System.out.println(u3.information());
		
		u3.setUserName("장원일");
		System.out.println(u3.information());
	}

}
