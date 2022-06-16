package com.programme;

import java.util.Scanner;

public class AddTwoInteger {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Entered First number : ");
		int n1=1; 
		int n2=1;
		try
		{
			n1= sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.print("Entered Second number : ");
		try
		{
			n2= sc.nextInt();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		AddTwoInteger.addInt(n1, n2);
	}
	static void addInt(int num1, int num2)
	{
		int sum=num1+num2;
		System.out.println("Sum of two digit : "+sum);
	}
	
}
