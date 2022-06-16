package com.programme;

import java.util.Scanner;

public class CheckEvenOddCountFromNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num= sc.nextInt();
		int t= num;
		int even_count=0;
		int odd_count=0;
		int temp=0;
		while(t>0)
		{
			int rem= t%10;
			temp=temp*10+rem;
			if(temp%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			t=t/10;
		}
		System.out.println("Even digit : "+even_count+" Odd digit : "+odd_count);
		if(temp==num)
		{
			System.out.println("Its a palindrome number");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
	}
}
