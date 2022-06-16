package com.programme;

import java.util.Scanner;

public class checkAlphabet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch=sc.next().charAt(0);
		
		// USING IF ---ELSE
	/*	if((ch >= 'a' && ch <='z') || (ch>='A' && ch <='Z'))
		{
			System.out.println("Its an alphabet..");
		}
		else
		{
			System.out.println("Its not an alphabet..");
		} */
		
		// USING TERNARY OPERRATION
		
	/*	String s = ((ch >= 'a' && ch <='z') || (ch>='A' && ch <='Z')) ? "Its an alphabet..":"Its not an alphabet..";
		System.out.println(s);  */
		
		// using inbuild method
		
		if(Character.isAlphabetic(ch))
		{
			System.out.println("Its an alphabet..");
		}
		else
		{
			System.out.println("Its not an alphabet..");

		}
		
		
		
	}
}
