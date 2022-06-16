package com.programme;

import java.util.Scanner;

public class IsNumPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num= scan.nextInt();
		int temp=num;
		int rev_num= reverseNo(temp);
		if(rev_num==num)
		{
			System.out.println("It is palindrome number..");
		}
		else
		{
			System.out.println("It is not palindrome number...");
		}
	}
	static int reverseNo(int temp)
	{
		int rev_num=0;
		while(temp>0)
		{
			int rem= temp%10;
			rev_num= rev_num*10+rem;
			temp=temp/10;
			
		}
		return rev_num;
	}
}
