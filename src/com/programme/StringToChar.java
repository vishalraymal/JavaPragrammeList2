package com.programme;

import java.util.Arrays;

public class StringToChar {
	public static void main(String[] args) {
		
		// String to Array
		String s = "Vishal";
		char[] ch= s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
		//Array to String
		char[] ch1={'R', 'a', 'y', 'm', 'a', 'l'};
		String s1 = String.valueOf(ch1);
		String s2= new String(ch1);
		System.out.println(s1);
		System.out.println(s2);

		
	}

}
