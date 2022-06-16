package com.programme;

public class Factorial {
	public static void main(String[] args) 
	{
		int n=10;
		int temp=1;
		for(int i=1; i<=n; i++)  //1,2,3,4,5
		{
			 temp=temp*i;  // 1,2,6,24,120
			
		}
		System.out.println("Factorial of "+n+" is :"+temp);
		
		
	}
}
