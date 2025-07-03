package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {		

	String input = new String();
	
	
	public TokenController() {
		
	}
	
	public String afterToken(String str) {
	    StringTokenizer st = new StringTokenizer(str, " ");
	    StringBuilder sb = new StringBuilder();

	    while (st.hasMoreTokens()) {
	        sb.append(st.nextToken()); 
	    }

	    return sb.toString(); 
	}

	
	public String firstCap(String input) {
		if( input == null || input.isEmpty()) {
			return input;
		}
		
		char first = Character.toUpperCase(input.charAt(0));
		String rest = input.substring(1);
		return first + rest;
		
		
		
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == one)
				count++;
		}
		
		return count;
	}
	
}
