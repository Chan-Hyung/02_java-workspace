package com.kh.chap02_string.controller;

public class B_StringMethodTest {
	
	public void method() {
		
		String str1 = "Hello World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//	  문자열에서 전달받은 index위치의 문자 반환
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//	 문자열 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		System.out.println("str2 == str3 : " + str2 == str3);
		// StringPool에서 같은 글자면 같은 주소아닌가?
		// concat 열어보면 안에 new 키워드 => heap에 새로운 주소값으로 따짐
		
		// 3. 문자열.equals(Object obj) : boolean
		// 	  문자열과 전달된 또 다른 문자열 가지고 주소값 비교가 아닌 실제 문자열 가지고 동등비교
		
		System.out.println("str2와 str3가 일치합니까? : " + str2.equals(str3));
		
		// 4. 문자열.contains(CharSequence s) : boolean
		System.out.println("str1에 Hello 문자열이 포함 돼있는가? : " + str1.contains("Hello"));
		System.out.println("str1에 bye 문자열이 포함 돼있는가? : " + str1.contains("bye"));
		
		// 5. 문자열.length() : int
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6. 문자열.substring(int beginIndex) : String
		// 	  문자열.substring(int beginIndex, int endIndex) : String

		//Hello World
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3, 7));
		
		// Quiz
		// Hello World
		// 1. str1 => Worl만 추출 + concat() !를 붙여서 => str0 = Worl!
		// 2. contains 함수를 이용해서 !가 포함돼잇는 여부 추출 => str0에 !가 포함돼있습니까?
		
		String str0 = str1.substring(6,10).concat("!");
		System.out.println(str0);
		System.out.println("str0에 !가 포함돼있습니까? : " + str0.concat("!"));
		
		// 7. 문자열.replace(char oldChar, char newChar) : String
		String str4 = str1.replace('l', 'c');
		System.out.println(str4);
		System.out.println(str1);
		
		// 8. 문자열.toUpperCase() : String
		//	  문자열.toLowerCase() : String
		
		String str5 = str1.toUpperCase();
		System.out.println(str5.toLowerCase());
		
		/*
		System.out.println("계속 하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().toUpperCase().charAt(0)
		
		char ch = sc.nextLine().charAt(0).toUpperCase() => X
		*/
		
		// 9. 문자열.trim() : String
		//	  문자열의 앞 뒤 공백을 제거 시킨 새로운 문자열 반환
		String str6 = "           J  A V A               ";
		System.out.println(str6.trim());
		
		// 10. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[3]);
		
		// 11. String.valueOf(char[] data) : String
		System.out.println(String.valueOf(arr));
		
	}
	
}
