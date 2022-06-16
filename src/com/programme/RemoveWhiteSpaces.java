package com.programme;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String s ="I am   Vishal Raymal ";
		System.out.println("Before removing white spaces : "+ s);
		s= s.replaceAll("\\s", "");
		System.out.println("After removing white spaces : "+ s);

		
	}

}
