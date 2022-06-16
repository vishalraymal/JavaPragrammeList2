package com.programme;

import java.util.Scanner;

public class SumOfNaturalNumberUsingRecursion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the digit upto which you will need to find sum: ");
		int n = scan.nextInt();
		int result=sumOfNaturalNo(n);
		System.out.println("Sum is :"+result);
	}

	public static int sumOfNaturalNo(int n) 
	{
		int result=0;
		if(n>0)
		{
			result= n+sumOfNaturalNo(n-1); 
			return result;
		}
		else
		{
			return 0;
		}
		
	}

}
