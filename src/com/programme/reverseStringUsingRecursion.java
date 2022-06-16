package com.programme;

public class reverseStringUsingRecursion {

	public static void main(String[] args) 
	{
		String s= "I Vishal Raymal";
		String revStr = reverse(s);
		System.out.println("Reverse string is: "+ revStr);

	}

	private static String reverse(String s) {
		if(s.isEmpty())
			return s;
		
		return reverse(s.substring(1))+s.charAt(0);
	}

}
