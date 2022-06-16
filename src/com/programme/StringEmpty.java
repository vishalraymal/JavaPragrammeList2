package com.programme;

import java.util.Arrays;

public class StringEmpty {
public static void main(String[] args) {
	String s="";
	char[] ch= s.toCharArray();
	System.out.println(Arrays.toString(ch));
	int length=0;
	for(int i =0 ; i<ch.length; i++)
	{
		

		length++;
	}
	if(length>0)
	{
		System.out.println("String is not empty");
		
	}
	else
	{
		System.out.println("String is empty");
	}
	
		
	
	
}
}
