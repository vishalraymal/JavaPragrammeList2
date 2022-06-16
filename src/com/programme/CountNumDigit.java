package com.programme;

import java.util.Scanner;

public class CountNumDigit {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter Numeric Digit: ");
		int num = scan.nextInt();
		int count=0;
		while(num>0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		System.out.println("The Count Number of Digit: "+count);
	}
	

}
