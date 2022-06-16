package com.programme;

public class FindAscii {
	public static void main(String[] args)
	{
		char ch= 'a' ;
		int a= ch;
		System.out.println("ASCII VALUE OF CHARACTER '"+ch+"' IS: "+a);
		char ch2= 'A';
		
	/*	int b= Character.getNumericValue(ch2);
		System.out.println("ASCII VALUE OF CHARACTER '"+ch2+"' IS: "+b); */
		
		int b= (int) ch2;
		System.out.println("ASCII VALUE OF CHARACTER '"+ch2+"' IS: "+b); 

		
	}

}
