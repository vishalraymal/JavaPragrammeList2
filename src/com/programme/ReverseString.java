package com.programme;

public class ReverseString {
	
	public static void main(String[] args) {
		String os = "lahsiV";
		String rs="";
	
		// using original length without and third char variable
		
	/*	for(int i=os.length()-1; i>=0; i--)
		{
			rs=rs+os.charAt(i);
		}
		System.out.println("The reverse string is: "+rs); */
		
		// using char variable
		char a;
		for(int i=0; i< os.length();i++)
		{
			a= os.charAt(i);
			rs= a+rs;  //  Vishal			
		}
		System.out.println("The reverse string is: "+rs);
	}  
}
