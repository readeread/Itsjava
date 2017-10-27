package com823.E;

public class regex {

	public static void main(String[] args) {
		String str="2.345";
		
		System.out.println(str.matches("[^0]\\d{4,10}"));
		System.out.println(str.matches("\\+?\\d+"));
		System.out.println(str.matches("^-\\d+"));
		System.out.println(str.matches("\\d+\\.\\d{1,3}"));
		
		
	}

}
